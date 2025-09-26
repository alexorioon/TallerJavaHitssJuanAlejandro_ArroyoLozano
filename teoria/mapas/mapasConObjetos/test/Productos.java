package teoria.mapas.mapasConObjetos.test;

import java.util.LinkedHashMap;
import java.util.Map;

import teoria.mapas.mapasConObjetos.models.Producto;

public class Productos {
  public static void main(String[] args) {
    // LinkedHashMap mantiene el orden de inserción
    Map<String, Producto> inventario = new LinkedHashMap<>();

    // Agregar productos
    inventario.put("P003", new Producto("P003", "Teclado", 4));
    inventario.put("P001", new Producto("P001", "Laptop", 5));
    inventario.put("P002", new Producto("P002", "Mouse", 2));

    // Mostrar inventario
    for (Map.Entry<String, Producto> producto : inventario.entrySet()) {
      System.out.println(producto.getKey() + ": " + producto.getValue());
    }

    // Actualizar un producto
    String clave = "P002";
    if (inventario.containsKey(clave)) {
      inventario.get(clave).setCantidad(10);
      System.out.println("Cantidad: " + inventario.get(clave).getCantidad());
    }

    // Mostrar inventario actualizado
    System.out.println("Después de modificar cantidad en P002");
    for (Map.Entry<String, Producto> producto : inventario.entrySet()) {
      System.out.println(producto.getKey() + " -> " + producto.getValue());
    }

    // Eliminar un producto
    System.out.println("Eliminado el producto Teclado");
    System.out.println("Producto eliminado" + inventario.remove("P003"));

    // Agregar otro producto
    inventario.put("P004", new Producto("P004", "Monitor", 5));
    
    // Mostrar inventario actualizado
    System.out.println("Después de eliminar y agregar productos");
    for (Map.Entry<String, Producto> producto : inventario.entrySet()) {
      System.out.println(producto.getKey() + " -> " + producto.getValue());
    }
  }
}
