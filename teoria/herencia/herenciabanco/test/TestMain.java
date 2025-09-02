package teoria.herencia.herenciabanco.test;

//import java.util.ArrayList;

import teoria.herencia.herenciabanco.clases.Chequera;
import teoria.herencia.herenciabanco.clases.CuentaAhorro;
import teoria.herencia.herenciabanco.clases.CuentaBancaria;

public class TestMain {

  public static void main(String[] args) {
    //List<Integer> list = new ArrayList<Integer>();
    CuentaBancaria cb1 = new CuentaAhorro("Alex", 5000, 0.05);
    CuentaBancaria cb2 = new Chequera("Angelica", 2000, 1000);
    CuentaAhorro ca = new CuentaAhorro("Juan", 6000, 0.04);

    cb1.mostrarInfo();
    cb2.mostrarInfo();
    ca.mostrarInfo();

    System.out.println("----------Operaciones----------");
    cb1.depositar(5000);
    cb1.retirar(1500);
    ((CuentaAhorro) cb1).aplicarIntereses();
    System.out.println("Cuenta 1");
    cb1.mostrarInfo();
    System.out.println("Cuenta 2");
    cb2.retirar(2500);
    cb2.mostrarInfo();
    System.out.println("Cuenta ahorro");
    ca.aplicarIntereses();
    ca.mostrarInfo();
  }
}
