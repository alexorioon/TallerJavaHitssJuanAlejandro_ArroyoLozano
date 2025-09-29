package ejercicios.expresionesLambda.ejercicio1.test;

import ejercicios.expresionesLambda.ejercicio1.interfaces.Transformador;

public class TestTransformador {
  public static void main(String[] args) {
    String frase = "Hola, mundo. ¿Cómo estás?";
    Transformador<String, String> transformadorxd = (s) -> s.replace(" ", "").replace(",", "").replace(".", "").toUpperCase();
    System.out.println("Frase original: \n" + frase);
    System.out.println("\nFrase convertida: \n" + transformadorxd.convertir(frase));
  }
}
