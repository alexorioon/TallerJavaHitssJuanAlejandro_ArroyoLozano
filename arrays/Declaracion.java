package arrays;

import java.util.Arrays;

public class Declaracion {
    public static void main(String[] args) {
        //  tipo[] nombreArray;
        int[] numeros; //  Declaración
        numeros = new int[10]; //  Inicialización
        
        //  tipo[] nombreArray = new tipo[tamaño];
        //String[] nombres = new String[10]; //  Declaración e inicialización
        
        //  Declaración e inicializar directamente con valores en el array
        char[] letras = {'a', 'e', 'i', 'o', 'u'};
        
        int edades[] = new int[10];
        
        String nombre = "Alejandro";
        System.out.println("Tamaño nombre: " + nombre.length());
        System.out.println("Tamaño nombre numeros: " + numeros.length);
        
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[9] = 100;
        
        System.out.println("Último elemento: " + numeros[numeros.length - 1]);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        
        for (int numero : numeros) {
            System.out.println(numero);
        }
        
        for (int i = 0; i < letras.length; i++) {
            System.out.println("Letra: " + letras[i]);
        }
        
        System.out.println("For-each");
        for (char letra : letras) {
            System.out.println("Letra: " + letra);
        }

        Arrays.fill(edades, 0, 4, 50);
        for (int i = 0; i < edades.length; i++) {
            System.out.println(edades[i]);
        }
    }
}
