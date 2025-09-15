package ejercicios.genericos.carritoSupermercado.classes;

public class Dairy extends Product {

  private int amount;
  private int proteins;

  private static int count = 0; // contador de objetos creados
  private static final int MAX = 5; // máximo permitido

  public Dairy(String name, double price, int amount, int proteins) {
    super(name, price);
    if (count >= MAX) {
      throw new IllegalStateException("No se pueden crear más de " + MAX + " productos lácteos.");
    }
    this.amount = amount;
    this.proteins = proteins;
    count++;
  }

  public int getAmount() {
    return amount;
  }

  public int getProteins() {
    return proteins;
  }

  @Override
  public String toString() {
    return """
    Dairy {
      name: %s,
      price: %.2f,
      amount: %d,
      proteins: %d
    }""".formatted(name, price, amount, proteins);
  }
}
