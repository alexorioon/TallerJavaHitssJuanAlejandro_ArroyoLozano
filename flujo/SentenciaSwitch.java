package flujo;

public class SentenciaSwitch {
    public static void main(String[] args) {
        int numero = 1;
        System.out.println("===================Antes del Switch===================");
        switch (numero) {
            case 1,2,3,4,5:
                System.out.println("Día laborable");
                break;
            case 6, 7:
                System.out.println("Fin de semana");
                break;
            default:
                System.out.println("Ingrese un número del 1 al 7");
                break;
        }
        System.out.println("===================Después del Switch===================");
    }
}
