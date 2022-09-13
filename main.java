import modelo.Modelo;
import modeloDAO.operaciones;

public class main{

    static operaciones o = new operaciones();
    static Modelo M = new Modelo();

    public static int n1 = 10;
    public static int n2 = 20;

    public static void main(String[] args) {
        System.out.println(o.resta(n1, n2));
        Hola();
    }

    public static void Hola() {
        M.setN1(n1);
        M.setN2(n2);
        System.out.println(o.suma(M));
    }
}
