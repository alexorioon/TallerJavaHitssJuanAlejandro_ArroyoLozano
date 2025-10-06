package ejercicios.interfacesFuncionales.ventaSupermercado.service;

import ejercicios.interfacesFuncionales.ventaSupermercado.classes.Cliente;
import ejercicios.interfacesFuncionales.ventaSupermercado.classes.Producto;
import ejercicios.interfacesFuncionales.ventaSupermercado.classes.Venta;

import java.util.List;
import java.util.Random;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class SupermercadoService {

  // 1. Filtrar productos con stock bajo (stock < 5)
  public List<Producto> filtrarProductosStockBajo(List<Producto> productos) {
    Predicate<Producto> stockBajo = p -> p.getStock() < 5;
    return productos.stream().filter(stockBajo).collect(Collectors.toList());
  }

  // 2. Calcular el total de una venta
  public double calcularTotalVenta(List<Producto> productos) {
    Function<List<Producto>, Double> calculadorTotal = lista -> 
      lista.stream().mapToDouble(Producto::getPrecio).sum();
    return calculadorTotal.apply(productos);
  }

  // 3. Imprimir detalles de venta
  public void imprimirDetallesVenta(Venta venta) {
    Consumer<Venta> imprimirDetalles = v -> {
      System.out.println("=== DETALLES DE VENTA ===");
      System.out.println("ID: " + v.getId());
      System.out.println("Cliente: " + v.getCliente().getNombre());
      System.out.println("Empleado: " + v.getEmpleado().getNombre());
      System.out.println("Productos:");
      v.getProductos().forEach(p -> System.out.println(" - " + p.getNombre() + ": $" + p.getPrecio()));
      System.out.println("Total: $" + v.getTotal());
    };
    // Encadenar los consumers
    imprimirDetalles.accept(venta);
  }

  // 4. Generar producto de muestra
  public Producto generarProductoMuestra() {
    Random rand = new Random();
    String[] nombres = { "Leche", "Pan", "Huevos", "Arroz", "Aceite, Azúcar", "Café", "Té", "Jugo", "Carne" };
    Supplier<Producto> productoSupplier = () -> {
      int id = rand.nextInt(1000);
      String nombre = nombres[rand.nextInt(nombres.length)];
      double precio = 10 + rand.nextDouble() * 90;
      int stock = rand.nextInt(10);
      return new Producto(id, nombre, precio, stock);
    };
    return productoSupplier.get();
  }

  // 5. Aplicar descuento del 10%
  public double aplicarDescuento(double precio) {
    UnaryOperator<Double> descuento = p -> p * 0.9;
    return descuento.apply(precio);
  }

  // 6. Comparar productos y devolver el más caro
  public Producto obtenerProductoMasCaro(Producto p1, Producto p2) {
    BiPredicate<Producto, Producto> esMasCaro = (prod1, prod2) -> prod1.getPrecio() > prod2.getPrecio();
    return esMasCaro.test(p1, p2) ? p1 : p2;
  }

  // 7. Verificar si cliente puede acceder a descuento
  public boolean puedeAccederDescuento(Cliente cliente, double totalCompra) {
    Predicate<Cliente> esVIP = c -> "VIP".equalsIgnoreCase(c.getTipo());
    Predicate<Double> compraAlta = total -> total > 1000;
    return esVIP.test(cliente) && compraAlta.test(totalCompra);
  }

  // 8. Generar ticket de venta
  public String generarTicketVenta(Venta venta) {
    StringBuilder ticket = new StringBuilder();

    Consumer<StringBuilder> generarTicket = sb -> {
      // Encabezado
      sb.append("====== TICKET DE VENTA ======\n")
          .append("Venta #").append(venta.getId()).append("\n")
          .append("Cliente: ").append(venta.getCliente().getNombre()).append("\n")
          .append("Atendido por: ").append(venta.getEmpleado().getNombre()).append("\n")
          .append("-------------------------\n")
          // Productos
          .append("PRODUCTOS:\n");
      venta.getProductos().forEach(p -> sb.append(String.format("%s: $%.2f\n", p.getNombre(), p.getPrecio())));

      // Total y descuento
      sb.append("-------------------------\n")
          .append(String.format("TOTAL: $%.2f\n", venta.getTotal()));
      if (puedeAccederDescuento(venta.getCliente(), venta.getTotal())) {
        double totalConDescuento = aplicarDescuento(venta.getTotal());
        sb.append(String.format("TOTAL CON DESCUENTO VIP: $%.2f\n", totalConDescuento));
      }
      sb.append("=========================\n");
    };
    generarTicket.accept(ticket);
    return ticket.toString();
  }

  // 9. Notificar al cliente
  public void notificarCliente(Venta venta) {
    Consumer<Venta> notificador = v -> {
      System.out.println("Estimado/a " + v.getCliente().getNombre() + ",");
      System.out.println("Su compra (ID: " + v.getId() + ") ha sido procesada por " + v.getEmpleado().getNombre());
      System.out.println("Total de la compra: $" + v.getTotal());
      System.out.println("¡Gracias por su preferencia!");
    };
    notificador.accept(venta);
  }
}
