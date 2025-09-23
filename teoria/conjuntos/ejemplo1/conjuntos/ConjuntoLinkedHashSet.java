package teoria.conjuntos.ejemplo1.conjuntos;

import java.util.LinkedHashSet;
import java.util.Set;

public class ConjuntoLinkedHashSet {
  public static void main(String[] args) {
    Set<Integer> nums = new LinkedHashSet<>(); // Mantiene el orden de inserción
    nums.add(34);
    nums.add(23);
    nums.add(34); // Duplicado, se ignora
    nums.add(50);
    nums.add(20);
    nums.add(10);
    System.out.println("Números: " + nums);

  }
}
