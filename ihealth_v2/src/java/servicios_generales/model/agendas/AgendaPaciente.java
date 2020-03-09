package servicios_generales.model.agendas;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Kevin Enrique
 */
public class AgendaPaciente {
    ArrayList<Cita> citas;
    
    public AgendaPaciente(){
        super();
    }
    public AgendaPaciente(ArrayList<Cita> citas){
        this.citas = citas;
    }
    
    public void agregarCita(Cita cita){
        citas.add(cita);
    }
    
    public void eliminarCita(String idAgendable){
        Iterator iter;
        iter = citas.iterator(); 
        Cita actual = citas.get(0);
        int i = 0;
        
        while(iter.hasNext() && (actual.getIdAgendable()).equals(idAgendable) == false){
            actual = (Cita) iter.next();
            i++;
        }
        
        if(actual.getIdAgendable().equals(idAgendable) ){
            citas.remove(i);
        }
    }
    
    ///Metodo para depuracion
    private void consolePrintAgendables(){
        Iterator iter;
        iter = citas.iterator(); 
        Agendable actual = citas.get(0);
 
        
        while(iter.hasNext()){
            actual = (Cita) iter.next();
            System.out.println("**********Elemento en agenda*************");
            System.out.println("id: " + actual.getIdAgendable());
            System.out.println("titulo: " + actual.getTitulo());
            System.out.println("descripcion: " + actual.getDescripcion());
            System.out.println("fecha: " + actual.getFecha());
            System.out.println("hora: " + actual.getHora());
            System.out.println();
        }
    }
}
