package ejercicios.herencia.CompaniaEmpleados.clases;

public class Cliente extends Persona{
    private int clienteId;
    
    private static int contador;

    public Cliente(String nombre, String apellido, String numFiscal, String direccion) {
        super(nombre, apellido, numFiscal, direccion);
        this.clienteId = ++contador;
    }

	public int getClienteId() {
		return clienteId;
	}

    @Override
    public void showInfo() {
        System.out.printf("Cliente #%d%n", clienteId);
        super.showInfo();
    }
    
    
}
