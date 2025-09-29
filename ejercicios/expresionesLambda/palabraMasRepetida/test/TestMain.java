package ejercicios.expresionesLambda.palabraMasRepetida.test;

import java.util.HashMap;
import java.util.Map;

import ejercicios.expresionesLambda.palabraMasRepetida.interfaces.WordFrequencyCounter;

public class TestMain {
  /*
   * Para la tarea se pide como requerimiento escribir
   * una expresión lambda que cuenta la cantidad de
   * veces que se repiten las palabras de una frase y
   * devuelva la más repetida, según lo siguiente:
   * 
   * La expresión lambda debe recibir por argumento una
   * frase u oracion y devolver un objeto Map que contenga
   * la palabra mas repetida de la frase como llave y la
   * cantidad de veces que se repite como valor.
   * 
   * Tiene que devolver un objeto Map de java
   * 
   * Mostrar el resultado en consola iterando el map o
   * bien obteniendo el primer elemento con get().
   */
  public static void main(String[] args) {
    String frase = """
        La vida es bella, la vida es grande, la vida es feliz,la vida es larga,
        la vida es breve, la vida es dulce, la vida es intensa, la vida es hermosa,
        la vida es perfecta, la vida es eterna, la vida es real, la vida es bella,
        la vida es maravillosa, la vida es inolvidable, la vida es sorprendente,
        la vida es abundante, la vida es plena, la vida es esperanza, la vida es amor,
        la vida es libertad.""";

    // lambda
    WordFrequencyCounter<String, Map<String, Integer>> contador = (s) -> {
      Map<String, Integer> palabrasMap = new HashMap<>();
      // Se quitan todos los signos de puntuación y todo en minúsculas
      s = s.toLowerCase();
      s = s.replace(".", "");
      s = s.replace(",", "");
      s = s.replace(";", "");

      // Guardamos las palabras en un array
      String[] palabrasArray = s.split(" ");

      // Recorremos el array de palabras y las vamos guardando en el Map con su valor
      // (repeticiones)
      for (String palabra : palabrasArray) {
        if (palabrasMap.containsKey(palabra)) {
          palabrasMap.put(palabra, palabrasMap.get(palabra) + 1); // Si está, aumentamos 1 al Valor
        } else {
          palabrasMap.put(palabra, 1); // Si no está, la añadimos con Valor de 1
        }
      }

      // Obtenemos el Valor de la palabra más repetida y su Key
      int maximo = 0;
      String palabraMaxima = "";
      for (String palabra : palabrasMap.keySet()) {
        if (palabrasMap.get(palabra) > maximo) {
          maximo = palabrasMap.get(palabra);
          palabraMaxima = palabra;
        }
      }

      // Devolvemos un Map con la palabra más repetida y su valor
      return Map.of(palabraMaxima, maximo);
    };

    // Prueba del método
    Map<String, Integer> resultado = contador.palabraMasRepetida(frase);
    String palabra = resultado.keySet().iterator().next();
    int repeticiones = resultado.get(palabra);
    System.out.println("Frase original: " + frase);
    System.out.print("""
      %nPalabra más repetida: '%s'
      Total de veces: %d
      """.formatted(palabra, repeticiones));
  }
}
