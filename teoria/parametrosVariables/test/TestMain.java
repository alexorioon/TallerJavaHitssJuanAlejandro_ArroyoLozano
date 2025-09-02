package teoria.parametrosVariables.test;

public class TestMain {

  //  Método con número variable de argumentos
  //  tipoDato ... nombreParametro
  private static int suma(int... numeros) {
    //  0, 1, 2, n
    int suma = 0;
    for (int numero : numeros) {
      suma += numero;
    }
    return suma;
  }

  public static void main(String[] args) {
    System.out.println("Suma cero valores: " + suma());
    System.out.println("Suma un valor: " + suma(10));
    System.out.println("Suma cinco valores: " + suma(4, 6, 2, 8, 9));
  }
}
