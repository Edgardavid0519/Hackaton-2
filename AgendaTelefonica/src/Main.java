import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*while (true){
            System.out.println("Ingrese un número según la opción que requiera: ");
            System.out.println("1: Añadir contacto");
            System.out.println("2: Existe contacto");
            System.out.println("3: Lista de contactos");
            System.out.println("4: Buscar contacto");
            System.out.println("5: Eliminar contacto");
            System.out.println("6: Espacio agenda");

            Scanner dato= new Scanner(System.in);
            switch (dato){
                case
            }

        }*/
    GestorContactos contactos = new GestorContactos();
    contactos.agregarContacto("Jose","Jimenez","3150002121");
    contactos.agregarContacto("Jose","Jimenez","3150002121");
        System.out.println(Arrays.toString(contactos));
        List<String> listaUnica = contactos.nombreCompleto();

        // Imprimir la lista única
        for (String nombre : listaUnica) {
            System.out.println(nombre);
        }
    }
}