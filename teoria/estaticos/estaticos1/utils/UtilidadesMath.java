package teoria.estaticos.estaticos1.utils;

public class UtilidadesMath {

  //  Atributo estático
  public static final double PI = 3.14159;
  private int valor;

  //  Método estático
  public static long square(int numero) {
    return numero * numero;
  }

  public int getValor() {
    return valor;
  }

  public void setValor(int valor) {
    this.valor = valor;
  }
}
