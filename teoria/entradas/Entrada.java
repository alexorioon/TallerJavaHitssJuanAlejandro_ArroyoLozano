package teoria.entradas;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        // Para hacer una instancia de una clase de hace lo siguiente
        // NombreClase nombreObjeto = new NombreConstructor <== Nombre de la clase
        Scanner entrada = new Scanner(System.in);
        int edad;
        String nombre;
        long telefono;
        double estatura;
        System.out.print("Ingrese su nombre: ");
        //nombre = entrada.nextLine();
        nombre = entrada.next();
        entrada.nextLine();
        System.out.print("Ingrese su edad: ");
        edad = entrada.nextInt();
        System.out.print("Ingrese su teléfono: ");
        telefono = entrada.nextLong();
        System.out.println("Ingrese su edad: ");
        estatura = entrada.nextDouble();
        System.out.println("Hola, " + nombre + ", tienes " + edad + " años");
        System.out.println("Telefono: " + telefono);
        System.out.println("Estatura: " + estatura);
        entrada.close();
    }
}
