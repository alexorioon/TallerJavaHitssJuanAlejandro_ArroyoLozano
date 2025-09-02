package teoria.arrays;

import java.util.Arrays;

public class MetodosArreglo {

  public static void main(String[] args) {
    int[] edades = { 34, 20, 15, 34, 43, 38, 19, 27, 60, 10 };
    for (int edad : edades) {
      System.out.println(edad);
    }

    System.out.println("Búsqueda: " + Arrays.binarySearch(edades, 43));

    Arrays.sort(edades);

    System.out.println("Búsqueda: " + Arrays.binarySearch(edades, 43));

    System.out.println("Arreglo ordenado de menor a mayor");
    for (int i : edades) {
      System.out.println(i);
    }
  }
}
