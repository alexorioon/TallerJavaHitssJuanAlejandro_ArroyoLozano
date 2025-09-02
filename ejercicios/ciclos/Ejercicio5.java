package ejercicios.ciclos;

import java.util.Scanner;

public class Ejercicio5 {

  public static void main(String[] args) {
    /*
     * Un restaurante necesita un programa que permita al cajero: Mostrar un menú de opciones:
     * 1. Registrar un pedido.
     * 2. Mostrar el total de ventas.
     * 3. Salir del sistema.
     * Cada pedido se registra ingresando el precio.
     * El programa debe seguir mostrando el menú hasta que el cajero elija Salir.
     * Validar que el precio sea positivo antes de sumarlo a las ventas
     */
    int opcion;
    double precio,
      total = 0;
    boolean stay = true;
    Scanner entrada = new Scanner(System.in);
    do {
      System.out.println("\n======= Menú =======");
      System.out.println("1. Registrar un pedido");
      System.out.println("2. Mostrar el total de ventas.");
      System.out.println("3. Salir del sistema.");
      System.out.print("Elija una opción: ");
      opcion = entrada.nextInt();
      switch (opcion) {
        case 1 -> {
          System.out.print("INGRESE EL PRECIO: ");
          precio = entrada.nextDouble();
          if (precio > 0) {
            total += precio;
            System.out.println("\nREGISTRADO CORRECTAMENTE! :D");
          } else System.out.println("\nNO INGRESADO! (VALOR INVÁLIDO)");
        }
        case 2 -> System.out.printf("%nTOTAL: %.2f%n", total);
        case 3 -> stay = false;
        default -> System.out.println("\nOPCIÓN INCORRECTA!!");
      }
    } while (stay);
    entrada.close();
  }
}
