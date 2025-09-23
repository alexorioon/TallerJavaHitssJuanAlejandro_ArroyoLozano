package ejercicios.conjuntos.gestionTorneoDeportivo.test;

import ejercicios.conjuntos.gestionTorneoDeportivo.classes.*;

import java.util.*;

public class TestMain {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Torneo torneo = new Torneo();

    // Inicializar 3 disciplinas con distintas implementaciones de Set:
    // - Fútbol: HashSet (no garantiza orden)
    // - Básquetbol: LinkedHashSet (mantiene orden de inscripción)
    // - Voleibol: TreeSet ordenado por nombre (Comparator)
    Disciplina futbol = new Disciplina("Futbol", new HashSet<>());
    Disciplina basquet = new Disciplina("Basquetbol", new LinkedHashSet<>());
    Comparator<Jugador> cmpNombre = Comparator.comparing(Jugador::getNombre).thenComparing(Jugador::getId);
    Disciplina voley = new Disciplina("Voleibol", new TreeSet<>(cmpNombre));

    torneo.agregarDisciplina(futbol);
    torneo.agregarDisciplina(basquet);
    torneo.agregarDisciplina(voley);

    Jugador j1 = new Jugador(1, "Alex");
    Jugador j2 = new Jugador(2, "Santiago");
    Jugador j3 = new Jugador(3, "Valeria");
    Jugador j4 = new Jugador(4, "Fernanda");
    Jugador j5 = new Jugador(5, "Ximena");
    Jugador j6 = new Jugador(6, "Kevin");
    Jugador j7 = new Jugador(2, "Santiago");
    
    // Ejemplo: pre-registrar algunos jugadores (para pruebas)
    futbol.registrarJugador(j1);
    futbol.registrarJugador(j2);
    futbol.registrarJugador(j5);
    futbol.registrarJugador(j7);
    basquet.registrarJugador(j3);
    basquet.registrarJugador(j2); // Luis también se inscribe en basquet
    voley.registrarJugador(j4);
    voley.registrarJugador(j5);
    voley.registrarJugador(j6);


    boolean salir = false;
    while (!salir) {
      System.out.println("\n--- Menú de opciones ---");
      System.out.println("1. Mostrar jugadores por deporte.");
      System.out.println("2. Contar jugadores en cada disciplina.");
      System.out.println("3. Fusionar equipos (unión) entre 2 disciplinas.");
      System.out.println("4. Ver jugadores en común (intersección) entre 2 disciplinas.");
      System.out.println("5. Transferir un jugador de un deporte a otro.");
      System.out.println("6. Mostrar todos los jugadores ordenados por nombre.");
      System.out.println("7. Mostrar todos los jugadores en orden de inscripción.");
      System.out.println("8. Mostrar ranking de jugadores por ID.");
      System.out.println("9. Salir.");
      System.out.print("Seleccione una opción: ");

      int opcion;
      try {
        opcion = Integer.parseInt(sc.nextLine().trim());
      } catch (NumberFormatException e) {
        System.out.println("Opción inválida. Intente de nuevo.");
        continue;
      }

      switch (opcion) {
        case 1 -> {
          torneo.mostrarJugadoresPorDeporte("futbol");
          torneo.mostrarJugadoresPorDeporte("basquetbol");
          torneo.mostrarJugadoresPorDeporte("voleibol");
        }
        case 2 -> torneo.contarJugadoresPorDisciplina();
        case 3 -> {
          System.out.print("Disciplina A: ");
          String a = sc.nextLine().trim().toLowerCase();
          System.out.print("Disciplina B: ");
          String b = sc.nextLine().trim().toLowerCase();
          Set<Jugador> fusion = torneo.fusionarEquipos(a, b);
          if (fusion.isEmpty()) {
            System.out.println("No se pudo realizar la fusión (revisar nombres de disciplinas).");
          } else {
            System.out.println("Jugadores resultantes de la fusión " + a + " U " + b + ":");
            fusion.forEach(j -> System.out.println("  " + j));
          }
        }
        case 4 -> {
          System.out.print("Disciplina A: ");
          String a2 = sc.nextLine().trim().toLowerCase();
          System.out.print("Disciplina B: ");
          String b2 = sc.nextLine().trim().toLowerCase();
          Set<Jugador> inter = torneo.interseccionEquipos(a2, b2);
          if (inter.isEmpty()) {
            System.out.println("No hay jugadores en común o disciplinas inválidas.");
          } else {
            System.out.println("Jugadores en común entre " + a2 + " y " + b2 + ":");
            inter.forEach(j -> System.out.println("  " + j));
          }
        }
        case 5 -> {
          try {
            System.out.print("ID del jugador a transferir: ");
            int id = Integer.parseInt(sc.nextLine().trim());
            System.out.print("Disciplina origen: ");
            String origen = sc.nextLine().trim().toLowerCase();
            System.out.print("Disciplina destino: ");
            String destino = sc.nextLine().trim().toLowerCase();
            boolean ok = torneo.transferirJugador(id, origen, destino);
            if (ok) {
              System.out.println("Transferencia completada.");
            } else {
              System.out.println("Transferencia fallida (verificar ID y disciplinas).");
            }
          } catch (NumberFormatException e) {
            System.out.println("ID inválido.");
          }
        }
        case 6 -> {
          Set<Jugador> porNombre = torneo.obtenerTodosOrdenadosPorNombre();
          if (porNombre.isEmpty()) {
            System.out.println("No hay jugadores registrados.");
          } else {
            System.out.println("Todos los jugadores ordenados por nombre:");
            porNombre.forEach(j -> System.out.println("  " + j));
          }
        }
        case 7 -> {
          List<Jugador> porInscripcion = torneo.obtenerTodosEnOrdenInscripcion();
          if (porInscripcion.isEmpty()) {
            System.out.println("No hay jugadores registrados.");
          } else {
            System.out.println("Listado en orden de inscripción (disciplinas en orden añadidas al torneo):");
            porInscripcion.forEach(j -> System.out.println("  " + j));
          }
        }
        case 8 -> {
          Set<Jugador> ranking = torneo.obtenerRankingPorID();
          if (ranking.isEmpty()) {
            System.out.println("No hay jugadores registrados.");
          } else {
            System.out.println("Ranking por ID (menor -> mayor):");
            ranking.forEach(j -> System.out.println("  " + j));
          }
        }
        case 9 -> {
          salir = true;
        }
        default -> System.out.println("Opción no válida.");
      } // switch
    } // whilek
    sc.close();
  }
}
