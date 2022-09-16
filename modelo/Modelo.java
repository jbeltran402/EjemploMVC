package modelo;

public class Modelo {
    
    private String Nombre;
    private String SegundoNombre;
    private String Apellido;
    private String SegundoApellido;
    private String Correo;

    public Modelo(){
    }

    public Modelo(String nombre, String segundoNombre, String apellido, String segundoApellido, String correo) {
        Nombre = nombre;
        SegundoNombre = segundoNombre;
        Apellido = apellido;
        SegundoApellido = segundoApellido;
        Correo = correo;
    }   

    public String getNombre() {
        return this.Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getSegundoNombre() {
        return this.SegundoNombre;
    }

    public void setSegundoNombre(String SegundoNombre) {
        this.SegundoNombre = SegundoNombre;
    }

    public String getApellido() {
        return this.Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getSegundoApellido() {
        return this.SegundoApellido;
    }

    public void setSegundoApellido(String SegundoApellido) {
        this.SegundoApellido = SegundoApellido;
    }

    public String getCorreo() {
        return this.Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
}
