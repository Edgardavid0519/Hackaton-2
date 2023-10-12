import java.util.ArrayList;
import java.util.List;
public class GestorContactos {
    private List<Contacto> contactos = new ArrayList<>();
    public boolean agregarContacto(Contacto contacto) {
        if (!existeContacto(contacto)) {

            contactos.add(contacto);
            return true;
        }
        return false;
    }
    public boolean existeContacto(Contacto contacto) {
        for (Contacto c : contactos) {
            if (c.getNombre().equalsIgnoreCase(contacto.getNombre()) && (c.getApellido().equalsIgnoreCase(contacto.getApellido()))) {
                return true;
            }
        }
        return false;
    }
    public List<Contacto> listarContactos() {
        return contactos;
    }

    public boolean buscarContacto(String nombre) {
        for (Contacto c : contactos) {
            if (c.getNombre().equals(nombre)) {
                System.out.println("\nNombre: " + c.getNombre() + ", Apellido: " + c.getApellido() + ", Teléfono: " + c.getTelefono());
                return true;
            }
        }
        System.out.println("\nNo se encuentra");
        return false;
    }

    public boolean eliminarContacto(String nombre) {
        for (Contacto c : contactos) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                contactos.remove(c);
                System.out.println("\nEl contacto" + c.getNombre() + " " + c.getApellido() +" se ha eliminado.");
                return true;
            }
        }
        System.out.println("No se encuentra");
        return false;
    }
    public boolean agendaLlena() {
        return contactos.size() >= 20;
    }
    public int espacioLibre() {
        return 20 - contactos.size();
    }
}
