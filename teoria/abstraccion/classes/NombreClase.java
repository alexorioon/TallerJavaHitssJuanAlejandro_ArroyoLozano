package teoria.abstraccion.classes;

public abstract class NombreClase {

  //  Atributos normales
  protected String nombre;

  //  Método (s) abstracto (s) ==> sin cuerpo, lo deben implementar las subclases
  public abstract void metodoAbstracto(String nombre);

  //  Método (s) concreto (s) ==> con cuerpo
  public void mostrarInfo() {
    System.out.println("Nombre: " + nombre);
  }
}
