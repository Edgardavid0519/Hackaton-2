import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        GestorContactos agenda = new GestorContactos();
        while (true) {
            System.out.println("\nMenu contactos:");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Lista de contactos");
            System.out.println("4. Eliminar contacto");
            System.out.println("5. Espacio libre en la agenda");
            System.out.println("6. Agenda llena");
            System.out.println("7. Existe contacto en la agenda");
            System.out.println("0. Salir del menu");
            System.out.print("Selecciona una opción: ");

            Scanner scanner = new Scanner(System.in);
            int opcion = scanner.nextInt();
            scanner.nextLine();


            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Celular: ");
                    String telefono = scanner.nextLine();
                    Contacto nuevoContacto = new Contacto(nombre, telefono);
                    agenda.agregarContacto(nuevoContacto);
                    break;

                case 2:
                    System.out.print("\nBuscar contacto: ");
                    String nombreBuscar = scanner.nextLine();
                    agenda.buscarContacto(nombreBuscar);
                    break;

                case 3:
                    System.out.println("\nContactos en la agenda:");
                    agenda.listarContactos();
                    break;
                case 4:
                    System.out.print("\nNombre del contacto a eliminar: ");
                    String nombreEliminar = scanner.nextLine();
                    agenda.eliminarContacto(new Contacto(nombreEliminar, ""));
                    break;
                case 5:
                    agenda.espaciosAgenda();
                    break;
                case 6:
                    agenda.agendaLlena();
                    break;
                case 7:
                    System.out.print("\nExiste contacto: ");
                    String nombreExiste = scanner.nextLine();
                    if (agenda.existeContacto(new Contacto(nombreExiste, ""))) {
                        System.out.println("Si Existe el contacto en la agenda");
                    } else {
                        System.out.println("El contacto no existe en la agenda");
                    }
                    break;
                case 0:
                    return;
            }

        }
    }
}