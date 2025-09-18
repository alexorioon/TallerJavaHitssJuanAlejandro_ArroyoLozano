package teoria.listas.modelos;

public class Persona /* implements Comparable<Persona> */{
  private int id;
  private String name;
  private int age;
  
  public Persona(int id, String name, int age) {
    this.id = id;
    this.name = name;
    this.age = age;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Persona {id: " + id + ", name: " + name + ", age: " + age + "}";
  }

  /* @Override
  public int compareTo(Persona o) {
    //  Odenar de forma natural(Ascendente) por nombre
    return this.name.compareTo(o.name);  // Por String
    //return Integer.compare(this.age, o.age);  // Por Integer
  } */
}
