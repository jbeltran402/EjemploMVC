import java.util.ArrayList;
import java.util.Scanner;

import modelo.Modelo;
import modeloDAO.operaciones;

public class main{

    static operaciones o = new operaciones();
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Modelo> Usuarios = new ArrayList<Modelo>();
        ArrayList<Modelo> UsuariosReordenados = new ArrayList<Modelo>();

        boolean estado = false;
        String nombre = "";
        String nombre2 = "";
        String apellido = "";
        String apellido2 = "";
        String correo = "";

        while (estado == false) {

            Modelo M = new Modelo();
            System.out.println("Nombre");
            nombre = leer.next();
            M.setNombre(nombre);

            // System.out.println("Nombre 2");
            // nombre2 = leer.next();
            // M.setSegundoNombre(nombre2);

            // System.out.println("Apellido");
            // apellido = leer.next();
            // M.setApellido(apellido);
            
            // System.out.println("Apellido 2");
            // apellido2 = leer.next();
            // M.setSegundoApellido(apellido2);
            
            System.out.println("correo");
            correo = leer.next();
            M.setCorreo(correo);

            Usuarios.add(M);

            System.out.println("continuar 1 | Terminar 2");
            int RespuestaNumero = leer.nextInt();

            if (RespuestaNumero == 2){
                estado = true;
            }
        }

        UsuariosReordenados.addAll(o.reordenar(Usuarios));
        for (Modelo usuarios : UsuariosReordenados) {
            System.out.println(usuarios.getNombre()+" | "+usuarios.getCorreo());
        }


    //     System.out.println(o.resta(n1, n2));
    //     Hola();
    //     holaM();



    // }

    // public static void Hola() {
    //     M.setN1(n1);
    //     M.setN2(n2);
    //     System.out.println(o.suma(M));
    // }

    // public static void holaM(){
    //     System.out.println("hola mundo");
    // }
    }
}
