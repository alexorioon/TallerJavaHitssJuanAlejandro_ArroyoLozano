package teoria.parametrosVariables.test;

public class TestMainCadenas {
    //  Concatenar cadenas (+), StringBuilder
    private static String concatenar(String titulo, int valor, String...textos){
        StringBuilder sb = new StringBuilder();
        System.out.println("=====" + titulo + "=====");
        System.out.println("Valor: " + valor);
        for (String texto : textos) {
            sb.append(texto).append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(concatenar("Primer prueba de parámetros variables", 10, "Hola"));
        System.out.println(concatenar("Segunda prueba de parámetros variables", 15,"Java", "21", "es", "muy genial", "para", "programar!"));
        System.out.println(concatenar("Segunda prueba de parámetros variables", 20));
    }
}
