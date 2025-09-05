package ejercicios.abstractos.mamiferos.classes;

import ejercicios.abstractos.mamiferos.abstracts.Felino;

public class Guepardo extends Felino {

  public Guepardo(
    String habitat,
    double altura,
    double largo,
    double peso,
    String nombreCientifico,
    double tamanoGarras,
    int velocidad
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
  }

  @Override
  public String comer() {
    return String.format(
      "El Guepardo %s come carne de su presa, con un tamaño de garras de %.2fcm.",
      nombreCientifico,
      tamanoGarras
    );
  }

  @Override
  public String dormir() {
    return String.format(
      "El Guepardo %s duerme, tiene una altura de %.2f y un largo de %.2f unidades.",
      nombreCientifico,
      altura,
      largo
    );
  }

  @Override
  public String correr() {
    return String.format(
      "El Guepardo %s corre a una velocidad de %dkm/h, con un peso de %.2fkg.",
      nombreCientifico,
      velocidad,
      peso
    );
  }

  @Override
  public String comunicarse() {
    return String.format(
      "El Guepardo %s se comunica mediante maullidos y gruñidos en su hábitat %s.",
      nombreCientifico,
      habitat
    );
  }
}
