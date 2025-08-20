package arrays;

import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        //  Numeros aleatorios
        //  Clase Math -> tiene métodos estáticos (random())
        int numero;
        for (int i = 0; i < 11; i++) {
            numero = (int)(Math.random() * 9) + 1;
        System.out.println(numero);
        }

        //  Clase Random -> crear una instancia
        System.out.println("\nNumeros aleatorios con clase Random");
        Random aleatorio = new Random();
        int num;
        for (int i = 0; i < 11; i++) {
            num = aleatorio.nextInt(100);
            System.out.println(num);
        }

        double numDecimal = aleatorio.nextDouble();
        System.out.println(numDecimal);

        boolean myBoolean = aleatorio.nextBoolean(); //  Genera booleanos aleatoriamente
        System.out.println(myBoolean);
    }
}
