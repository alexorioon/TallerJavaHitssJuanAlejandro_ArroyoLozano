package ejercicios.ciclos;

import java.util.Scanner;

public class Ejercicio3Notas {

  /*
   * Pedir 20 notas finales de alumnos en una escala de 1 a 10, manejar decimales en las notas
   * (double). Mostrar el promedio de las notas mayores o iguales a 6, promedio de notas
   * inferiores a 6 y la cantidad de notas iguales a 1, además mostrar el promedio total.
   *
   * Ayuda: usar un bucle for que itere hasta 20 (notas) y dentro del ciclo pedir las notas una a una
   * para realizar los cálculos (contadores, sumas).
   *
   * Opcional: si una de las notas ingresadas es 0 debe salirse del ciclo for y mostrar un mensaje
   * de error finalizando el programa.
   */
  @SuppressWarnings("resource")
  public static void main(String[] args) {
    final int CANTIDAD_NOTAS = 20;
    Scanner entrada = new Scanner(System.in);
    double nota,
      notas = 0,
      notasMayorA6 = 0,
      notasMenorA6 = 0;
    int cantIgualA1 = 0,
      cantMayorOIgualA6 = 0,
      cantMenorA6 = 0;
    for (int i = 1; i <= CANTIDAD_NOTAS; i++) {
      System.out.print("Ingrese la nota " + i + ": ");
      nota = entrada.nextDouble();
      if (nota >= 1 && nota <= 10) {
        notas += nota;
        if (nota >= 6) {
          notasMayorA6 += nota;
          cantMayorOIgualA6 += 1;
        } else {
          notasMenorA6 += nota;
          cantMenorA6 += 1;
        }
        if (nota == 1) cantIgualA1 += 1;
      } else {
        System.out.println("ERROR! xd");
        return;
      }
    }
    System.out.printf(
      "%nPromedio Mayor o Igual a 6 (%.2f/%d): %.2f%n",
      notasMayorA6,
      cantMayorOIgualA6,
      notasMayorA6 / cantMayorOIgualA6
    );
    System.out.printf(
      "Promedio Menor a 6 (%.2f/%d): %.2f%n",
      notasMenorA6,
      cantMenorA6,
      notasMenorA6 / cantMenorA6
    );
    System.out.println("Cantidad igual a 1: " + cantIgualA1);
    System.out.printf(
      "Promedio general (%.2f/%d): %.2f",
      notas,
      CANTIDAD_NOTAS,
      notas / CANTIDAD_NOTAS
    );
    entrada.close();
  }
}
