package ejercicios.estaticos.SistemaBancario.clases;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {
    private final int idCuenta;
    private String nombreTitular;
    private double saldoActual;
    private List<Operacion> historial;

    private static int contador;

    public Cuenta(String nombreTitular, double saldoActual) {
        this.idCuenta = ++contador;
        this.nombreTitular = nombreTitular;
        this.saldoActual = saldoActual;
        this.historial = new ArrayList<>();
    }

    public int getId() {
        return idCuenta;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public List<Operacion> getHistorial() {
        return historial;
    }

    public void depositar(double monto) {
        if (monto <= 0) {
            System.out.println("ERROR AL DEPOSITAR! ---> El depósito debe ser mayor a 0");
        } else {
            saldoActual += monto;
            System.out.println("Depositaste " + monto + " en la cuenta de "+nombreTitular+", Total: " + saldoActual);
            historial.add(new Operacion(Operacion.DEPOSITO, monto, this));
        }
    }

    public void retirar(double monto) {
        if (monto <= 0) {
            System.out.println("ERROR AL RETIRAR! ---> El retiro debe ser mayor a 0");
        } else if (monto > saldoActual) {
            System.out.println("ERROR AL RETIRAR "+monto+"! ---> Saldo insuficiente. Tienes: " + saldoActual);
        } else {
            saldoActual -= monto;
            System.out.println("Retiraste " + monto + " de la cuenta de "+nombreTitular+", Total: " + saldoActual);
            historial.add(new Operacion(Operacion.RETIRO, monto, this));
        }
    }

    @Override
    public String toString() {
        return String.format("{idCuenta=%d, nombreTitular='%s', saldoActual=%.2f}",
                idCuenta, nombreTitular, saldoActual);
    }

}