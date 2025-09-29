package ejercicios.mapas.inventarioTiendaDeportes.test;

import java.util.*;
import ejercicios.mapas.inventarioTiendaDeportes.classes.Producto;

public class TestMain {
  public static void main(String[] args) {
    LinkedHashMap<String, Producto> inventario = new LinkedHashMap<>();
    inventario.put("P003", new Producto("P003", "Bicicleta", "Deportes", 10));
    inventario.put("P004", new Producto("P004", "Camiseta", "Deportes", 5));
    inventario.put("P005", new Producto("P005", "Pelota", "Deportes", 3));
    inventario.put("P010", new Producto("P010", "Guitarra", "Musica", 20));
    inventario.put("P011", new Producto("P011", "Bajo", "Musica", 15));
    inventario.put("P012", new Producto("P012", "Cajon", "Muebles", 8));
    inventario.put("P013", new Producto("P013", "Laptop", "Electronica", 7));

    Scanner scanner = new Scanner(System.in);
    int opcion = 0;
    while (opcion != 5) {
      System.out.println("Menú:");
      System.out.println("1. Registrar productos en el inventario");
      System.out.println("2. Consultar un producto en O(1) usando su código SKU");
      System.out.println("3. Generar un reporte de productos ordenados por fecha de ingreso");
      System.out.println("4. Generar un reporte de productos ordenados alfabéticamente por nombre");
      System.out.println("5. Salir");
      System.out.print("Ingrese una opción: ");
      opcion = scanner.nextInt();
      scanner.nextLine();

      switch (opcion) {
        case 1 -> {
          registrarProductos(scanner, inventario);
        }
        case 2 -> {
          consultarProducto(scanner, inventario);
        }
        case 3 -> {
          generarReporteOrdenIngreso(scanner, inventario);
        }
        case 4 -> {
          generarReportePorNombre(scanner, inventario);
        }
        case 5 -> {
          System.out.println("Saliendo del programa");
          return;
        }
        default -> {
          System.out.println("Opción no válida. Inténtalo de nuevo.");
        }
      }
    }
    scanner.close();
  }

  // Método para registrar productos (agrega un nuevo producto al inventario)
  public static void registrarProductos(Scanner scanner, LinkedHashMap<String, Producto> inventario) {
    System.out.print("Ingrese el código SKU del producto: ");
    String sku = scanner.nextLine().trim();
    while (sku.isEmpty()) {
      System.out.println("El código SKU no puede estar vacío.");
      System.out.print("Por favor, ingrese nuevamente el código SKU: ");
      sku = scanner.nextLine().trim();
    }

    System.out.print("Ingrese el nombre del producto: ");
    String name = scanner.nextLine();
    while (name.isEmpty()) {
      System.out.println("El nombre no puede estar vacío.");
      System.out.print("Por favor, ingrese nuevamente el nombre: ");
      name = scanner.nextLine().trim();
    }

    System.out.print("Ingrese la categoría del producto: ");
    String categorie = scanner.nextLine().trim();
    while (categorie.isEmpty()) {
      System.out.println("La categoría no puede estar vacía.");
      System.out.print("Por favor, ingrese nuevamente la categoría: ");
      categorie = scanner.nextLine().trim();
    }

    System.out.print("Ingrese el stock disponible: ");
    int stock = 0;
    while (true) {
      try {
        String input = scanner.nextLine().trim();
        stock = Integer.parseInt(input);
        if (stock <= 0) {
          System.out.println("El stock debe ser un número entero positivo.");
        } else {
          break; // Entrada válida
        }
      } catch (NumberFormatException e) {
        System.out.println("El stock debe ser un número entero válido.");
      }
    }

    Producto producto = new Producto(sku, name, categorie, stock);
    inventario.put(sku, producto);
    System.out.println("Producto registrado exitosamente con código: " + sku);
  }

  // Método para consultar un producto por su código SKU (O(1) en LinkedHashMap)
  public static void consultarProducto(Scanner scanner, LinkedHashMap<String, Producto> inventario) {
    System.out.print("Ingrese el código SKU del producto que desea consultar: ");
    String sku = scanner.nextLine().trim();
    while (sku.isEmpty()) {
      System.out.println("El código SKU no puede estar vacío.");
      System.out.print("Por favor, ingrese nuevamente el código SKU: ");
      sku = scanner.nextLine().trim();
    }
    Producto producto = inventario.get(sku);
    if (producto != null) {
      System.out.println("""
          Producto encontrado:
              Código SKU: %s
              Nombre: %s
              Categoría: %s
              Stock: %d""".formatted(
          producto.getSku(), producto.getName(),
          producto.getCategorie(), producto.getStock()));
    } else {
      System.out.println("Producto no encontrado en el inventario.");
    }
  }

  // Método para generar reporte de productos ordenados por orden de ingreso
  // (orden de inserción)
  public static void generarReporteOrdenIngreso(Scanner scanner, LinkedHashMap<String, Producto> inventario) {
    System.out.println("Reporte de productos por orden de ingreso:");
    inventario.forEach((sku, producto) -> {
      System.out.println("Producto: " + producto);
    });
  }

  // Método para generar reporte de productos ordenados alfabéticamente por nombre
  public static void generarReportePorNombre(Scanner scanner, LinkedHashMap<String, Producto> inventario) {
    // Convertimos el LinkedHashMap a una lista de productos para ordenarlos por nombre
    List<Map.Entry<String, Producto>> listaProductos = new ArrayList<>(inventario.entrySet());
    listaProductos.sort((p1, p2) -> {
      return p1.getValue().getName().compareTo(p2.getValue().getName());
    });

    System.out.println("Reporte de productos ordenados alfabéticamente por nombre:");

    listaProductos.forEach(entry -> {
      System.out.println("Producto: " + entry.getValue());
    });
  }
}
