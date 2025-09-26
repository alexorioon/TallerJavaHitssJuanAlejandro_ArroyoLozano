package teoria.mapas.mapasConObjetos.models;

public class Empleado {
  private int id;
  private String name;
  private String department;
  
  public Empleado(int id, String name, String department) {
    this.id = id;
    this.name = name;
    this.department = department;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getDepartment() {
    return department;
  }

  @Override
  public String toString() {
    return "Empleado [id=" + id + ", name=" + name + ", department=" + department + "]";
  }
  
}
