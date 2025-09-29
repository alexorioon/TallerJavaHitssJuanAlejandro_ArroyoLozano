package teoria.expresionesLambda.ejemplo1.test;

import teoria.expresionesLambda.ejemplo1.interfaces.Operacion;
import teoria.expresionesLambda.ejemplo1.interfaces.Transformador;

public class PruebaInterfazFuncional {
  public static void main(String[] args) {
    // Implementar con lambdas
    Operacion suma = (a, b) -> a + b;
    System.out.println("Suma: " + suma.calcular(5, 8));

    Operacion resta = (a, b) -> a - b;
    System.out.println("Resta: " + resta.calcular(16, 8));

    // Lambda que transforma String a mayúsculas <String>
    Transformador<String, Integer> aMayusculas = (s) -> s.length();
    System.out.println(aMayusculas.transformar("hola"));
    
  }
}
