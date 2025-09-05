package ejercicios.interfaces.catalogo.clases;

import ejercicios.interfaces.catalogo.clases.abstracts.Electronico;

/*Clase Iphone extends de Electronico.
  Implementa getPrecioVenta() de la interface IProducto a través de herencia.
  Atributos: int pulgada*/
public class TvLcd extends Electronico {

  private int pulgada;

  public TvLcd(String fabricante, int precio, int pulgada) {
    super(fabricante, precio);
    this.pulgada = pulgada;
  }

  public int getPulgada() {
    return pulgada;
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
      "TvLcd{fabricante:'%s', precio:%d, pulgada:%d}",
      getFabricante(),
      getPrecio(),
      getPulgada()
    );
  }
}
