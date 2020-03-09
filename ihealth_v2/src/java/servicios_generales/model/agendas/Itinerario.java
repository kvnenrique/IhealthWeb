package servicios_generales.model.agendas;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Kevin Enrique
 */
public class Itinerario {
    public ArrayList<Actividad> actividades;
    
    public Itinerario(){
        this.actividades = new ArrayList<Actividad>();
    }
    public Itinerario(ArrayList<Actividad> actividades){
        this.actividades = actividades;
    }
    
    public void agregarActividad(Actividad nuevaActividad){
        actividades.add(nuevaActividad);
    }
    
    
    public void eliminarActividad(String idAgendable){
        Iterator iter;
        iter = actividades.iterator(); 
        Actividad actual = actividades.get(0);
        int i = 0;
        
        while(iter.hasNext() && (actual.getIdAgendable()).equals(idAgendable) == false){
            actual = (Actividad) iter.next();
            i++;
        }
        
        if(actual.getIdAgendable().equals(idAgendable) ){
            actividades.remove(i);
        }
    }
}
