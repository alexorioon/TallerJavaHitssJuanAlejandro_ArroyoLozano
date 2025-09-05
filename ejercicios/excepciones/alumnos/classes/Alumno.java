package ejercicios.excepciones.alumnos.classes;

import ejercicios.excepciones.alumnos.exceptions.EdadInvalidaException;

public class Alumno {

  private int idAlumno;
  private String nombre;
  private int edad;
  private double promedio;

  private static int contador;

  public Alumno(String nombre, int edad, double promedio) throws EdadInvalidaException{
    this.idAlumno = ++contador;
    this.nombre = nombre;
    this.edad = validarEdad(edad);
    this.promedio = promedio;
  }

  public int validarEdad(int edad) throws EdadInvalidaException {
    if (edad < 0) {
      throw new IllegalArgumentException("La edad no puede ser negativa");
    } else if (edad < 18) {
      throw new EdadInvalidaException("La edad debe ser mayor o igual a 18 años");
    }
    return edad;
  }

  @Override
  public String toString() {
    return String.format(
      "{\"idAlumno\":%d, \"nombre\":\"%s\", \"edad\":%d, \"promedio\":%.2f}",
      idAlumno,
      nombre,
      edad,
      promedio
    );
  }
}
