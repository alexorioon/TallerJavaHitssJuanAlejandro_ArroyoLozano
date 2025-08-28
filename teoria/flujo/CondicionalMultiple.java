package teoria.flujo;

public class CondicionalMultiple {
    public static void main(String[] args) {
        // Identificar si un número es positivo, negativo o cero
        int numero = 10;
        if (numero > 0) {
            System.out.println("El " + numero + " es positivo");
            if (true) {
                System.out.println("If dentro de otro If");
            }
        } else if (numero < 0){
            System.out.println("El " + numero + " es negativo");
        } else {
            System.out.println("El " + numero + " es cero");
        }
    }
}
