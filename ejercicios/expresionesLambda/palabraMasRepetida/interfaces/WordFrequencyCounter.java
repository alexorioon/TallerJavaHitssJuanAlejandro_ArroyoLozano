package ejercicios.expresionesLambda.palabraMasRepetida.interfaces;

@FunctionalInterface
public interface WordFrequencyCounter<T, R> {
  R palabraMasRepetida(T frase);
}
