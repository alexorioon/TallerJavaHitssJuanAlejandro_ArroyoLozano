package ejercicios.genericos.carritoSupermercado.classes;

public class Cleaning extends Product {
  private String components;
  private double liters;

  private static int count = 0; // contador de objetos creados
  private static final int MAX = 5; // máximo permitido

  public Cleaning(String name, double price, String components, double liters) {
    super(name, price);
    if (count >= MAX) {
      throw new IllegalStateException("No se pueden crear más de " + MAX + " productos de limpieza.");
    }
    this.components = components;
    this.liters = liters;
    count++;
  }

  public String getComponents() {
    return components;
  }

  public double getLiters() {
    return liters;
  }

  @Override
  public String toString() {
    return """
    Cleaning {
      name: %s,
      price: %.2f,
      components: %s,
      liters: %.2f
    }""".formatted(name, price, components, liters);
  }
}
