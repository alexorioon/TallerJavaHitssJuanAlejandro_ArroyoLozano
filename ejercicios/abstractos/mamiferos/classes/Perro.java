package ejercicios.abstractos.mamiferos.classes;

import ejercicios.abstractos.mamiferos.abstracts.Canino;

public class Perro extends Canino {

  protected int PSI; // Pounds per Square Inch (libras por pulgada cuadrada)

  public Perro(
    String habitat,
    double altura,
    double largo,
    double peso,
    String nombreCientifico,
    String color,
    double tamanoColmillos,
    int PSI // Pounds per Square Inch (libras por pulgada cuadrada)
  ) {
    super(
      habitat,
      altura,
      largo,
      peso,
      nombreCientifico,
      color,
      tamanoColmillos
    );
    this.PSI = PSI;
  }

  @Override
  public String comer() {
    return String.format(
      "El Perro %s come la carne de su presa con sus colmillos de %.2fcm de tamaño.",
      nombreCientifico,
      tamanoColmillos
    );
  }

  @Override
  public String dormir() {
    return String.format(
      "El Perro %s duerme mientras su altura es de %.2f y su largo es de %.2f unidades.",
      color,
      altura,
      largo
    );
  }

  @Override
  public String correr() {
    return String.format(
      "El Perro corre con un peso de %.2f kg, caza a su presa con una mordida de %d PSI.",
      peso,
      PSI
    );
  }

  @Override
  public String comunicarse() {
    return String.format(
      "El Perro %s se comunica con sus compañeros en %s.",
      nombreCientifico,
      habitat
    );
  }
}
