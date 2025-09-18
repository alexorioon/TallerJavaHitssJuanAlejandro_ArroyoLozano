package ejercicios.listas.vuelos.classes;

import java.time.LocalDateTime;

public class Vuelo {

  /*
   * clase Vuelo: nombre (string), origen (string), destino (string),
   * fecha de llegada que incluya fecha y hora (java.time.LocalTime, java.time.LocalDate)
   * y cantidad de pasajeros
   */
  private String nombre;
  private String origen;
  private String destino;
  private LocalDateTime fechaLlegada;
  private int cantidadPasajeros;

  public Vuelo(
    String nombre,
    String origen,
    String destino,
    LocalDateTime fechaLlegada,
    int cantidadPasajeros
  ) {
    this.nombre = nombre;
    this.origen = origen;
    this.destino = destino;
    this.fechaLlegada = fechaLlegada;
    this.cantidadPasajeros = cantidadPasajeros;
  }

  public String getNombre() {
    return nombre;
  }

  public String getOrigen() {
    return origen;
  }

  public String getDestino() {
    return destino;
  }

  public LocalDateTime getFechaLlegada() {
    return fechaLlegada;
  }

  public int getCantidadPasajeros() {
    return cantidadPasajeros;
  }

  @Override
  public String toString() {
    return String.format(
      "Vuelo { nombre: %s, origen: %s, destino: %s, fechaLlegada: %s, cantidadPasajeros: %d }",
      nombre, origen, destino, fechaLlegada, cantidadPasajeros
    );
  }
}
