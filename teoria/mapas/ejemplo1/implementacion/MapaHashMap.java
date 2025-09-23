package teoria.mapas.ejemplo1.implementacion;

import java.util.HashMap;
import java.util.Map;

public class MapaHashMap {

  public static void main(String[] args) {
    // Map<k, v>
    Map<Integer, String> frutas = new HashMap<>();
    frutas.put(1, "Manzana");
    frutas.put(2, "Uva");
    frutas.put(3, "Melón");
    frutas.put(5, "Sandía");
    frutas.put(4, "Sandía");
    frutas.put(null, "Fruta desconocida");
    //System.out.println("Frutas: " + frutas);
    System.out.println("Fruta 2: " + frutas.get(2));

    // Recorrer con entrySet (clave y valor)
    for (Map.Entry<Integer, String> fruta : frutas.entrySet()) {
      System.out.println("Clave: " + fruta.getKey() + " -> " + "Valor: " + fruta.getValue());
    }

    // Recorrer por clave
    System.out.println("Recorriendo por clave");
    //Set<Integer> keys = frutas.keySet(); // Obtenemos el conjunto de claves
    for (Integer key : frutas.keySet()) {
      System.out.println("Clave: " + key);
    }

    // Recorrer sólo los valores
    System.out.println("Recorriendo sólo los valores");
    //List<String> values = new ArrayList<>(frutas.values()); // Obtenemos una lista con los valores
    for (String value : frutas.values()) {
      System.out.println("Valor: " + value);
    }
  }
}
