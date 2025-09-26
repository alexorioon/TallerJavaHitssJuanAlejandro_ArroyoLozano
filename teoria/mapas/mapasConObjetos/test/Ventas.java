package teoria.mapas.mapasConObjetos.test;

import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;

import teoria.mapas.mapasConObjetos.models.Venta;

public class Ventas {
  public static void main(String[] args) {
    // TreeMap mantiene un orden natural de las claves (LocalDate)
    TreeMap<LocalDate, Venta> ventas = new TreeMap<>();
    ventas.put(LocalDate.of(2025, 9, 12),
      new Venta(1, "Alex", 1500));
    ventas.put(LocalDate.of(2025, 9, 10),
      new Venta(2, "Bob", 2500));
    ventas.put(LocalDate.of(2025, 9, 11),
      new Venta(3, "Charlie", 1800));

    // Mostrar ventas
    for (Map.Entry<LocalDate, Venta> venta : ventas.entrySet()) {
      System.out.println(venta.getKey() + " -> " + venta.getValue());
    }

    // Obtener la primera y última venta
    // System.out.println("Primera venta registrada");
    // System.out.println(ventas.firstEntry()); // Solamente con TreeMap

    // Ventas anteriores a una fecha
    System.out.println("Vetas antes del 2025-09-12");
    for (Map.Entry<LocalDate, Venta> ventaAnterior : ventas.headMap(LocalDate.of(2025, 9, 12)).entrySet()) {
      System.out.println(ventaAnterior.getKey() + " -> " + ventaAnterior.getValue());
    }
  }
}
