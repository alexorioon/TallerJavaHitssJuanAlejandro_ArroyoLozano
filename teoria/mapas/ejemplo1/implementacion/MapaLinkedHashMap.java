package teoria.mapas.ejemplo1.implementacion;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapaLinkedHashMap {

  public static void main(String[] args) {
    Map<String, String> nombres = new LinkedHashMap<>();
    nombres.put("alex", "Alex Arroyo");
    nombres.put("juan", "Juan Pérez");
    nombres.put(null, null);
    nombres.put("alex", null);
    nombres.put("bingo", null);
    System.out.println("Nombres: " + nombres);

    for (String value : nombres.values()) {
      System.out.println("Valor: " + value);
    }
  }
}
