package ejercicios.streams.sistemaRHyEvalDesem.models;

import java.time.LocalDate;

public class Evaluacion {
  private LocalDate anio;
  private int puntaje; // 1 - 100

  public Evaluacion(LocalDate anio, int puntaje) {
    this.anio = anio;
    this.puntaje = puntaje;
  }
  public LocalDate getAnio() {
    return anio;
  }
  public void setAnio(LocalDate anio) {
    this.anio = anio;
  }
  public int getPuntaje() {
    return puntaje;
  }
  public void setPuntaje(int puntaje) {
    this.puntaje = puntaje;
  }

  @Override
  public String toString() {
    return "Evaluacion [anio=" + anio + ", puntaje=" + puntaje + "]";
  }
}
