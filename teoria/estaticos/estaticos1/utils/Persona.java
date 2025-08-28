package teoria.estaticos.estaticos1.utils;

public class Persona {
    private String nombre;
    private int edad;

    //  Atributo para contar cuántos objetos se van creando
    private static int contador;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        ++contador;
    }

    public static int getContador() {
        return contador;
    }

    @Override
    public String toString() {
        return "{nombre=" + nombre + ", edad=" + edad + "}";
    }
    
}
