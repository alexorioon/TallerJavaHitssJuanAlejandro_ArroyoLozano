package teoria.conjuntos.ejemplo1.modelos;

public class Alumno implements Comparable<Alumno>{

  private int id;
  private String name;
  private double grade;

  public Alumno(int id, String name, double grade) {
    this.id = id;
    this.name = name;
    this.grade = grade;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public double getGrade() {
    return grade;
  }

  @Override
  public String toString() {
    return "Alumno {id: " + id + ", name: " + name + ", grade: " + grade + "}";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + id;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    Alumno other = (Alumno) obj;
    if (id != other.id) return false;
    if (name == null) {
      if (other.name != null) return false;
    } else if (!name.equals(other.name)) return false;
    return true;
  }

  @Override
  public int compareTo(Alumno o) {
    return Integer.compare(this.getId(), o.getId());
    //return this.name.compareTo(o.name);
  }
}
