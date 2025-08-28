package teoria.ciclos;

//  import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        /* Scanner entrada = new Scanner(System.in);
        int num;
        System.out.print("Numero de tabla: ");
        num = entrada.nextInt();
        entrada.close(); */
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabla de multiplicar del " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j +" = " + i * j);
            }
            System.out.println("==========================");
        }
    }
}