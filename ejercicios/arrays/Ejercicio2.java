package ejercicios.arrays;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        /*
         * imprimir la cantidad de veces que aparece en el arreglo.
         * Por ejemplo, para el arreglo: [1, 2, 3, 3, 4, 5, 5, 5, 6, 7]
         * Como resultado debería imprimir lo siguiente:
         * 1. La mayor ocurrencias es: 3
         * 2. El elemento que mas se repite es: 5
         * En el ejemplo, el elemento que más se repite en el arreglo es el número 5 con una
         * ocurrencia de 3 veces.

         Para la tarea se debe crear un arreglo con 10 elementos (enteros en el rango de 1 a 9). 
         Escriba un programa que imprima el numero que tiene más ocurrencias en el arreglo y también
         */
        int[] numeros = new int[10];
        int[] ocurrencias = new int[10]; // Para contar ocurrencias de números del 1 al 9
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese 10 números (rango del 1 al 9)");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i+1) +": ");
            numeros[i] = entrada.nextInt();
        }
        // Contar ocurrencias de cada número
        for (int i = 0; i < numeros.length; i++)
            if (numeros[i] >= 1 && numeros[i] <= 9)
                ocurrencias[numeros[i]]++;
        int maxOcurrencias = 0;
        int numeroMasRepetido = 0;
        // Encontrar el número con más ocurrencias
        for (int i = 1; i < ocurrencias.length; i++) {
            if (ocurrencias[i] > maxOcurrencias) {
                maxOcurrencias = ocurrencias[i];
                numeroMasRepetido = i;
            }
        }
        System.out.println("La mayor ocurrencias es: " + maxOcurrencias);
        System.out.println("El elemento que más se repite es: " + numeroMasRepetido);
        entrada.close();
    }
}
