package ejercicios.genericos.carritoSupermercado.test;

import ejercicios.genericos.carritoSupermercado.classes.Cleaning;
import ejercicios.genericos.carritoSupermercado.classes.Dairy;
import ejercicios.genericos.carritoSupermercado.classes.Fruit;
import ejercicios.genericos.carritoSupermercado.classes.NonPerishable;
import ejercicios.genericos.carritoSupermercado.service.Cart;

public class TestMain {

  public static void main(String[] args) {
    // Creamos los carritos de diferentes tipos de productos
    Cart<Cleaning> cleaningProducts = new Cart<>();
    Cart<Dairy> dairyProducts = new Cart<>();
    Cart<Fruit> fruitProducts = new Cart<>();
    Cart<NonPerishable> nonPerishableProducts = new Cart<>();
    
    //  Agregamos productos a los carritos correspondientes
    try {
      cleaningProducts.addProduct(new Cleaning("Limpiador multiusos", 45,"tensioactivos aniónicos, fragancia, colorante, agua", 1));
      cleaningProducts.addProduct(new Cleaning("Jabón para trastes", 38, "surfactantes aniónicos, glicerina, fragancia cítrica, conservadores", 0.75));
      cleaningProducts.addProduct(new Cleaning("Limpiador de vidrios", 50, "amoníaco, alcohol isopropílico, colorante azul, agua", 0.9));
      cleaningProducts.addProduct(new Cleaning("Detergente para ropa líquido", 120, "tensioactivos aniónicos y no iónicos, enzimas, blanqueadores ópticos, fragancia", 3));
      cleaningProducts.addProduct(new Cleaning("Toallitas desinfectantes", 55, "agua, alcohol etílico, cloruro de benzalconio, fragancia", 0.5));
      
      dairyProducts.addProduct(new Dairy("Leche entera", 25.5, 1000, 8));
      dairyProducts.addProduct(new Dairy("Yogur natural", 12, 125, 5));
      dairyProducts.addProduct(new Dairy("Queso manchego", 80, 200, 14));
      dairyProducts.addProduct(new Dairy("Leche deslactosada light", 27, 1000, 9));
      dairyProducts.addProduct(new Dairy("Queso cottage", 35, 400, 11));
      //dairyProducts.addProduct(new Dairy("Queso badón XD", 1, 17, 500));
      
      fruitProducts.addProduct(new Fruit("Manzana", 18.50, 0.200, "Rojo"));
      fruitProducts.addProduct(new Fruit("Plátano", 22.00, 0.120, "Amarillo"));
      fruitProducts.addProduct(new Fruit("Naranja", 15.00, 0.250, "Naranja"));
      fruitProducts.addProduct(new Fruit("Uva", 40.00, 0.500, "Morado"));
      fruitProducts.addProduct(new Fruit("Sandía", 80.00, 5.000, "Verde con rojo por dentro"));
      
      nonPerishableProducts.addProduct(new NonPerishable("Arroz", 25.00, 1000, 3500));
      nonPerishableProducts.addProduct(new NonPerishable("Frijoles enlatados", 18.00, 430, 350));
      nonPerishableProducts.addProduct(new NonPerishable("Atún enlatado", 22.00, 140, 150));
      nonPerishableProducts.addProduct(new NonPerishable("Pasta", 20.00, 500, 1800));
      nonPerishableProducts.addProduct(new NonPerishable("Aceite vegetal", 48.00, 1000, 9000));
      
      // Intentamos agregar un sexto producto para probar la restricción
      nonPerishableProducts.addProduct(new NonPerishable("TEST", 1, 1, 1));
    } catch (Exception e) {
      System.out.println("ERROR: " + e.getMessage());
    }

    //  Mostramos los productos de cada carrito
    cleaningProducts.getProducts().forEach(product -> System.out.println(product));

    for (Dairy dairyProduct : dairyProducts.getProducts()) {
      System.out.println(dairyProduct);
    }

    for (Fruit fruitProduct : fruitProducts.getProducts()) {
      System.out.println(fruitProduct);
    }

    for (NonPerishable nonPerishableProduct : nonPerishableProducts.getProducts()) {
      System.out.println(nonPerishableProduct);
    }
  }
}
