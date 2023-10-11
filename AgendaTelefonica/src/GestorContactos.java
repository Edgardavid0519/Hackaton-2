import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GestorContactos {
   private ArrayList<Contacto> agenda;
   private int size;

    public GestorContactos(int size) {
        agenda = new ArrayList<>();
        this.size = size;
    }

    public GestorContactos() {
        agenda = new ArrayList<>();
        this.size = 10;
    }

    public void agregarContacto(Contacto contacto){
        if (espaciosAgenda()<1){
            System.out.println("No se puede añadir contactos, limite alcanzado");
        }
        for(Contacto contactoGuardado:agenda){
            if(contactoGuardado.getNombre().equalsIgnoreCase(contacto.getNombre())){
                System.out.println("Contacto ya existe, no se puede repetir");
                return;
            }
        }
        agenda.add(contacto);


    }
    public boolean existeContacto(Contacto contacto){
        //verificar lista
        for(int i = 0; i <agenda.size(); i++){
            if(Objects.equals(agenda.get(i).getNombre(), contacto.getNombre())){
                return true;
            }
        }
        return false;
    }

    public void listarContactos(){
        for(Contacto contacto:agenda){
            System.out.println(contacto.toString());
        }

    }
    public void buscarContacto(String nombre){
        for(int i = 0; i <agenda.size(); i++){
            if(Objects.equals(agenda.get(i).getNombre(), nombre)){
                System.out.println("El contacto existe y su tel es: " + agenda.get(i).getTelefono());
                return;
            }
        }
        System.out.println("El contacto buscado no existe");
    }
    public void eliminarContacto(Contacto contacto){
        for(Contacto contactoGuardado:agenda){
            if(Objects.equals(contactoGuardado.getNombre(), contacto.getNombre())){
                System.out.println("Se elimina el contacto: " + contactoGuardado.getNombre() + " y su telefono: "+ contactoGuardado.getTelefono());
                agenda.remove(contactoGuardado);
                break;
            }
        }
    }
    public boolean agendaLlena(){
        if(espaciosAgenda()==0){
            System.out.println("Sí, la agenda está llena");
            return true;
        }
        System.out.println("No, la agenda no está llena");
        return false;
    }
    public int espaciosAgenda(){
        System.out.println("Espacio agenda: " + (size-agenda.size()));
        return size-agenda.size();
    }

}

