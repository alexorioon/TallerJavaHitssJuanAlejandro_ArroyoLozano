package flujo;

public class Condicional {
    public static void main(String[] args) {
        int edad = 17;
        if (edad >= 18) {
            System.out.println("Eres mayor de edad!");
        }
        System.out.println("Continua el flujo del programa");

        if (edad < 18) {
            System.out.println("Menor de edad");
        } else {
            System.out.println("Mayor de edad");
        }
    }
}