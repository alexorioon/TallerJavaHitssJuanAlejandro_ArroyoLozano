package teoria.streams.ejemplo1.flujos;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OperacionesItermedias {
  public static void main(String[] args) {
    /* filter(Predicate<T> predicate)
     * Qué hace: Selecciona sólo los elementos que cumplen una condición
     * Devuelve: un nuevo Stream<T> con los elementos filtrados
     */
    List<Integer> numeros = List.of(1,2,3,4,5);
    /* 1. Convertir la colección a Stream
     * 2. Ejecuto 1 o más operaciones intermedias
     */
    //Stream<Integer> flujoEnteros = numeros.stream();
    /* Predicate<Integer> condicion = n -> n % 2 == 0;
    numeros.stream().filter(condicion); */
    System.out.println("==========filter()==========");
    System.out.println(numeros);
    numeros.stream()
      .filter(n -> n % 2 == 0) // Operación intermedia
      // .forEach(n -> System.out.println(n)); // Operación terminal
    .forEach(System.out::println);

    /* map(Function<T, R> mapper)
     * Qué hace: Transforma cada elemento en otro tipo o valor
     * Devuelve: un Stream<R>
     */
    System.out.println("==========map()==========");
    List.of("Alex", "java", "stream", "curso", "taller").stream()
      .filter(s -> s.length() >= 5)
      .map(String::toUpperCase) // Igual se puede con(son iguales): s -> s.totoUpperCase()
    .forEach(System.out::println);

    /* flatMap(Function<T, Stream<R> mapper>)
     * Qué hace: Aplanar múltiples Streams en uno sólo
     * Devuelve: Un Stream<R> con todos los elementos unidos
     */
    List<List<String>> datos = Arrays.asList(
      Arrays.asList("A", "B", "C", "D", "E"),
      Arrays.asList("F", "G", "H"),
      Arrays.asList("X", "Y", "Z", "W")
    );
    System.out.println("==========flatMap()==========");
    System.out.println(datos);
    List<String> abc = datos.stream()
      .flatMap(l -> l.stream())
      .collect(Collectors.toList()); // Igual se puede con(son iguales): List::Stream
    // .forEach(System.out::println);
    System.out.println(abc);

    /* distinct()
     * Qué hace: Elimina elementos duplicados del Stream (usa equals() y hashCode())
     * Devuelve: Un Stream<T> sin elementos repetidos
     */
    System.out.println("==========distinct()==========");
    List<Integer> valores = List.of(1, 2, 5, 2, 3, 4, 3, 7, 3, 4, 5, 5, 6, 7).stream()
      .distinct()
    .collect(Collectors.toList());
    System.out.println(valores);

    /* sorted() / sorted(Comparator)
     * Qué hace: Ordena el Stream en orden natural (o con un Comparator<T>)
     * Devuelve: Un Stream<T> ordenado
     */
    System.out.println("==========sorted()==========");
    valores.stream()
      .sorted()
    .forEach(System.out::println);

    System.out.println("==========sorted(Comparator)==========");
    valores.stream()
      .sorted(Comparator.reverseOrder())
    .forEach(System.out::println);

    /* peek(Consumer<T> action)
     * Qué hace: Permite realizar una acción intermedia (debug/log)
     * no modifica el Stream
     * Devuelve: Un Stream<T> con la acción aplicada a cada elemento
     */
    System.out.println("==========peek(Consumer)==========");
    valores.stream()
      .peek(n -> System.out.println("Original: " + n))
      .map(n -> n * 2)
      .peek(n -> System.out.println("Doble: " + n))
      .filter(n -> n > 10) 
    .forEach(System.out::println);

    /* limit(long maxSize)
     * Qué hace: toma sólo los primeros n elementos del Stream
     * Devuelve: Un Stream<T> con los primeros n elementos
     */
    System.out.println("==========limit(long)==========");
    valores.stream()
      .peek(n -> System.out.println("Original: " + n))
      .limit(5)
      .map(n -> n * n)
    .forEach(System.out::println);

    /* skip(long n)
     * Qué hace: omite los primeros n elementos
     * Devuelve: Un Stream<T> con los elementos desde la posición n
     */
    System.out.println("==========skip(long)==========");
    valores.stream()
      .skip(5)
    .forEach(System.out::println);

    /* mapToInt, mapToLong, mapToDouble
     * Qué hace: Convierte un Stream<T> a un Stream de tipos primitivos (IntStream, LongStream, DoubleStream)
     */
    System.out.println("==========mapToInt()==========");
    List.of("1", "4", "5", "2", "3", "10").stream()
      .mapToInt(n -> Integer.parseInt(n))
      .filter(n -> n > 3)
    .forEach(System.out::println);

    /* flatMapToInt, flatMapToLong, flatMapToDouble
     * Qué hace: versión primitiva de flatMap
     * Se usa cuando cada elemento produce un Stream de primitivos
     */
    Stream<String> lineas = Stream.of("2 3 5", "1 3 7 5", "4 3 2 1");
    System.out.println("==========flatMapToInt()==========");
    lineas.flatMapToInt(s -> Arrays.stream(s.split(" "))
      .mapToInt(Integer::parseInt)
    ).forEach(System.out::println);
  }
}
