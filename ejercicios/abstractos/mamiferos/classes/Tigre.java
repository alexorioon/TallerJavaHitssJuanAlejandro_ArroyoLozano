package ejercicios.abstractos.mamiferos.classes;

import ejercicios.abstractos.mamiferos.abstracts.Felino;

public class Tigre extends Felino {

  protected String especieTigre;

  public Tigre(
    String habitat,
    double altura,
    double largo,
    double peso,
    String nombreCientifico,
    double tamanoGarras,
    int velocidad,
    String especieTigre
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
    this.especieTigre = especieTigre;
  }

  @Override
  public String comer() {
    return String.format(
      "El Tigre %s come carne de su presa con garras de %.2fcm de tamaño.",
      nombreCientifico,
      tamanoGarras
    );
  }

  @Override
  public String dormir() {
    return String.format(
      "El Tigre %s duerme en %s con una altura de %.2f y un largo de %.2f unidades.",
      especieTigre,
      habitat,
      altura,
      largo
    );
  }

  @Override
  public String correr() {
    return String.format(
      "El Tigre %s corre a una velocidad de %dkm/h, tiene un peso de %.2fkg.",
      nombreCientifico,
      velocidad,
      peso
    );
  }

  @Override
  public String comunicarse() {
    return String.format(
      "El Tigre %s se comunica mediante maullidos y gruñidos, es de la especie %s.",
      nombreCientifico,
      especieTigre
    );
  }
}
