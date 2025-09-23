package ejercicios.conjuntos.gestionTorneoDeportivo.classes;

public class Jugador implements Comparable<Jugador> {

  private int id;
  private String nombre;

  public Jugador(int id, String nombre) {
    this.id = id;
    this.nombre = nombre;
  }

  public int getId() {
    return id;
  }

  public String getNombre() {
    return nombre;
  }

  @Override
  public int hashCode() {
    return Integer.hashCode(id);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Jugador other = (Jugador) obj;
    return this.id == other.id; // Solo ID importa
  }

  // Por defecto compara por ID (útil para ranking por ID).
  @Override
  public int compareTo(Jugador o) {
    return Integer.compare(this.getId(), o.getId());
    // Si quieres ordenar por nombre en algún TreeSet, usar Comparator externo:
    // return this.nombre.compareTo(o.nombre);
  }

  @Override
  public String toString() {
    return id + " - " + nombre;
  }
}
