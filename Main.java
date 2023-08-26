import pkgAlumnos.Alumno;
import pkgAlumnos.Curso;

public class Main {

    public static void main(String[] args) {

        Alumno alumno1 = new Alumno("001", "Juan Perez", "44444", "5 calle 8-14");
        Curso cur = new Curso("555", "5050", "programacion");
        alumno1.agregarCurso(cur);
        alumno1.agregarCurso(new Curso("12", "derecho", "1"));
        Alumno alumno2 = new Alumno("002", "Ramon dino", "44588", "7 calle 10-14");
        Alumno alumno3 = new Alumno("003", "Crish Bumstead", "25225", "10 calle 11-8");

        System.out.println("nombre del alumno: " + alumno1.getNombre());
        System.out.println("carne: " + alumno1.getCarne());

        double totalGastoAlumno1 = 0.0;

        for (Curso curso : alumno1.getCursos()) {
            System.out.println("Curso: " + curso.getNombre() + " - Valor: " + curso.getCosto());
            totalGastoAlumno1 += Double.parseDouble(curso.getCosto());
        }

        System.out.println("Gasto total para " + alumno1.getNombre() + ": " + totalGastoAlumno1);

        // Repite el mismo proceso para los otros alumnos...

    }
}
