package ejercicios.arrays;

import java.util.Scanner;

public class Ejercicio3Matrices {
    public static void main(String[] args) {
        /*
         * Escribir un programa que imprima una X construida a base de la letra X en las
         * diagonales de
         * la matriz y utilizar el carácter guion bajo como relleno.
         * El tamaño de la X se basa en una variable n que indicará el tamaño de la
         * letra para imprimir
         * en una matriz de n x n.
         * El carácter "X" en mayúscula y el guion bajo "_" para los espacios.
         * Por ejemplo para n=5 se obtiene:
         * X___X
         * _X_X_
         * __X__
         * _X_X_
         * X___X
         * Por ejemplo para n=6 se obtiene:
         * 
         * X____X
         * _X__X_
         * __XX__
         * __XX__
         * _X__X_
         * X____X
         * Si n es igual a cero imprimir "ERROR" y finalizar la ejecución del programa.
         */
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el tamaño: ");
        int n = entrada.nextInt();
        if (n <= 0) {
            System.out.println("ERROR");
            entrada.close();
            return;
        }
        char[][] matriz = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = '_';
            }
        }
        // Colocar las 'X' en las diagonales
        for (int i = 0; i < n; i++) {
            matriz[i][i] = 'X'; // Diagonal principal
            matriz[i][n - 1 - i] = 'X'; // Diagonal secundaria
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
        entrada.close();
    }
}
