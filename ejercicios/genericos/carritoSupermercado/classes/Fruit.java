package ejercicios.genericos.carritoSupermercado.classes;

public class Fruit extends Product {
  private double weight;
  private String color;

  private static int count = 0; // contador de objetos creados
  private static final int MAX = 5; // máximo permitido

  public Fruit(String name, double price, double weight, String color) {
    super(name, price);
    if (count >= MAX) {
      throw new IllegalStateException("No se pueden crear más de " + MAX + " productos de fruta.");
    }
    this.weight = weight;
    this.color = color;
    count++;
  }

  public double getWeight() {
    return weight;
  }

  public String getColor() {
    return color;
  }

  @Override
  public String toString() {
    return """
    Fruit {
      name: %s,
      price: %.2f,
      weight: %.2f,
      color: %s
    }""".formatted(name, price, weight, color);
  }
  
}
