package servicios_generales.model.eventos;
import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author Kevin Enrique
 */
public class Cartelera {
    private ArrayList<Evento> eventos;
    
    private Iterator<Evento> iter;
    
    public Cartelera(){
        eventos = new ArrayList<Evento>();
    }
    
    public Cartelera(ArrayList<Evento> eventos){
        eventos = new ArrayList<Evento>();
        this.eventos = eventos;
    }

    public ArrayList<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(ArrayList<Evento> eventos) {
        this.eventos = eventos;
    }
    
    public void agregarEvento(Evento nuevoEvento){
        eventos.add(nuevoEvento);
    }
    
    public Evento getEvento(String idEvento){
        iter = eventos.iterator();
        Evento actual = eventos.get(0);
        while(iter.hasNext() && (actual.getIdEvento()).equals(idEvento) == false){
            actual = (Evento) iter.next();
        }
        if(actual.getIdEvento().equals(idEvento) ){
            return actual;
        }else{
            return null;
        }
    }
    
    public void eliminarEvento(String idEvento){
        iter = eventos.iterator(); 
        Evento actual = eventos.get(0);
        int i = 0;
        
        while(iter.hasNext() && (actual.getIdEvento()).equals(idEvento) == false){
            actual = (Evento) iter.next();
            i++;
        }
        
        if(actual.getIdEvento().equals(idEvento) ){
            eventos.remove(i);
        }
    }
    
    
    //Metodo para depuracion
    public void consolePrint(){
        iter = eventos.iterator(); 
        Evento actual;
        while(iter.hasNext()){
            actual = iter.next();
            System.out.println(actual.getTitulo());
            System.out.println(actual.getDescripcion());
            System.out.println();
        }
        
    }
}
