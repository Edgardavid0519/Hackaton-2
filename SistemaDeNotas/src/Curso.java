import java.util.ArrayList;

public class Curso {
    private ArrayList<Estudiante> estudiantes;

    public Curso() {
        estudiantes = new ArrayList<Estudiante>();
    }

    public void registrarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public void imprimirPromedios() {
        System.out.println("Promedios de estudiantes:");
        for (int i = 0; i < estudiantes.size(); i++) {
            Estudiante estudiante = estudiantes.get(i);
            double promedio = estudiante.calcularPromedio();
            System.out.println(estudiante.getNombre() + " " + estudiante.getApellido() + "-> Promedio: " + ((Double.isNaN(promedio)) ? "No hay nota": promedio));
        }
    }

}
