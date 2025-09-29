package teoria.expresionesLambda.ejemplo1.interfaces;

@FunctionalInterface
public interface Transformador<T, R> {
  R transformar(T dato);
}
