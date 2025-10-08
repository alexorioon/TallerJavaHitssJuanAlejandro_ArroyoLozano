package teoria.streams.sistemaFacturacionStreams.test;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import teoria.streams.sistemaFacturacionStreams.models.Cliente;
import teoria.streams.sistemaFacturacionStreams.models.Factura;
import teoria.streams.sistemaFacturacionStreams.models.Producto;
import teoria.streams.sistemaFacturacionStreams.models.Venta;

public class PruebaFacturacion {
  public static void main(String[] args) {
    /*
    * 
    */

    // Clientes
    Cliente c1 = new Cliente(1, "Ana", "ana@empresa.com");
    Cliente c2 = new Cliente(2, "Maria", "maria@empresa.com");
    Cliente c3 = new Cliente(3, "Pedro", "pedro@empresa.com");
    Cliente c4 = new Cliente(4, "Luis", "luis@empresa.com");

    // Productos
    Producto p1 = new Producto(1, "Laptop", 12000.0);
    Producto p2 = new Producto(2, "Mouse", 250.0);
    Producto p3 = new Producto(3, "Teclado", 300.0);
    Producto p4 = new Producto(4, "Monitor", 2500.0);
    Producto p5 = new Producto(5, "Celular", 8000.0);

    // Facturas y ventas
    Factura f1 = new Factura(1, c1,
        LocalDate.of(2025, 10, 1),
        LocalDate.of(2025, 10, 6));
    f1.agregarVentas(new Venta(p1, 2));
    f1.agregarVentas(new Venta(p2, 3));

    Factura f2 = new Factura(2, c2,
        LocalDate.of(2025, 10, 2),
        LocalDate.of(2025, 10, 7));
    f2.agregarVentas(new Venta(p3, 5));
    f2.agregarVentas(new Venta(p4, 2));
    f2.agregarVentas(new Venta(p1, 1));

    Factura f3 = new Factura(3, c3,
        LocalDate.of(2025, 10, 4),
        LocalDate.of(2025, 10, 10));
    f3.agregarVentas(new Venta(p5, 3));
    f3.agregarVentas(new Venta(p3, 5));
    f3.agregarVentas(new Venta(p2, 1));

    Factura f4 = new Factura(4, c4,
        LocalDate.of(2025, 10, 5),
        LocalDate.of(2025, 10, 12));
    f4.agregarVentas(new Venta(p4, 3));

    Factura f5 = new Factura(5, c1,
        LocalDate.of(2025, 10, 6),
        LocalDate.of(2025, 10, 12));
    f5.agregarVentas(new Venta(p4, 3));

    // Lista de facturas
    List<Factura> facturas = List.of(f1, f2, f3, f4, f5);

    // Reportes
    // 1. Total de ventas por cliente
    /* System.out.println("Factura 1: " + f1.getTotal());
    System.out.println("Factura 5: " + f5.getTotal()); */
    System.out.println("==============Total de ventas por cliente==============");
    facturas.stream()
      .collect(Collectors.groupingBy(Factura::getCliente,
        Collectors.summingDouble(Factura::getTotal)))
      .forEach((cliente, total) -> System.out.println("Cliente: " + cliente.getNombre() + ", Total: $" + total));

    // 2. Ventas en un rango de fechas
    System.out.println("\n==============Ventas en un rango de fechas==============");
    LocalDate inicio = LocalDate.of(2025, 10, 1);
    LocalDate fin = LocalDate.of(2025, 10, 5);
    double suma = facturas.stream()
      .filter(f -> f.getFecha().isAfter(inicio) && f.getFecha().isBefore(fin))
      .mapToDouble(Factura::getTotal)
      .sum();
    System.out.println("Total: $" + suma);

    // 3. Top productos más vendidos
    System.out.println("\n==============Top productos más vendidos==============");
    facturas.stream()
      .flatMap(f -> f.getVentas().stream())
      .collect(Collectors.groupingBy(Venta::getProducto,
        Collectors.summingInt(Venta::getCantidad)))
      .entrySet().stream()
      .sorted(Map.Entry.<Producto, Integer>comparingByValue().reversed())
      .limit(3)
      .forEach(entry -> System.out.println(entry.getKey().getNombre() + " -> " + entry.getValue()));
    
    // 4. Clientes con facturas vencidas
    System.out.println("\n==============Clientes con facturas vencidas==============");
    facturas.stream().filter(Factura::estaVencida).forEach(System.out::println);

    // 5. Validar políticas (¿Todos los clientes tiene email corporativo?)
    System.out.println("\n==============Validación de correos corporativos==============");
    /* boolean todosCorporativos = facturas.stream()
      .allMatch(f -> f.getCliente().getEmail().contains("@empresa.com")); */
    boolean todosCorporativos = facturas.stream()
      .map(Factura::getCliente)
      .allMatch(c -> c.getEmail().endsWith("@empresa.com"));
    System.out.println("¿Todos los clientes tienen email corporativo?: " + todosCorporativos);
  }
}
