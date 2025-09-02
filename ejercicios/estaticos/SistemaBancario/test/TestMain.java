package ejercicios.estaticos.SistemaBancario.test;

import ejercicios.estaticos.SistemaBancario.clases.Cuenta;
import ejercicios.estaticos.SistemaBancario.clases.Operacion;

public class TestMain {

  public static void main(String[] args) {
    /*
     * Problema: Sistema Bancario Simple con IDs Automáticos
     * Una institución bancaria necesita un sistema básico para administrar cuentas
     * bancarias y registrar sus transacciones.
     * Cada cuenta creada debe tener un ID único que se genere automáticamente sin
     * que el usuario lo proporcione. Lo mismo debe ocurrir con cada transacción
     * registrada.
     *
     * El sistema debe permitir:
     * 1. Crear cuentas bancarias con un titular y un depósito inicial.
     * - Cada cuenta debe tener: un ID único, el nombre del titular y el saldo
     * actual.
     * 2. Realizar operaciones bancarias:
     * - Depósito: aumentar el saldo de la cuenta.
     * - Retiro: disminuir el saldo, siempre que haya suficiente dinero disponible.
     * 3. Registrar transacciones asociadas a las cuentas.
     * - Cada transacción debe tener un ID único automático,
     * el tipo de operación (depósito o retiro), el monto y la cuenta asociada.
     * 4. Mostrar información de las cuentas y de las transacciones realizadas.
     *
     * Ejemplo de funcionamiento esperado
     * • Crear dos cuentas:
     * - Ana con $5000
     * - Luis con $10000
     * • Ana deposita $2000 y retira $1000.
     * • Luis retira $3000 y deposita $1500.
     * • El sistema debe mostrar el detalle de cada cuenta y
     * un historial de las transacciones con IDs únicos.
     */

    Cuenta c1 = new Cuenta("Ana", 5000);
    System.out.println(c1);
    Cuenta c2 = new Cuenta("Luis", 10000);
    System.out.println(c2);
    c1.depositar(2000);
    c1.retirar(1000);
    c2.retirar(3000);
    c2.depositar(1500);

    System.out.println(
      "\nSaldo final (" + c1.getNombreTitular() + "): " + c1.getSaldoActual()
    );
    System.out.println("Detalle de transacciones:");
    for (Operacion op : c1.getHistorial()) {
      System.out.println(op);
    }

    System.out.println(
      "\nSaldo final (" + c2.getNombreTitular() + "): " + c2.getSaldoActual()
    );
    System.out.println("Detalle de transacciones:");
    for (Operacion op : c2.getHistorial()) {
      System.out.println(op);
    }
  }
}
