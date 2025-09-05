package ejercicios.interfaces.catalogo.clases;

import ejercicios.interfaces.catalogo.clases.abstracts.Electronico;

/*Clase Iphone extends de Electronico.
  Implementa getPrecioVenta() de la interface IProducto a través de herencia.
  Atributos: String color, String modelo*/
public class Iphone extends Electronico {

  private String color;
  private String modelo;

  public Iphone(String fabricante, int precio, String color, String modelo) {
    super(fabricante, precio);
    this.color = color;
    this.modelo = modelo;
  }

  public String getColor() {
    return color;
  }

  public String getModelo() {
    return modelo;
  }

  @Override
  public String getFabricante() {
    return super.getFabricante();
  }

  @Override
  public int getPrecio() {
    return super.getPrecio();
  }

  @Override
  public double getPrecioVenta() {
    return super.getPrecioVenta();
  }

  @Override
  public String toString() {
    return String.format(
      "Iphone{fabricante:'%s', precio:%d, color:'%s', modelo:'%s'}",
      getFabricante(),
      getPrecio(),
      getColor(),
      getModelo()
    );
  }
}
