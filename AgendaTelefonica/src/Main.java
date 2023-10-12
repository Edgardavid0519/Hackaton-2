import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestorContactos agenda = new GestorContactos();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu contactos:");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Lista de contactos");
            System.out.println("4. Eliminar contacto");
            System.out.println("5. Espacio libre en la agenda");
            System.out.print("Selecciona una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Apellido: ");
                    String apellido = scanner.nextLine();
                    System.out.print("Celular: ");
                    String telefono = scanner.nextLine();

                    Contacto nuevoContacto = new Contacto(nombre, apellido, telefono);
                    if (agenda.agregarContacto(nuevoContacto)) {
                        do {
                            System.out.print("ingrese de nuevo el celular: ");
                            telefono = scanner.nextLine();
                        } while (telefono.length() != 10);

                        System.out.println("\nContacto " + nombre +  " " + apellido + " agregado");
                    } else {
                        System.out.println("\nEl contacto ya existe");
                    }
                    break;

                case 2:
                    System.out.print("\nIngrese nombre a buscar: ");
                    String nombreBuscar = scanner.nextLine();
                    agenda.buscarContacto(nombreBuscar);
                    break;

                case 3:
                    System.out.println("\nContactos en la agenda:");
                    for (Contacto contacto : agenda.listarContactos()) {
                        System.out.println("\nNombre: " + contacto.getNombre() + ", Teléfono: " + contacto.getTelefono());
                    }
                    break;

                case 4:
                    System.out.print("\nNombre del contacto a eliminar: ");
                    String nombreEliminar = scanner.nextLine();
                    agenda.eliminarContacto(nombreEliminar);
                    break;

                case 5:
                    System.out.println("\nEspacio libre en la agenda: " + agenda.espacioLibre());
                    break;
            }
        }
    }
}
