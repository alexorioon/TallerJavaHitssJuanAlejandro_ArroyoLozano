package teoria.streams.test;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import teoria.streams.modelos.Venta;

public class TestStream {
  public static void main(String[] args) {
    List<Venta> ventas = List.of(
      new Venta("F001", 1000.0, LocalDate.of(2025, 10, 1)),
      new Venta("F002", 2500.0, LocalDate.of(2025, 10, 1)),
      new Venta("F003", 800.0, LocalDate.of(2025, 10, 2)),
      new Venta("F004", 3000.0, LocalDate.of(2025, 10, 3)),
      new Venta("F005", 3500.0, LocalDate.of(2025, 10, 3))
    );
    ventas.forEach(System.out::println);

    // Total vendido
    double totalVendido = ventas.stream()
      .mapToDouble(Venta::getMonto)
      .sum();
    System.out.println("Total vendido: $" + totalVendido);

    // Ventas mayores a 2000
    List<Venta> ventasMayoresA2000 = ventas.stream()
      .filter(venta -> venta.getMonto() > 2000)
      .collect(Collectors.toList());
    System.out.println("Ventas mayores a 2000: " + ventasMayoresA2000);

    // Agrupar ventas por fecha
    Map<LocalDate, List<Venta>> porFechas = ventas.stream()
      .collect(Collectors.groupingBy(Venta::getFecha));
    System.out.println("Ventas por fecha: " + porFechas);

    // Promedio de ventas
    double promedioVentas = ventas.stream()
      .mapToDouble(Venta::getMonto)
      .average()
      .orElse(0);
    System.out.println("Promedio de ventas: $" + promedioVentas);
  }
}
