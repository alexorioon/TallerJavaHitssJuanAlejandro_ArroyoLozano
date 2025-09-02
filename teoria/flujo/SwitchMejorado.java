package teoria.flujo;

public class SwitchMejorado {

  public static void main(String[] args) {
    int numero = 3;
    switch (numero) {
      case 1, 2, 3, 4, 5 -> {
        System.out.println("Día laborable");
        System.out.println("xd");
      }
      case 6, 7 -> System.out.println("Fin de semana");
      default -> System.out.println("Ingrese un número entre 1 al 7");
    }

    int a = 1,
      b = 6;
    char operador = '+';
    int resultado = switch (operador) {
      case '+' -> a + b;
      case '-' -> a - b;
      case '/' -> a / b;
      default -> 0;
    };
    System.out.println("Resultado: " + resultado);
  }
}
