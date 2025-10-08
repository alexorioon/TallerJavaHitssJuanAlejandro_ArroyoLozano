package teoria.streams.sistemaFacturacionStreams.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Factura {
  private int id;
  private Cliente cliente;
  private LocalDate fecha;
  private LocalDate fechaVencimiento;
  private List<Venta> ventas;

  public Factura(int id, Cliente cliente, LocalDate fecha, LocalDate fechaVencimiento) {
    this.id = id;
    this.cliente = cliente;
    this.fecha = fecha;
    this.fechaVencimiento = fechaVencimiento;
    this.ventas = new ArrayList<>();
  }

  public int getId() {
    return id;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public LocalDate getFecha() {
    return fecha;
  }

  public LocalDate getFechaVencimiento() {
    return fechaVencimiento;
  }

  public List<Venta> getVentas() {
    return ventas;
  }

  public void agregarVentas(Venta venta) {
    ventas.add(venta);
  }

  public double getTotal() {
    return ventas.stream()
        // .mapToDouble(v -> v.getTotal()) // Se puede con esta lambda
        .mapToDouble(Venta::getTotal)
        .sum();
  }

  public boolean estaVencida() {
    return fechaVencimiento.isBefore(LocalDate.now());
  }

  @Override
  public String toString() {
    return "Factura #" + id + " - Cliente:" + cliente.getNombre() +
        "\nFecha:" + fecha + " - Total: $" + getTotal();
  }
}
