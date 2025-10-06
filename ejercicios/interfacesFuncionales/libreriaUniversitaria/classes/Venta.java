package ejercicios.interfacesFuncionales.libreriaUniversitaria.classes;

import java.time.LocalDate;

public class Venta {
  private Cliente cliente;
  private LocalDate date;
  private Libro libro;

  public Venta(Cliente cliente, LocalDate date, Libro libro) {
    this.cliente = cliente;
    this.date = date;
    this.libro = libro;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public Libro getLibro() {
    return libro;
  }

  public LocalDate getDate() {
    return date;
  }
}
