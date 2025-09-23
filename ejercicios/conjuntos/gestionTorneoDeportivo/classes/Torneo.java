package ejercicios.conjuntos.gestionTorneoDeportivo.classes;

import java.util.*;

public class Torneo {
  // Uso LinkedHashMap para mantener orden de inserción de disciplinas (útil para orden de inscripción simulado)
  private Map<String, Disciplina> disciplinas;

  public Torneo() {
    this.disciplinas = new LinkedHashMap<>();
  }

  public void agregarDisciplina(Disciplina d) {
    String nombre = d.getNombre();
    disciplinas.put(nombre, d);
  }

  public Disciplina obtenerDisciplina(String nombre) {
    return disciplinas.get(nombre);
  }

  public Set<String> listarDisciplinas() {
    return disciplinas.keySet();
  }

  // 3. Fusionar equipos (unión)
  public Set<Jugador> fusionarEquipos(String d1, String d2) {
    Disciplina a = disciplinas.get(d1);
    Disciplina b = disciplinas.get(d2);
    if (a == null || b == null) return Collections.emptySet();
    Set<Jugador> fusion = new HashSet<>(a.getJugadores());
    fusion.addAll(b.getJugadores());
    return fusion;
  }

  // 4. Intersección (jugadores comunes)
  public Set<Jugador> interseccionEquipos(String d1, String d2) {
    Disciplina a = disciplinas.get(d1);
    Disciplina b = disciplinas.get(d2);
    if (a == null || b == null) return Collections.emptySet();
    Set<Jugador> inter = new HashSet<>(a.getJugadores());
    inter.retainAll(b.getJugadores());
    return inter;
  }

  // 5. Transferir jugador por id de una disciplina a otra
  public boolean transferirJugador(int id, String origen, String destino) {
    Disciplina dOrigen = disciplinas.get(origen);
    Disciplina dDestino = disciplinas.get(destino);
    if (dOrigen == null || dDestino == null) return false;

    Jugador j = dOrigen.obtenerJugadorPorId(id);
    if (j == null) return false;

    // Quitar y agregar
    dOrigen.eliminarJugador(j);
    dDestino.registrarJugador(j);
    return true;
  }

  // 6. Mostrar todos los jugadores ordenados por nombre (alfabético)
  // Usamos TreeSet con Comparator por nombre para asegurar orden alfabético y unicidad.
  public Set<Jugador> obtenerTodosOrdenadosPorNombre() {
    Comparator<Jugador> cmpNombre = Comparator.comparing(Jugador::getNombre).thenComparing(Jugador::getId);
    Set<Jugador> ordenNombre = new TreeSet<>(cmpNombre);
    for (Disciplina d : disciplinas.values()) {
      ordenNombre.addAll(d.getJugadores());
    }
    return ordenNombre;
  }

  // 7. Mostrar todos los jugadores en orden de inscripción
  // Interpretación: mantendremos el orden de inscripción por disciplina (si la disciplina usa LinkedHashSet)
  // y el orden de disciplinas según la inserción en el mapa (LinkedHashMap).
  public List<Jugador> obtenerTodosEnOrdenInscripcion() {
    List<Jugador> lista = new ArrayList<>();
    for (Disciplina d : disciplinas.values()) {
      for (Jugador j : d.getJugadores()) {
        if (!lista.contains(j)) { // evitar duplicados si el mismo estudiante está en varias disciplinas
          lista.add(j);
        }
      }
    }
    return lista;
  }

  // 8. Mostrar ranking de jugadores por ID (de menor a mayor)
  public Set<Jugador> obtenerRankingPorID() {
    // TreeSet usa Comparable<Jugador> que definimos por ID (compareTo).
    Set<Jugador> ranking = new TreeSet<>();
    for (Disciplina d : disciplinas.values()) {
      ranking.addAll(d.getJugadores());
    }
    return ranking;
  }

  // 1. Mostrar jugadores por deporte (simple passthrough)
  public void mostrarJugadoresPorDeporte(String deporte) {
    Disciplina d = disciplinas.get(deporte);
    if (d == null) {
      System.out.println("Disciplina no encontrada: " + deporte);
    } else {
      d.mostrarJugadores();
    }
  }

  // 2. Contar jugadores en cada disciplina
  public void contarJugadoresPorDisciplina() {
    for (Map.Entry<String, Disciplina> e : disciplinas.entrySet()) {
      System.out.println(e.getKey() + ": " + e.getValue().getJugadores().size() + " jugadores");
    }
  }
}
