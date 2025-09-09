package teoria.genericos.ejemplo1.genericos;

public class Prueba {
    public static void main(String[] args) {
        Caja<String> caja1 = new Caja<>();
        caja1.set("'Factura'");
        System.out.println("Caja 1 contiene: " + caja1.get());

        Caja<Double> caja2 = new Caja<>();
        caja2.set(125.4);
        System.out.println("Caja 2 contiene " + caja2.get());

        System.out.println("Máximo(20, 35): " + Utilerias.maximo(20, 35));
        
        System.out.println("Máximo(java, python): " + Utilerias.maximo("Java", "Python"));
    }
}
