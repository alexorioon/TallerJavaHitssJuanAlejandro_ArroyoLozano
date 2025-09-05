package ejercicios.abstractos.mamiferos.classes;

import ejercicios.abstractos.mamiferos.abstracts.Felino;

public class Leon extends Felino {

  protected int numManada;
  protected double decibelesRugido;

  public Leon(
    String habitat,
    double altura,
    double largo,
    double peso,
    String nombreCientifico,
    double tamanoGarras,
    int velocidad,
    int numManada,
    double decibelesRugido
  ) {
    super(
      habitat,
      altura,
      largo,
      peso,
      nombreCientifico,
      tamanoGarras,
      velocidad
    );
    this.numManada = numManada;
    this.decibelesRugido = decibelesRugido;
  }

  @Override
  public String comer() {
    return String.format(
      "El Leon %s come carne de su presa con garras de %.2f cm.",
      nombreCientifico,
      tamanoGarras
    );
  }

  @Override
  public String dormir() {
    return String.format(
      "El león %s duerme en %s, tiene una altura de %.2f y un largo de %.2f unidades.",
      nombreCientifico,
      habitat,
      altura,
      largo
    );
  }

  @Override
  public String correr() {
    return String.format(
      "El león %s corre a una velocidad de %d km/h con un peso de %.2f kg.",
      nombreCientifico,
      velocidad,
      peso
    );
  }

  @Override
  public String comunicarse() {
    return String.format(
      "El león se comunica mediante rugidos de %.2f decibeles con su manada de %d miembros.",
      decibelesRugido,
      numManada
    );
  }
}
