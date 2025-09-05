package ejercicios.interfaces.catalogo.clases;

import ejercicios.interfaces.catalogo.clases.abstracts.Producto;
import ejercicios.interfaces.catalogo.interfaces.ILibro;
import java.time.LocalDate;

/*Clase Libro extends de Producto.
  Implementa getPrecioVenta() de la interface IProducto a través de herencia.
  Atributos: LocalDate fechaPublicacion, String autor, String titulo, String editorial*/
public class Libro extends Producto implements ILibro {

  private LocalDate fechaPublicacion;
  private String autor;
  private String titulo;
  private String editorial;

  public Libro(
    int precio,
    LocalDate fechaPublicacion,
    String autor,
    String titulo,
    String editorial
  ) {
    super(precio);
    this.fechaPublicacion = fechaPublicacion;
    this.autor = autor;
    this.titulo = titulo;
    this.editorial = editorial;
  }

  @Override
  public int getPrecio() {
    return super.getPrecio();
  }

  @Override
  public LocalDate getFechaPublicacion() {
    return fechaPublicacion;
  }

  @Override
  public String getAutor() {
    return autor;
  }

  @Override
  public String getTitulo() {
    return titulo;
  }

  @Override
  public String getEditorial() {
    return editorial;
  }

  @Override
  public double getPrecioVenta() {
    return super.getPrecioVenta();
  }

  @Override
  public String toString() {
    return String.format(
      "Libro{precio:%d, fechaPublicacion:%s, autor:'%s', titulo:'%s', editorial:'%s'}",
      getPrecio(),
      getFechaPublicacion(),
      getAutor(),
      getTitulo(),
      getEditorial()
    );
  }
}
