package teoria.streams.flujos;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OperacionesTerminales {
  public static void main(String[] args) {
    // foreach(Consumer)

    /*
     * toArray()
     * Qué hace: convierte el stream a un array
     * Devuelve: Object[] op tipo específico si se pasa un generador
     */
    
     System.out.println("==========toArray()==========");
     String[] arreglo = List.of("Alex", "Juan", "Pepe")
     .stream()
     .toArray(String[]::new);

    for (String elemento : arreglo) {
      System.out.println(elemento + " ");
    }

    /* reduce(...)
     * Qué hace: combina elementos en un único valor o resultado (acumulación)
     * Sobrecarga del método
     * 1. reduce(BinaryOperator<T> accumulator) -> Optional<T>
     * 2. reduce(T identity, BinaryOperator<T> accumulator) -> T
     * 3. reduce(U identity, BiFunction<U, ? super T, U>), BinaryOperator<U> accumulator) -> U
     */
    System.out.println("==========reduce()==========");
    List<Integer> numeros = List.of(1,2,3,4,5,6,7,8,9,10);
    // Integer::sum ==> (a, b) -> Integer.sum(a, b) ==> (a, b) -> a + b
    int suma = numeros.stream()
      .reduce(0, (a, b) -> Integer.sum(a, b));
    System.out.println("Suma: " + suma);
    
    /* collect(Collector<T, A, R> collector)
     * Qué hace: acumula los elementos en una colección o resultado mutable
     * Muy usado con Collectors 
     */
    System.out.println("==========collect()==========");
    List<String> lista = Stream.of("a", "b", "c", "d", "e")
      .collect(Collectors.toList());
    System.out.println(lista);

    Map<Integer, String> mapa = List.of("uno", "tres", "cuatro", "cinco")
      .stream()
      .collect(Collectors.toMap(String::length, s -> s));
    mapa.forEach((k, v) -> System.out.println(k + " -> " + v));
    
    // a partir de java 16 -> 
    System.out.println("==========toList()==========");
    List<String> lista1 = Stream.of("a", "b", "c", "d", "e")
      .toList();
    System.out.println(lista1);

    /* min(Comparator<? super T> comparator)
     * Qué hace: Encuentra el menor o mínimo
     * Devuelve: Optional<T>
     */
    System.out.println("==========min()==========");
    Optional<Integer> minimo = List.of(4, 2, 8, 5, 10).stream()
      .min(Integer::compareTo);
    System.out.println("Valor mínimo: " + minimo.orElseThrow());
    /* if (minimo.isPresent()) {
    } */

    /* max(Comparator<? super T> comparator)
     * Qué hace: Encuentra el mayor o máximo
     * Devuelve: Optional<T>
     */
    System.out.println("==========max()==========");
    Optional<Integer> maximo = List.of(4, 2, 8, 5, 10).stream()
      .max(Integer::compareTo);
    System.out.println("Valor máximo: " + maximo.orElseThrow());
    /* if (maximo.isPresent()) {
    } */

    /* count()
     * Qué hace: cuenta los elementos que están en el flujo
     * Devuelve: long
     */
    System.out.println("==========count()==========");
    long cantidad = List.of(4, 5, 3, 7, 6).stream().count();
    System.out.println("Cantidad de elementos: " + cantidad);

    /* anyMatch()
     * Qué hace: verifica si algún elemento cumple la condición
     * Devuelve: boolean
     */
    System.out.println("==========anyMatch()==========");
    boolean hayPar = List.of(3, 7, 5, 9, 11, 15).stream()
      .anyMatch(n -> n % 2 == 0);
    System.out.println("Hay pares: " + hayPar);

    /* allMatch()
     * Qué hace: verifica si todos los elementos cumplen la condición
     * Devuelve: boolean
     */

    /* noneMatch()
     * Qué hace: verifica si ningún elemento cumple con la condición
     * Devuelve: boolean
     */

    /* findFirst()
     * Qué hace: Devuelve el primer elemento del stream
     * Devuelve: Optional<T>
     */
    Optional<String> primero = Stream.of("A", "B", "C", "D").findFirst();
    System.out.println("Primero: " + primero.orElseThrow());

    /* findAny -> paralelismo
     * iterator -> como un iterador clásico
     * spliterator -> iterador avanzado
     */
  }
}
