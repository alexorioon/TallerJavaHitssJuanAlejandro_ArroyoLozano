package sintaxis;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // char
        char variableChar = 'd';
        System.out.println("Char: " + variableChar);

        // boolean
        boolean esValido = true;
        System.out.println("Boolean: " + esValido);

        // Entero ==> byte
        byte enteroByte = 127;
        System.out.println("Byte: " + enteroByte);
        System.out.println("Valor mínimo del byte: " + Byte.MIN_VALUE);
        System.out.println("Valor máximo del byte: " + Byte.MAX_VALUE);

        // Entero ==> short
        short enteroShort = 32767;
        System.out.println("Short: " + enteroShort);
        System.out.println("Valor mínimo del short: " + Short.MIN_VALUE);
        System.out.println("Valor máximo del short: " + Short.MAX_VALUE);

        // Entero ==> int
        int entero = 323434;
        System.out.println("Entero: " + entero);
        System.out.println("Valor mínimo del entero: " + Integer.MIN_VALUE);
        System.out.println("Valor máximo del entero: " + Integer.MAX_VALUE);

        // Entero ==> Long
        long enteroLong = 9223372036854775807L;
        System.out.println("Entero Long: " + enteroLong);
        System.out.println("Valor mínimo del long: " + Long.MIN_VALUE);
        System.out.println("Valor máximo del long: " + Long.MAX_VALUE);

        // Flotante o decimal ==> Float
        float numeroRealFloat = 3.45E-3F;
        System.out.println("Float: " + numeroRealFloat);
        System.out.println("Valor mínimo del float: " + Float.MIN_VALUE);
        System.out.println("Valor máximo del float: " + Float.MAX_VALUE);

        // Flotante o decimal ==> Double
        double numeroDouble = 12.43E-3;
        System.out.println("Double: " + numeroDouble);
        System.out.println("Valor mínimo del double: " + Double.MIN_VALUE);
        System.out.println("Valor máximo del double: " + Double.MAX_VALUE);

        // Tipo de referencia ==> String
        String nombre = "Alejandro";
        System.out.println("Nombre: " + nombre.toUpperCase());
        System.out.println("Nombre: " + nombre);

        // Conversión de tipos (Casting)
        int i = 100;
        double d = i; // Conversión automática
        System.out.println("d: " + d);
        int j = (int)d; // Conversión explicita
        System.out.println("j: " + j);
        // Tipos de referencia
        Integer y = j;
        String s = y.toString();
        System.out.println("s: " + s);

    }
}
