package ejercicios.interfacesFuncionales.libreriaUniversitaria.classes;

import java.time.LocalDate;
import java.util.UUID;
import java.util.function.Supplier;

public class Libro {
  private String id;
  private String tittle;
  private String author;
  private LocalDate publicationDate;
  private double price;

  public Libro(String tittle, String author, LocalDate publicationDate, double price) {
    Supplier<String> generar = () -> UUID.randomUUID().toString();
    this.id = generar.get();
    this.tittle = tittle;
    this.author = author;
    this.publicationDate = publicationDate;
    this.price = price;
  }

  public String getId() {
    return id;
  }

  public String getTittle() {
    return tittle;
  }

  public String getAuthor() {
    return author;
  }

  public LocalDate getPublicationDate() {
    return publicationDate;
  }

  public double getPrice() {
    return price;
  }
}
