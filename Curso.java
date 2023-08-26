package pkgAlumnos;

public class Curso {

    private String codigo ;

    private String nombre ;

    private String costo;

    //constructor

    public Curso(String codigo, String nombre, String costo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.costo = costo;
    }

    //getter and setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }
}
