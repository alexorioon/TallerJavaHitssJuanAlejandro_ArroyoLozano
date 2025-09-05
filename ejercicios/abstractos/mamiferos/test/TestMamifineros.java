package ejercicios.abstractos.mamiferos.test;

import ejercicios.abstractos.mamiferos.abstracts.Mamifero;
import ejercicios.abstractos.mamiferos.classes.Leon;
import ejercicios.abstractos.mamiferos.classes.Tigre;
import ejercicios.abstractos.mamiferos.classes.Guepardo;
import ejercicios.abstractos.mamiferos.classes.Lobo;
import ejercicios.abstractos.mamiferos.classes.Perro;

public class TestMamifineros {
  public static void main(String[] args) {
    // Lista para almacenar diferentes tipos de mamíferos
    Mamifero[] mamiferos = {
      new Leon("pradera", 1.2, 2.0, 150.0, "Panthera leo", 8.5, 60, 10, 120.0),
      new Tigre("bosque", 1.0, 1.8, 180.0, "Panthera tigris", 6.0, 50, "tigre mamalon"),
      new Guepardo("sabana", 0.8, 1.2, 50.0, "Acinonyx jubatus", 4.0, 80),
      new Lobo("tundra", 0.6, 0.9, 30.0, "Canis lupus", "gris", 3.5, 5, "lobo"),
      new Perro("ciudad", 0.5, 0.7, 25.0, "Canis familiaris", "marrón", 2.0, 15),
      new Leon("desierto", 1.0, 1.5, 100.0, "Panthera leo", 7.0, 55, 8, 110.0),
      new Tigre("bosque tropical", 1.1, 1.9, 190.0, "Panthera tigris indica", 6.5, 55, "tigre indio"),
      new Guepardo("sabana", 0.9, 1.3, 60.0, "Acinonyx jubatus", 3.8, 90),
      new Lobo("montaña", 0.7, 1.0, 35.0, "Canis lupus arctos", "blanco", 4.0, 4, "lobo alpino"),
      new Perro("ciudad", 0.6, 0.8, 20.0, "Canis familiaris", "negro", 1.8, 10),
      new Leon("pradera", 1.3, 2.2, 160.0, "Panthera leo", 8.2, 65, 12, 130.0)
    };
    
    // Iteramos sobre cada instancia del array y llamamos a los métodos abstractos
    for (Mamifero mamifero : mamiferos) {
      System.out.println("=== Información del Mamífero ===");
      System.out.println("Nombre Científico: " + mamifero.getNombreCientifico());
      System.out.println("Hábitat: " + mamifero.getHabitat());
      System.out.println("Peso: " + mamifero.getPeso() + " kg");
      System.out.println("Altura: " + mamifero.getAltura() + " unidades");
      System.out.println("Largo: " + mamifero.getLargo() + " unidades");
      System.out.println("Comer: " + mamifero.comer());
      System.out.println("Dormir: " + mamifero.dormir());
      System.out.println("Correr: " + mamifero.correr());
      System.out.println("Comunicarse: " + mamifero.comunicarse());
      System.out.println("---------------------------------------------------------------------------------------------");
    }
  }
}
