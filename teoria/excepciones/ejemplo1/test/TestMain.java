package teoria.excepciones.ejemplo1.test;

public class TestMain {
  public static void main(String[] args) {
    try {
      int resultado = 10 / 2;
      System.out.println("Resultado: " + resultado);
    } catch (ArithmeticException e) {
      //e.printStackTrace();
      System.out.println("ERROR: No se puede dividir entre cero.");
    } finally {
      System.out.println("Ejecución de la excepción...");
    }
    System.out.println("Continua el flujo del programa...");
  }
}
