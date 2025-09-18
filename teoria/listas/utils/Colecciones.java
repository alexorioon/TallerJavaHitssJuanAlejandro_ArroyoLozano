package teoria.listas.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Colecciones {

  public static void main(String[] args) {
    /*
     * Clase utilitaria Collections -> List, Set, Map
     * operaciones: ordenar, buscar, copiar, rellenar, etc
     */
    List<Integer> numeros = new ArrayList<>(
      Arrays.asList(5, 2, 9, 3, 8, 7, 5, 7, 5, 6, 1)
    );
    System.out.println("Números: " + numeros);

    // Ordenar
    Collections.sort(numeros);
    System.out.println("Números: " + numeros);

    // Invertir la colección
    Collections.reverse(numeros);
    System.out.println("Números: " + numeros);

    // Mínimo y el máximo
    System.out.println("Mínimo: " + Collections.min(numeros));
    System.out.println("Máximo: " + Collections.max(numeros));

    // Mezclar aleatoriamente
    Collections.shuffle(numeros);
    System.out.println("Números: " + numeros);

    // Frecuencia
    System.out.println(
      "Frecuencia del número 5: " + Collections.frequency(numeros, 5)
    );
  }
}
