package ejercicios.genericos.facturacion.classes;

import ejercicios.genericos.facturacion.generics.Identificable;

import java.util.ArrayList;
import java.util.List;

public class Factura implements Identificable<Integer> {

  private Integer id;
  private Cliente cliente;
  private List<Producto> productos;

  public Factura(Integer id, Cliente cliente, List<Producto> productos) {
    this.id = id;
    this.cliente = cliente;
    this.productos = new ArrayList<>(productos);
  }

  @Override
  public Integer getId() {
    return id;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public List<Producto> getProductos() {
    return productos;
  }

  // Método dinámico para agregar un producto a la lista de productos
  public void agregarProducto(Producto producto) {
    this.productos.add(producto);
    System.out.println("Producto agregado: " + producto);
  }

  // Eliminar un producto de la lista de productos
  public boolean eliminarProducto(int id) {
    for (int i = 0; i < productos.size(); i++) {
      if (productos.get(i).getId() == id) {
        Producto producto = productos.remove(i);
        System.out.println("Producto eliminado: " + producto);
        return true;
      }
    }
    System.out.println("No se encontró el producto con ID: " + id);
    return false;
  }

  public double calcuarTotal(){
    double total = 0;
    for (Producto producto : productos) {
      total += producto.getPrecio();
    }
    return total;
  }

  //  Generar el ticket factura
  public String generarReporte(){
    StringBuilder sb = new StringBuilder();
    sb.append("\n==========FACTURA #").append(id).append("==========\n");
    sb.append("Cliente: ").append(cliente.getNombre()).append("\n");
    sb.append("---------------------------------------\n");
    for (Producto producto : productos) {
      sb.append(producto.getDescripcion()).append("\t\t$").append(producto.getPrecio()).append("\n");
    }
    sb.append("---------------------------------------\n");
    sb.append("Total: $").append(calcuarTotal()).append("\n");
    sb.append("---------------------------------------\n");
    return sb.toString();
  }

  @Override
  public String toString() {
    return "Factura {id: " + id + ", cliente: " + cliente + ", productos: " + productos + ", Total: " + calcuarTotal() + "}";
  }
  
}
