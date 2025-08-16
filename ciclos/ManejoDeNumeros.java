package ciclos;

import java.util.Scanner;

public class ManejoDeNumeros {
    public static void main(String[] args) {
        /* El usuario debe ingresar un número entero,
         * si escribe texto o caracteres especiales,
         * el programa mandará un error y vuelve a pedir
         * un valor entero válido
         */
        int entero = 0;
        boolean esValido = false;
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.print("Número: ");
            esValido = entrada.hasNextInt();
            if (esValido) {
                entero = entrada.nextInt();
            } else {
                System.out.println("No es una entrada numérica!");
                entrada.nextLine();
            }
        } while (!esValido);
        System.out.println("Número: " + entero);
        entrada.close();
    }
}
