package teoria.flujo;

public class OperadorTernario {
    public static void main(String[] args) {
        //  Operador Ternario
        int numero = 5;
        String resultado = (numero % 2 == 0) ? numero + " es par" : numero + " no es par";
        System.out.println(resultado);
    }
}