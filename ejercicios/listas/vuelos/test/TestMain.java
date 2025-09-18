package ejercicios.listas.vuelos.test;

import ejercicios.listas.vuelos.classes.Vuelo;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class TestMain {

  public static void main(String[] args) {
    List<Vuelo> vuelos = new ArrayList<>();

    // AAL 933: New York -> Santiago
    vuelos.add(
      new Vuelo(
        "AAL 933",
        "New York",
        "Santiago",
        LocalDateTime.of(2021, 07, 29, 05, 39),
        62
      )
    );

    // LAT 755: Sao Paulo -> Santiago
    vuelos.add(
      new Vuelo(
        "LAT 755",
        "Sao Paulo",
        "Santiago",
        LocalDateTime.of(2021, 07, 31, 04, 45),
        47
      )
    );

    // SKU 621: Rio De Janeiro -> Santiago
    vuelos.add(
      new Vuelo(
        "SKU 621",
        "Rio De Janeiro",
        "Santiago",
        LocalDateTime.of(2021, 07, 30, 16, 00),
        52
      )
    );

    // DAL 147: Atlanta -> Santiago
    vuelos.add(
      new Vuelo(
        "DAL 147",
        "Atlanta",
        "Santiago",
        LocalDateTime.of(2021, 07, 29, 13, 22),
        59
      )
    );

    // AVA 241: Bogota -> Santiago
    vuelos.add(
      new Vuelo(
        "AVA 241",
        "Bogota",
        "Santiago",
        LocalDateTime.of(2021, 07, 31, 14, 05),
        25
      )
    );

    // AMX 10: Mexico City -> Santiago
    vuelos.add(
      new Vuelo(
        "AMX 10",
        "Mexico City",
        "Santiago",
        LocalDateTime.of(2021, 07, 31, 05, 20),
        29
      )
    );

    // IBE 6833: Londres -> Santiago
    vuelos.add(
      new Vuelo(
        "IBE 6833",
        "Londres",
        "Santiago",
        LocalDateTime.of(2021, 07, 30, 8, 45),
        55
      )
    );

    // LAT 2479: Frankfurt -> Santiago
    vuelos.add(
      new Vuelo(
        "LAT 2479",
        "Frankfurt",
        "Santiago",
        LocalDateTime.of(2021, 07, 29, 07, 41),
        51
      )
    );

    // SKU 803: Lima -> Santiago
    vuelos.add(
      new Vuelo(
        "SKU 803",
        "Lima",
        "Santiago",
        LocalDateTime.of(2021, 07, 30, 10, 35),
        48
      )
    );

    // LAT 533: Los Ángeles -> Santiago
    vuelos.add(
      new Vuelo(
        "LAT 533",
        "Los Ángeles",
        "Santiago",
        LocalDateTime.of(2021, 07, 29, 9, 14),
        59
      )
    );

    // LAT 1447: Guayaquil -> Santiago
    vuelos.add(
      new Vuelo(
        "LAT 1447",
        "Guayaquil",
        "Santiago",
        LocalDateTime.of(2021, 07, 31, 8, 33),
        31
      )
    );

    // CMP 111: Panama City -> Santiago
    vuelos.add(
      new Vuelo(
        "CMP 111",
        "Panama City",
        "Santiago",
        LocalDateTime.of(2021, 07, 31, 15, 15),
        29
      )
    );

    // LAT 705: Madrid -> Santiago
    vuelos.add(
      new Vuelo(
        "LAT 705",
        "Madrid",
        "Santiago",
        LocalDateTime.of(2021, 07, 30, 8, 14),
        47
      )
    );

    // AAL 957: Miami -> Santiago
    vuelos.add(
      new Vuelo(
        "AAL 957",
        "Miami",
        "Santiago",
        LocalDateTime.of(2021, 07, 29, 22, 53),
        60
      )
    );

    // ARG 5091: Buenos Aires -> Santiago
    vuelos.add(
      new Vuelo(
        "ARG 5091",
        "Buenos Aires",
        "Santiago",
        LocalDateTime.of(2021, 07, 31, 9, 57),
        32
      )
    );

    // LAT 1283: Cancún -> Santiago
    vuelos.add(
      new Vuelo(
        "LAT 1283",
        "Cancún",
        "Santiago",
        LocalDateTime.of(2021, 07, 31, 04, 00),
        35
      )
    );

    // LAT 579: Barcelona -> Santiago
    vuelos.add(
      new Vuelo(
        "LAT 579",
        "Barcelona",
        "Santiago",
        LocalDateTime.of(2021, 07, 29, 07, 45),
        61
      )
    );

    // AAL 945: Dallas-Fort Worth -> Santiago
    vuelos.add(
      new Vuelo(
        "AAL 945",
        "Dallas-Fort Worth",
        "Santiago",
        LocalDateTime.of(2021, 07, 30, 07, 12),
        58
      )
    );

    // LAT 501: París -> Santiago
    vuelos.add(
      new Vuelo(
        "LAT 501",
        "París",
        "Santiago",
        LocalDateTime.of(2021, 07, 29, 18, 29),
        49
      )
    );

    // LAT 405: Montevideo -> Santiago
    vuelos.add(
      new Vuelo(
        "LAT 405",
        "Montevideo",
        "Santiago",
        LocalDateTime.of(2021, 07, 30, 15, 45),
        39
      )
    );

    // Ordenar por llegada de forma ascendente
    vuelos.sort((v1, v2) ->
      v1.getFechaLlegada().compareTo(v2.getFechaLlegada())
    );
    for (Vuelo vuelo : vuelos) {
      System.out.println(vuelo.toString());
    }

    // Obtener el último vuelo en llegar e imprimirlo
    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    Vuelo ultimoVuelo = vuelos.get(vuelos.size() - 1);
    System.out.println(
      "El último vuelo en llegar es " +
      ultimoVuelo.getNombre() + ": " +
      ultimoVuelo.getOrigen() + ", aterriza el " +
      ultimoVuelo
        .getFechaLlegada()
        .format(DateTimeFormatter.ofPattern("EEEE dd MMMM HH:mm:ss yyyy"))
    );

    // Obtener el vuelo con menor número de pasajeros
    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    Vuelo vueloMenorPasajeros = vuelos
      .stream()
      .min((v1, v2) ->
        Integer.compare(v1.getCantidadPasajeros(), v2.getCantidadPasajeros())
      )
      .orElse(null);
    
      System.out.println(
      "El vuelo con menor número de pasajeros es " +
      vueloMenorPasajeros.getNombre() + ": " +
      vueloMenorPasajeros.getOrigen() + ", con " +
      vueloMenorPasajeros.getCantidadPasajeros() + " pasajeros"
    );
  }
}
