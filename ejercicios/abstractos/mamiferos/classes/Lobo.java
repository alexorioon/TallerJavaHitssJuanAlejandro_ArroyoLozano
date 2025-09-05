package ejercicios.abstractos.mamiferos.classes;

import ejercicios.abstractos.mamiferos.abstracts.Canino;

public class Lobo extends Canino {

  protected int numCamada;
  protected String especieLobo;

  public Lobo(
    String habitat,
    double altura,
    double largo,
    double peso,
    String nombreCientifico,
    String color,
    double tamanoColmillos,
    int numCamada,
    String especieLobo
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
    this.numCamada = numCamada;
    this.especieLobo = especieLobo;
  }

  @Override
  public String comer() {
    return String.format(
      "El Lobo %s come carne, es de la especie %s.",
      nombreCientifico,
      especieLobo
    );
  }

  @Override
  public String dormir() {
    return String.format(
      "El Lobo %s duerme con unas dimensiones de  %.2f de altura y %.2f de largo.",
      color,
      altura,
      largo
    );
  }

  @Override
  public String correr() {
    return String.format(
      "El Lobo %s corre en %s con un peso de %.2f kg.",
      color,
      habitat,
      peso
    );
  }

  @Override
  public String comunicarse() {
    return String.format(
      "El Lobo %s se comunica con su camada de %d integrantes mediante gruñidos y ladridos.",
      nombreCientifico,
      numCamada
    );
  }
}
