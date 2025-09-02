package teoria.estaticos.sistemapos.clases;

public class Venta {

  private final int id;
  private Producto producto;
  private int cantidad;

  //  Atributo estático
  private static int contador;

  public Venta(Producto producto, int cantidad) {
    this.id = ++contador;
    this.producto = producto;
    this.cantidad = cantidad;
  }

  public int getId() {
    return id;
  }

  public Producto getProducto() {
    return producto;
  }

  public void setProducto(Producto producto) {
    this.producto = producto;
  }

  public int getCantidad() {
    return cantidad;
  }

  public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
  }

  public double getSubtotal() {
    return producto.getPrecio() * cantidad;
  }

  @Override
  public String toString() {
    return (
      "{id=" +
      id +
      ", producto=" +
      producto +
      ", cantidad=" +
      cantidad +
      ", subtotal=" +
      getSubtotal() +
      "}"
    );
  }
}
