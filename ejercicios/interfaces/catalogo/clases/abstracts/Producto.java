package ejercicios.interfaces.catalogo.clases.abstracts;

import ejercicios.interfaces.catalogo.interfaces.IProducto;

public abstract class Producto implements IProducto {

  /*La clase abstracta Producto implementa la interface IProducto. (Método getPrecioVenta())
    Atributo precio con su respectivo método getter y el constructor. */
  private int precio;
  
  public Producto(int precio) {
    this.precio = precio;
  }
  
  @Override
  public double getPrecioVenta() {
    return precio * 1.25;
  }

  @Override
  public int getPrecio() {
    return precio;
  }
  
}
