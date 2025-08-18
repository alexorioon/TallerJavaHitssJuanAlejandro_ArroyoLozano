package ejercicios.ciclos;

import java.util.Scanner;

public class Ejercicio1Multiplicacion {
    /*
     * Programa que multiplica dos números sin usar * como operador
     */
    public static void main(String[] args) {
        int multiplicando, multiplicador, producto = 0;
        boolean esNegativo;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el multiplicando: ");
        multiplicando = entrada.nextInt();
        System.out.print("Ingrese el multiplicador: ");
        multiplicador = entrada.nextInt();
        entrada.close();
        esNegativo = (multiplicando < 0 && multiplicador >= 0) || (multiplicando >= 0 && multiplicador < 0);
        if (multiplicando < 0)
            multiplicando = -multiplicando;

        if (multiplicador < 0)
            multiplicador = -multiplicador;
        
        for (int i = 1; i <= multiplicador; i++)
            producto += multiplicando;

        if (esNegativo)
            producto = -producto;
        
        System.out.println("Resultado: " + producto);
    }
}
