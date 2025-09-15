package ejercicios.genericos.carritoSupermercado.classes;

public class NonPerishable extends Product {

  private int content;
  private int calories;

  private static int count = 0; // contador de objetos creados
  private static final int MAX = 5; // máximo permitido

  public NonPerishable(String name, double price, int content, int calories) {
    super(name, price);
    if (count >= MAX) {
      throw new IllegalStateException("No se pueden crear más de " + MAX + " productos no perecibles.");
    }
    this.content = content;
    this.calories = calories;
    count++;
  }

  public int getContent() {
    return content;
  }

  public int getCalories() {
    return calories;
  }

  @Override
  public String toString() {
    return """
    NonPerishable {
      name: %s,
      price: %.2f,
      content: %d,
      calories: %d
    }""".formatted(name, price, content, calories);
  }
}
