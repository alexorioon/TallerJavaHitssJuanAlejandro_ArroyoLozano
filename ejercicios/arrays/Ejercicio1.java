package ejercicios.arrays;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        /*
         * Leer 10 números enteros desde el teclado para llenar un arreglo de 10
         * elementos.
         * Luego debemos mostrarlos en el siguiente orden:
         * el último, el primero, el penúltimo, el segundo, el antepenúltimo, el
         * tercero,
         * y así sucesivamente.
         */

        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];
        System.out.println("Ingrese 10 números");

        // for para ingresar los números
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }

        // for para imprimir los números
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[numeros.length - 1 - i]);
        }
        entrada.close();
    }
}
