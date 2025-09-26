package ejercicios.mapas.inventarioTiendaDeportes.classes;

public class Producto {
  private String sku;
  private String name;
  private String categorie;
  private int stock;

  public Producto(String sku, String name, String categorie, int stock) {
    this.sku = sku;
    this.name = name;
    this.categorie = categorie;
    this.stock = stock;
  }

  public String getSku() {
    return sku;
  }

  public String getName() {
    return name;
  }

  public String getCategorie() {
    return categorie;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

  @Override
  public String toString() {
    return String.format("sku:'%s', name:'%s', categorie:'%s', stock:%d", sku, name, categorie, stock);
  }
}
