// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Curso universidad = new Curso();
        Scanner scanner;
        while (true) {
            System.out.println("Ingrese el nombre del estudiante (o 'salir' para terminar):");
            scanner = new Scanner(System.in);
            String nombre = scanner.nextLine();

            if (nombre.equalsIgnoreCase("salir")) {
                break;
            }

            System.out.println("Ingrese el apellido del estudiante:");
            String apellido = scanner.nextLine();

            Estudiante estudiante = new Estudiante(nombre, apellido);

            boolean continuar = true;
            while (continuar) {
                System.out.println("Ingrese una nota (o -1 para no agregar más notas):");
                double nota = scanner.nextDouble();

                if (nota == -1) {
                    continuar = false;
                } else {
                    estudiante.agregarNota(nota);
                }
            }

            universidad.registrarEstudiante(estudiante);
            universidad.imprimirPromedios();
        }

        scanner.close();

    }
}

