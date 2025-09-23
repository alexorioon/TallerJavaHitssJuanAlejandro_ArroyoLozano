package teoria.conjuntos.ejemplo1.conjuntos;

import java.util.Set;
import java.util.TreeSet;

public class ConjuntoTreeSet {
  public static void main(String[] args) {
    Set<String> frutas = new TreeSet<>(); // Ordenados por orden alfabético
    frutas.add("Manzana");
    frutas.add("Pera");
    frutas.add("Naranja");
    frutas.add("Pera"); // Duplicado, se ignora
    frutas.add("Banana");
    
    System.out.println("Frutas: " + frutas);
  }
}
