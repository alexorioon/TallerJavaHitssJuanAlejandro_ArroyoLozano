package ejercicios.expresionesLambda.ejercicio1.interfaces;

@FunctionalInterface
public interface Transformador<T, R> {
  /*
   * Expresión Lambda que elimine espacios,
   * comas y puntos de una frase y además
   * devuelva la frase convertida en mayúscula.
   */
  R convertir(T frase);
}
