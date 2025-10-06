package teoria.interfacesFuncionales.ejemplo1.test;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class InterfazFuncional {
  public static void main(String[] args) {
    /* Predicate<T> -> recibe un argumento y devuelve un boolean
     * Uso: validaciones o filtros
     */
    Predicate<String> esMayor = s -> s.length() > 5;
    System.out.println(esMayor.test("Hola"));
    System.out.println(esMayor.test("Programación"));
    

    /* Function<T, R> -> Recibe un argumento T y devuelve un valor de tipo R
     * Uso: transformaciones => mapear objetos, convertir DTO's a entidades
     * s -> s.length(); ==> String::length;
     */
    Function<String, Integer> obtenerLongitud = String::length;
    System.out.println("Longitud: " + obtenerLongitud.apply("Hola"));
    System.out.println("Longitud: " + obtenerLongitud.apply("Taller de Java"));


    /* Consumer<T> -> recibe un argumento T y no devuelve nada
     * Uso: acciones => imprimir, guardar en logs, enviar mensajes
     */
    Consumer<String> mayusculas = s -> System.out.println(s.toUpperCase());
    List<String> nombres = List.of("Alex", "Susana", "Pedro", "America");
    nombres.forEach(mayusculas);


    /* Supplier<T> -> No recibe argumentos, devuelve un valor de tipo T
     * Uso: generar valores bajo demanda => fechas, IDs, valores por defecto
     */
    Supplier<Integer> numero = () -> new Random().nextInt(100);
    System.out.println("Número aleatorio: " + numero.get());
    System.out.println("Número aleatorio: " + numero.get());


    /* BiPredicate<T, U> -> recibe dos argumentos y devuelve un boolean
     * Uso: validaciones o comparaciones entre dos objetos
     */
    BiPredicate<String, Integer> lon = (s, i) -> s.length() > i;
    System.out.println(lon.test("Hola", 5));
    System.out.println(lon.test("Programación", 10));


    /* BiFunction<T, U, R> -> recibe dos argumentos (T, U), y devuelve un valor de tipo R
     * Uso: operaciones matemáticas, combinaciones o transformaciones entre dos objetos
     */
    BiFunction<Integer, Integer, Integer> operacion = (a, b) -> a + b;
    System.out.println("Suma: " + operacion.apply(4, 6));

    /* BiConsumer<T, U> -> recibe dos argumentos y no devuelve nada
     * Uso: operaciones sobre maps, acciones o efectos secundarios entre dos objetos
     */
    BiConsumer<String, Integer> imprimirMapa = (s, i) -> System.out.println(s + " tiene edad " + i);
    Map<String, Integer> personas = Map.of("Alex", 24, "Bob", 30, "Charlie", 28);
    personas.forEach(imprimirMapa);

    /* UnaryOperator<T> -> es un tipo especial de Function<T, T>
     * recibe un argumento y devuelve un valor del mismo tipo
     * Uso: transformaciones o modificaciones sobre un mismo tipo
     * de dato (normalizar texto, operaciones aritméticas)
     */
    UnaryOperator<Integer> cuadrado = n -> n * n;
    System.out.println("Cuadrado: " + cuadrado.apply(5));


    /* BinaryOperator<T, T> -> Es un tipo especial de BiFunction<T, T, T>
     * recibe dos argumentos y devuelve un valor del mismo tipo
     * Uso: operaciones de reducción (suma, máximo, mínimo), combinaciones o agregaciones
     */
    BinaryOperator<Integer> maximo = (a, b) -> a > b ? a : b;
    System.out.println("Máximo: " + maximo.apply(5, 10));
  }
}
