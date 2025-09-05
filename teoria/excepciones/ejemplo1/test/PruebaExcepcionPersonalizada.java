package teoria.excepciones.ejemplo1.test;

import teoria.excepciones.ejemplo1.exceptions.EdadInvalidaException;

public class PruebaExcepcionPersonalizada {
  private static void validarEdad(int edad) throws EdadInvalidaException {
    if (edad < 18) {
      throw new EdadInvalidaException("La edad mínima es 18 años.");
    }
    System.out.println("Edad válida: " + edad);
  }
  public static void main(String[] args) {
    try {
      validarEdad(15);
    } catch (EdadInvalidaException e) {
      System.out.println("Excepción capturada: " + e.getMessage());
    }
  }
}
