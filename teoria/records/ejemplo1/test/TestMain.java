package teoria.records.ejemplo1.test;

import teoria.records.ejemplo1.record.Producto;

public class TestMain {
    public static void main(String[] args) {
        Producto p1 = new Producto("Leche Santa Clara", 30.4);
        Producto p2 = new Producto("Leche Lala", 23.5);

        System.out.println(p1);
        System.out.println(p1.mensaje());

        System.out.println("==========Producto 2==========");
        System.out.println(p2.descripcion());
    }
}
