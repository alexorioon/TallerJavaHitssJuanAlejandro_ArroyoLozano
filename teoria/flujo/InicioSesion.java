package teoria.flujo;

import java.util.Scanner;

public class InicioSesion {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String userName, password;
        System.out.println("Argumentos");
        System.out.println("Valor de args[0]: " + args[0]);
        System.out.println("Valor de args[1]: " + args[1]);
        
        /*
        System.out.print("Ingrese el username: ");
        userName = entrada.next();
        System.out.print("Ingrese la password: ");
        password = entrada.next();
        
         */
        entrada.close();
        
        userName = args[0];
        password = args[1];
        if (userName.equals("Alex") && password.equals("1234")) {
            System.out.println("Ingresaste correctamente!");
        } else {
            System.out.println("El username o la password son incorrectos");
        }
    }
}
