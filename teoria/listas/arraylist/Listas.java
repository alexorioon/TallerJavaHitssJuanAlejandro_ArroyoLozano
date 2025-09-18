package teoria.listas.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import teoria.listas.modelos.Persona;

public class Listas {

  public static void main(String[] args) {
    List<String> nombres = new ArrayList<String>();
    nombres.add("Juan");
    nombres.add("Ana");
    nombres.add("Pedro");
    nombres.add("Ana");
    System.out.println(nombres);
    System.out.println("Nombre en el índice 3: " + nombres.get(3));
    // Agregar un elemento en medio (O(n))
    nombres.add(2, "Eloy");
    System.out.println(nombres);
    nombres.addFirst("Bingo");
    System.out.println(nombres);
    nombres.addLast("Susana");
    System.out.println(nombres);
    // Modificar un elemento
    nombres.set(5, "Edith");
    System.out.println(nombres);
    // Eliminar un elemento
    System.out.println(
      "Elemento eliminado mediante indice: " + nombres.remove(3)
    );
    System.out.println(nombres);
    System.out.println(
      "Eliminar elemento a través del objeto: " + nombres.remove("Ana")
    );
    System.out.println(nombres);

    // Iteradores
    Iterator<String> it = nombres.iterator();
    System.out.println("Recorriendo con iterator: ");
    while (it.hasNext()) {
      if (it.next().equals("Juan")) {
        it.remove();
      }
    }

    // No se cumple pq el iterador está al final
    // Se puede utilizar ListIterator
    var it2 = nombres.listIterator();
    System.out.println("Recorriendo con list iterator: ");
    while (it2.hasNext()) {
      System.out.println(it2.next());
    }

    // De regreso
    System.out.println("Regresando con list iterator: ");
    while (it2.hasPrevious()) {
      System.out.println(it2.previous());
    }

    // Ordenar elementos de forma natural
    System.out.println("Lista antes de ordenar: ");
    System.out.println(nombres);
    System.out.println("Lista después de ordenar: ");
    System.out.println(nombres);

    List<Integer> enteros = new ArrayList<>();
    enteros.add(34);
    enteros.add(23);
    enteros.add(45);
    enteros.add(20);
    enteros.add(10);
    System.out.println("Lista de enteros NO ordenada: " + enteros);
    Collections.sort(enteros);
    System.out.println("Lista de enteros ordenada: " + enteros);

    List<Persona> personas = new ArrayList<>();
    personas.add(new Persona(1, "Alex", 24));
    personas.add(new Persona(2, "Eloy", 35));
    personas.add(new Persona(3, "Angelica", 45));
    personas.add(new Persona(4, "Juan", 35));
    personas.add(new Persona(5, "Ines", 56));
    personas.add(new Persona(6, "Edgar", 48));
    System.out.println("Lista de personas NO ordenada: ");
    for (Persona persona : personas) {
      System.out.println(persona);
    }

    // Comparable con el método compareTo
    /* Collections.sort(personas, (c1, c2) ->
      c1.getName().compareTo(c2.getName())
    ); // Se ordena por nombre */

    // Comparator para ordenar
    //personas.sort(Comparator.comparingInt(Persona::getAge));
    // Ordenar por nombre si hay nombres iguales, por edad
    /* personas.sort(
      Comparator.comparing(Persona::getName)
        .thenComparing(Persona::getAge)
        .reversed()); */
    personas.sort(Comparator.comparingInt(p -> p.getName().length()));

    System.out.println("Lista de personas ordenada: ");
    for (Persona persona : personas) {
      System.out.println(persona);
    }

    // Tratar de eliminar un elemento mediante un ciclo
    /* for (String nombre : nombres) {
      if (nombre.equals("Ana")) {
        nombres.remove("Ana");
      }
    } */
  }
}
