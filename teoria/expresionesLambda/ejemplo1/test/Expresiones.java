package teoria.expresionesLambda.ejemplo1.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import teoria.expresionesLambda.ejemplo1.models.Cliente;

public class Expresiones {
  public static void main(String[] args) {
    /*
     * Sintáxis básica de una expresión Lambda 
     * (parámetros) -> expresión
     * (parámetros) -> { bloque código }
    */

    // Ejemplo de lambda cuando no recibe parámetros
    // () -> System.out.println("Hola mundo")

    // Parámetro con tipo explícito
    // (int x, int y) -> x + y

    // Parámetro con tipo inferido (el compilador lo deduce)
    // (x, y) -> x + y


    // Una sola instrucción (no requiere llaves, ni return)
    // x -> x * x

    // Bloque de código con varias instrucciones
    /* (x, y) -> {
      System.out.println("Sumando");
      int r = x + y;
      return r;
    } */

    List<String> nombres = Arrays.asList("Juan", "Eloy", "Ana", "Susana", "María");
    
    // Imperativa
    System.out.println("========Forma imperativa========");
    for (String nombre : nombres) {
      System.out.println(nombre);
    }

    // Declarativa -> Funcional con lambdas
    System.out.println("========Forma funcional========");
    nombres.forEach(nombre -> System.out.println(nombre));

    // Declarativa -> Funcional con referencia a método
    System.out.println("========Funcional: referencia a método========");
    nombres.forEach(System.out::println);

    List<Cliente> clientes = new ArrayList<>();
    clientes.add(new Cliente("Juan", 30));
    clientes.add(new Cliente("Eloy", 25));
    clientes.add(new Cliente("Ana", 35));
    clientes.add(new Cliente("Susana", 40));
    clientes.add(new Cliente("María", 38));

    System.out.println("Listando clientes...");
    clientes.forEach(System.out::println);
    clientes.forEach((cliente) -> System.out.println(cliente.getNombre()));
    
  }
}
