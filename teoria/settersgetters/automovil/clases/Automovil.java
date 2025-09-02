package teoria.settersgetters.automovil.clases;

public class Automovil {

  //  Atributos
  private String marca = "Toyota";
  private String color;
  private int anio;

  //  Métodos
  public Automovil() {}

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getAnio() {
    return anio;
  }

  public void setAnio(int anio) {
    this.anio = anio;
  }
}
