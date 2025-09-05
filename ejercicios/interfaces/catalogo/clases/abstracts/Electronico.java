package ejercicios.interfaces.catalogo.clases.abstracts;

import ejercicios.interfaces.catalogo.interfaces.IElectronico;

/*La clase abstracta Electronico implementa la interface IElectronico.
  Atributo fabricante con su respectivo método getter y constructor. */
public abstract class Electronico extends Producto implements IElectronico {
    private String fabricante;

    public Electronico(String fabricante, int precio) {
        super(precio);
        this.fabricante = fabricante;
    }

    @Override
    public String getFabricante() {
        return fabricante;
    }
}