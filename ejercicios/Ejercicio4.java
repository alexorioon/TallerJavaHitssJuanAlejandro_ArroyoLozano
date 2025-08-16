package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        /*
         * Para la tarea se requiere un menú para administrar a los productos con las opciones:
         * actualizar, eliminar, crear, listar y salir.
         * Para la clase con el método main vamos a contar con un menú y poder seleccionar el tipo
         * de operación, según el numero ingresado.
         * Dentro de cada opción imprimir un texto relacionado, por ejemplo, para actualizar:
         * "Usuario actualizado correctamente"
         * Para eliminar el mensaje "Usuario eliminado correctamente" y así sucesivamente
         * dependiendo de la opción.
         * Iterar hasta que la opción sea salir, cada vez que se selecciona una operación distinta a
         * salir, al finalizar con dicha operación debe volver al menú para continuar con otra, con la
         * opción salir (5) se debe mostrar el mensaje "Haz salido con exito!" y finalizar el programa.
         */

        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("======= Menú =======");
            System.out.println("Seleccione una opción");
            System.out.println("1. Actualizar");
            System.out.println("2. Eliminar");
            System.out.println("3. Crear");
            System.out.println("4. Listar");
            System.out.println("5. Salir\n");
            System.out.print("Opción: ");
            switch (entrada.nextInt()) {
                case 1 -> System.out.println("\nUsuario actualizado correctamente!\n");
                case 2 -> System.out.println("\nUsuario eliminado correctamente!\n");
                case 3 -> System.out.println("\nUsuario creado correctamente!\n");
                case 4 -> System.out.println("\nUsuario listado correctamente!\n");
                case 5 -> System.out.println("Haz salido con éxito!");
            }
        } while (entrada.nextInt() == 1 || entrada.nextInt() == 2 || entrada.nextInt() == 3 || entrada.nextInt() == 4);
        entrada.close();
    }
}
