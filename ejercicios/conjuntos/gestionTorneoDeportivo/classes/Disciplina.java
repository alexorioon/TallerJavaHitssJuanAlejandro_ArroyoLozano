package ejercicios.conjuntos.gestionTorneoDeportivo.classes;

import java.util.Set;

public class Disciplina {
  private Set<Jugador> jugadores;
  private String nombre;

  // Recibe la implementación de Set (HashSet, LinkedHashSet, TreeSet con Comparator, etc.)
  public Disciplina(String nombre, Set<Jugador> jugadores) {
    this.nombre = nombre.trim().toLowerCase();
    this.jugadores = jugadores;
  }
  
  public String getNombre() {
    return nombre;
  }

  public Set<Jugador> getJugadores() {
    return jugadores;
  }

  public void registrarJugador(Jugador j){
    if (jugadores.add(j)) {
      System.out.println("Jugador registrado correctamente: " + j);
    } else {
      System.out.println("No se registró. Jugador ya existe en la disciplina: " + j);
    }
  }

  public void eliminarJugador(Jugador j){
    if (jugadores.remove(j)) {
      System.out.println("Jugador eliminado correctamente: " + j);
    } else {
      System.out.println("No se encontró al jugador: " + j);
    }
  }

  public boolean buscarJugadorPorId(int id){
    for (Jugador j : jugadores) {
      if (j.getId() == id) return true;
    }
    return false;
  }

  public Jugador obtenerJugadorPorId(int id) {
    for (Jugador j : jugadores) {
      if (j.getId() == id) return j;
    }
    return null;
  }

  // Muestra jugadores según la iteración que da el Set (HashSet no ordenado,
  // LinkedHashSet orden inscripción, TreeSet orden natural o comparator).
  public void mostrarJugadores(){
    if (jugadores.isEmpty()) {
      System.out.println("No hay jugadores inscritos en " + nombre);
      return;
    }
    System.out.println("Jugadores en " + nombre + ":");
    for (Jugador j : jugadores) {
      System.out.println("  " + j);
    }
  }
}
