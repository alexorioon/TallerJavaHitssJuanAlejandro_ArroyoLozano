package sintaxis;

public class Operadores {
    public static void main(String[] args) {
        int a = 13, b = 5;

        // Operadores aritméticos
        System.out.println("Suma (a+b): " + (a + b));
        System.out.println("Resta (a-b): " + (a - b));
        System.out.println("Multiplicación (a*b): " + a * b);
        System.out.println("División (a/b): " + (float) a / b);
        System.out.println("Módulo (a%b): " + a % b);

        // Operadores de asignación
        a = 14;
        a += 5; // a = a + 5
        System.out.println("Valor de a: " + a);
        a -= 5; // a = a - 5
        a *= 2; // a = a * 2
        a /= 3; // a = a / 3
        a %= 2; // a = a % 2
        System.out.println("Valor de a: " + a);

        // Operadores de comparación
        System.out.println("Igual: " + (a == b));
        System.out.println("Distinto: " + (a != b));
        System.out.println("Mayor que: " + (a > b));
        System.out.println("Menor que: " + (a < b));
        System.out.println("Mayor o igual que: " + (a >= b));
        System.out.println("Menor o igual que: " + (a <= b));

        // Operadores lógicos

    }
}
