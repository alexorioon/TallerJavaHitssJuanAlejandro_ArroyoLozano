package teoria.listas.arraylist;

import java.util.LinkedList;
import java.util.List;

public class ListaEnlazada {

  public static void main(String[] args) {
    List<String> frutas = new LinkedList<>();
    // Agregar elementos
    frutas.add("Manzana");
    frutas.add("Plátano");
    frutas.add("Naranja");
    System.out.println(frutas);

    // Acceso mediante get(index)
    System.out.println("Elemento en el índice 1: " + frutas.get(1));

    // Insertar en medio (mas eficiente que ArrayList)
    frutas.add(1, "Pera");
    System.out.println(frutas);

    // Eliminar un elemento en medio
    System.out.println("Elemento eliminado: " + frutas.remove(1));
    System.out.println(frutas);

    // Eliminar un elemento
    System.out.println(
      "Elemento eliminado mediante indice: " + frutas.remove(1)
    );
    System.out.println(frutas);

    // Modificar un elemento
    System.out.println("Elemento modificado: " + frutas.set(1, "Fresa"));
    System.out.println(frutas);
  }
}
