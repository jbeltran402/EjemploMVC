package modeloDAO;

import java.util.ArrayList;
import java.util.List;

import Interfaz.SumaInterfaz;
import modelo.Modelo;

public class operaciones implements SumaInterfaz{

    @Override
    public List<Modelo> reordenar(ArrayList<Modelo> Usuarios) {

        for (int i = 0; i < Usuarios.size(); i++) {
            for (int j = 0; j < Usuarios.size(); j++) {

                String correo = Usuarios.get(i).getCorreo();
                String correoComparacion = Usuarios.get(j).getCorreo();
                
                //TODO -> Ajustar codigo para que elimine unicamente los campos repetidos
                if (correo.equals(correoComparacion) && i==j) {
                    Usuarios.remove(i);
                    break;
                }
            }
        }
        return Usuarios;
    }

    // @Override
    // public int suma(Modelo modelo) {
    //     return modelo.getN1() + modelo.getN2();
    // }

    // @Override
    // public int resta(int n1, int n2) {
    //     return n1 - n2;
    // }
}
