package ejercicios.ciclos;

import java.util.Scanner;

public class Ejercicio2For {

  public static void main(String[] args) {
    /*
     * Crear una clase con el método main donde el desafío es buscar elnumero menor de
     * mínimo 10 valores enteros, usando la clase Scanner ingresar la cantidad de números a
     * comparar, luego utilizando una sentencia for iterar el numero de veces (ingresado) para
     * pedir el numero entero, entonces se requiere:
     * Calcular el menor número e imprimir el valor.
     * Si el menor número es menor que 10, imprimir "El número menor es menor que 10!". si no,
     * imprimir " el numero menor es igual o mayor que 10!".
     */
    Scanner entrada = new Scanner(System.in);
    int num,
      menor = 0,
      vueltas;

    System.out.print("¿Cuántos números va a ingresar? (mínimo 10): ");
    vueltas = entrada.nextInt();
    while (vueltas < 10) {
      System.out.print("Debe ingresar al menos 10 números. Intente de nuevo: ");
      vueltas = entrada.nextInt();
    }

    for (int i = 1; i <= vueltas; i++) {
      System.out.print("Ingrese número " + i + ": ");
      num = entrada.nextInt();

      if (i == 1) menor = num;
      else if (num < menor) menor = num;
    }

    System.out.println("El número menor es: " + menor);
    if (menor < 10) System.out.println("El número menor es menor que 10!");
    else System.out.println("El número menor es igual o mayor que 10!");

    entrada.close();
  }
}
