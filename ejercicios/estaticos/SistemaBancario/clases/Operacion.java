package clases;

public class Operacion {
    public static final String DEPOSITO = "DEPOSITO";
    public static final String RETIRO = "RETIRO";

    private final int idOperacion;
    private final String tipo;
    private final double monto;
    private final Cuenta cuenta;

    private static int contador;

    public Operacion(String tipo, double monto, Cuenta cuenta) {
        this.idOperacion = ++contador;
        this.tipo = tipo;
        this.monto = monto;
        this.cuenta = cuenta;
    }

    @Override
    public String toString() {
        return String.format("{idOperacion=%d, tipo='%s', monto=%.2f, nombreTitular=%s, idCuenta=%d}",
                idOperacion, tipo, monto, cuenta.getNombreTitular(), cuenta.getId());
    }
}
