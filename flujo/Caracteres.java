package flujo;

import java.util.Scanner;

public class Caracteres {
    public static void main(String[] args) {
        /*
         * Saber si el caracter dado por el usuario es una
         * vocal, una consonante, un número o caracter especial
         */
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa el caracter: ");
        char caracter = entrada.next().charAt(0);
        entrada.close();
        if (Character.isLetter(caracter)) {
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u')
                System.out.println("Es una vocal");
            else
                System.out.println("Es una consonante");
        } else if (Character.isDigit(caracter))
            System.out.println("Es un número");
        else
            System.out.println("Es un caracter especial");
    }
}