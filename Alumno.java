package pkgAlumnos;

import java.util.ArrayList;
import java.util.List;

public class Alumno {

    private String carne  ;

    private String nombre ;

    private String telefono
            ;
    private String direccion ;

    private List<Curso> cursos;
    private CursosAsignados Curso;

    //constructor

    public Alumno(String carne, String nombre, String telefono, String direccion) {
        this.carne = carne;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.cursos = new ArrayList<>();
    }
//agregar ciursos

    public void agregarCurso (Curso curso ){
        this.Curso.add(curso);
    }
      //getters and setters
    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
}
