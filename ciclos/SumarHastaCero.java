package ciclos;

import java.util.Scanner;

public class SumarHastaCero {
    public static void main(String[] args) {
        //  Realizar la suma de numeros solicitados al suario
        //  mientras el numero ingresado no sea cero
        Scanner entrada = new Scanner(System.in);
        int suma = 0, num;
        System.out.print("Ingrese el número: ");
        num = entrada.nextInt();
        while (num != 0) {
            suma += num;
            System.out.print("Ingrese el número: ");
            num = entrada.nextInt();
        }
        System.out.println("Suma total: " + suma);
        entrada.close();
    }
}
