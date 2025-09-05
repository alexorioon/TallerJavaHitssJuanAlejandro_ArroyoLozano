package ejercicios.interfaces.catalogo.clases;

import java.time.LocalDate;

/*Clase Comic extends de Libro.
  Implementa getPrecioVenta() de la interface IProducto a través de herencia.
  Atributos: String personaje*/
public class Comic extends Libro {

  private String personaje;

  public Comic(
    int precio,
    LocalDate fechaPublicacion,
    String autor,
    String titulo,
    String editorial,
    String personaje
  ) {
    super(precio, fechaPublicacion, autor, titulo, editorial);
    this.personaje = personaje;
  }

  public String getPersonaje() {
    return personaje;
  }

  @Override
  public String getAutor() {
    return super.getAutor();
  }

  @Override
  public String getEditorial() {
    return super.getEditorial();
  }

  @Override
  public LocalDate getFechaPublicacion() {
    return super.getFechaPublicacion();
  }

  @Override
  public int getPrecio() {
    return super.getPrecio();
  }

  @Override
  public String getTitulo() {
    return super.getTitulo();
  }

  @Override
  public double getPrecioVenta() {
    return super.getPrecioVenta();
  }

  @Override
  public String toString(){
    return String.format(
      "Comic{precio:%d, fechaPublicacion:%s, autor:'%s', titulo:'%s', editorial:'%s', personaje:'%s'}",
      getPrecio(),
      getFechaPublicacion(),
      getAutor(),
      getTitulo(),
      getEditorial(),
      getPersonaje()
    );
  }
}
