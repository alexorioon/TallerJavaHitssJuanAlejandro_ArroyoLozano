package ciclos;

import java.util.Scanner;

public class CicloDoWhile {
    public static void main(String[] args) {
        /* Ingresar números y repetir hasta 
           que se ingrese un cero */
        Scanner entrada = new Scanner(System.in);
        int i;
        do {
            System.out.print("Número: ");
            i = entrada.nextInt();
        } while (i != 0);
        System.out.println("Ingresaste el valor de i como: " + i);
        entrada.close();
    }
}
