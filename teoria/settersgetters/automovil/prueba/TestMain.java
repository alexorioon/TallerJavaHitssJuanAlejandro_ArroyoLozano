package teoria.settersgetters.automovil.prueba;

//  import teoria.settersgetters.automovil.clases.Automovil;
import teoria.settersgetters.automovil.clases.Calculadora;
import teoria.settersgetters.automovil.clases.Persona;

public class TestMain {
    public static void main(String[] args) {
        /* Automovil auto = new Automovil();
        auto.setColor("Rojo");
        auto.setAnio(2023);
        System.out.println("Marca: " + auto.getMarca());
        System.out.println("Color: " + auto.getColor());
        System.out.println("Año: " + auto.getColor());
        System.out.println("-----------------------------------------");
        Persona persona = new Persona();
        persona.crearAutomovil(); */

        Calculadora cal = new Calculadora();
        int suma = cal.suma(4, 5);
        System.out.println("Suma de dos enteros: " + suma);
        suma = cal.suma(5, 10, 20);
        System.out.println("Suma de tres enteros: " + suma);
        double sumaDouble = cal.suma(34.5, 5);
        System.out.println("Suma de doubles: " + sumaDouble);
        cal.saludar("Alex");

        Persona persona = new Persona("Alex", 24);
        System.out.println(persona);

        Persona p1 = new Persona("Alex", 24);
        System.out.println(p1);

        System.out.println("Son iguales?: " + (persona.equals(p1)));
    }
}
