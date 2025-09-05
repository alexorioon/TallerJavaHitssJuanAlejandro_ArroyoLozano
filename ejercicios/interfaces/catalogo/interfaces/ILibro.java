package ejercicios.interfaces.catalogo.interfaces;

import java.time.LocalDate;

public interface ILibro {
  /* La interface ILibro con 4 firmas de métodos:
   * 1. LocalDate getFechaPublicacion();
   * 2. String getAutor();
   * 3. String getTitulo();
   * 4. String getEditorial();
   */
  public LocalDate getFechaPublicacion();
  public String getAutor();
  public String getTitulo();
  public String getEditorial();
}
