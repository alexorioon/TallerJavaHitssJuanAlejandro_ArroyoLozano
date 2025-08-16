package entradas;

public class Cadenas {
    public static void main(String[] args) {
        String nombre = "   J. Alejandro Arroyo Lozano  ";
        String nombre1 = "J. AlejaNdro ARroYo Lozano";
        System.out.println("lenght() " + nombre.length());
        System.out.println("==: " + (nombre == nombre1)); // No es recomedable para comparar objetos
        System.out.println("equals(String b): " + nombre.equals(nombre1));
        System.out.println("equalIgnoreCase(String b): " + nombre.equalsIgnoreCase(nombre1));
        System.out.println("charAt(int i): " + nombre.charAt(20));
        System.out.println("nombre: " + nombre);
        System.out.println("trim(): " + nombre.trim());
        System.out.println("substring(int a, int b): " + nombre1.substring(3, 12));
        System.out.println("substring(int i): " + nombre1.substring(13));
        System.out.println("indexOf(String cadena): " + nombre1.indexOf("ARroYo"));
        System.out.println("lastIndexOf(String cadena): " + nombre1.lastIndexOf("ARroYo"));
        System.out.println("" + nombre1.startsWith("J"));
        System.out.println("" + nombre1.endsWith("o"));
        
    }
}
