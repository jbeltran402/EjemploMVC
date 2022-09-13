package modeloDAO;

import Interfaz.SumaInterfaz;
import modelo.Modelo;

public class operaciones implements SumaInterfaz{

    @Override
    public int suma(Modelo modelo) {
        return modelo.getN1() + modelo.getN2();
    }

    @Override
    public int resta(int n1, int n2) {
        return n1 - n2;
    }
}
