import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GestorContactos {
    private List<Contacto> contactos;
    private List<String> contactosUnicos;

    public GestorContactos() {
        contactos = new ArrayList<>();
        contactosUnicos = new ArrayList<>();
    }

    public void agregarContacto(String nombre, String apellido, String telefono) {

        Contacto contacto = new Contacto(nombre, apellido, telefono);
        contactos.add(contacto);
    }
    public List<String> nombreCompleto(){
        for (Contacto persona: contactos){
            contactosUnicos.add(persona.getCompleto());
        }
        return contactosUnicos;
    }
}

