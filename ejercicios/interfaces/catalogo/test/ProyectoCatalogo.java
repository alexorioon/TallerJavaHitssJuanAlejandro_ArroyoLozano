package ejercicios.interfaces.catalogo.test;

import ejercicios.interfaces.catalogo.clases.Comic;
import ejercicios.interfaces.catalogo.clases.Iphone;
import ejercicios.interfaces.catalogo.clases.Libro;
import ejercicios.interfaces.catalogo.clases.TvLcd;
import ejercicios.interfaces.catalogo.interfaces.IProducto;
import java.time.LocalDate;

public class ProyectoCatalogo {
  public static void main(String[] args) {
    IProducto[] productos = new IProducto[10]; // Array con 10 espacios para productos
    productos[0] = new Iphone("Apple", 19999, "Gris", "iPhone 15 Pro Max");
    productos[1] = new TvLcd("Samsung", 11999, 55);
    productos[2] = new Libro(
      392,
      LocalDate.of(2025, 5, 1),
      "Uli Moreno Montana, Laura Falces",
      "Te vas a morir y todavía no has empezado a vivir: 29 principios para vivir mejor (y con más sentido)",
      "Monteam Editorial"
    );
    productos[3] = new Comic(
      344,
      LocalDate.of(2023, 7, 11),
      "Cory Walker, Robert Kirkman",
      "Invincible Volume 1 (New Edition)",
      "Image Comics",
      "Invincible"
    );
    productos[4] = new Iphone("Apple", 8399, "Blanco", "iPhone 12 Pro Max");
    productos[5] = new Libro(
      246,
      LocalDate.of(2020, 9, 1),
      "Agustina Bazterrica",
      "Cadáver exquisito",
      "Penguin Random House Grupo Editorial"
    );
    productos[6] = new TvLcd("LG", 7199, 43);
    productos[7] = new Comic(
      255,
      LocalDate.of(2012, 11, 14),
      "Cullen Bunn,  Dalibor Talajic, Kaare Andrews",
      "Deadpool Kills the Marvel Universe",
      "Marvel",
      "Deadpool"
    );
    productos[8] = new Iphone("Apple", 24799, "Titatio Blanco", "iPhone 16 Pro Max");
    productos[9] = new TvLcd("Sony", 15999, 65);
    
    //  Imprime los objetos en consola con ayuda del método toString()
    for (IProducto producto : productos) {
      System.out.println(producto.toString());
      System.out.println("=======================================================================");
    }
    
    // Imprime el precio de venta de cada producto en el catálogo
    // Se recorre el array de productos y se muestra el precio de venta formateado a dos decimales
    for (int i = 0; i < productos.length; i++) {
      System.out.println(
        "El precio de venta del producto " +
        (i + 1) +
        " es: $" +
        String.format("%.2f", productos[i].getPrecioVenta())
      );
    }
  }
}
