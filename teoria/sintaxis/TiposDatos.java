package teoria.sintaxis;

public class TiposDatos {

  static String nombre;

  public static void main(String[] args) {
    int edad = 20;
    System.out.println("Edad: " + edad);
    //TiposDatos objeto = new TiposDatos();
    //objeto.saludar();
    saludar();
  }

  public static void saludar() {
    int edad = 40;
    System.out.println("Edad Método: " + edad);
    System.out.println("Nombre: " + nombre);
  }
}
