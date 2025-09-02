package teoria.settersgetters.automovil.clases;

public class Calculadora {

  //  acceso tipoDeRetorno nombreMetodo(tipoParametro nombreParametro [, tipoParametro nombreParametro])
  public int suma(int a, int b) {
    return a + b;
  }

  public double suma(double a, double b) {
    return a + b;
  }

  public int suma(int a, int b, int c) {
    return a + b + c;
  }

  public void saludar(String nombre) {
    System.out.println("Hola " + nombre + " xd");
  }
}
