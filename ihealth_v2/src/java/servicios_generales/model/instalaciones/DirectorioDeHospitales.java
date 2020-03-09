package servicios_generales.model.instalaciones;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Kevin Enrique
 */
public class DirectorioDeHospitales {
    private ArrayList<Hospital> hospitales;
    
    public DirectorioDeHospitales(){
        hospitales = new ArrayList<Hospital> ();
    }
    
    public DirectorioDeHospitales(ArrayList<Hospital> hospitales){
        hospitales = new ArrayList<Hospital> ();
        this.hospitales = hospitales;
    }
    
    public void agregarHospital(Hospital nuevoHospital){
        hospitales.add(nuevoHospital);
    }
    
    public void eliminarHospital(String idCentroDeTrabajo){
        Iterator iter;
        iter = hospitales.iterator(); 
        Hospital actual = hospitales.get(0);
        int i = 0;
        
        while(iter.hasNext() && (actual.getIdCentroDeTrabajo()).equals(idCentroDeTrabajo) == false){
            actual = (Hospital) iter.next();
            i++;
        }
        
        if(actual.getIdCentroDeTrabajo().equals(idCentroDeTrabajo) ){
            hospitales.remove(i);
        }
    }
    
    //Metodo para depuracion
    private void colsolePrint(){
        Iterator iter;
        iter = hospitales.iterator(); 
        Hospital actual;
        actual = hospitales.get(0);

        
        while(iter.hasNext()){
            actual = (Hospital) iter.next();
            System.out.println("*****Hospital*****");
            System.out.println("idHospital: " + actual.getIdCentroDeTrabajo());
            System.out.println("nombre: " + actual.getNombre());
            System.out.println("ubicacion: " + actual.getUbicacion());
            System.out.println("numero de laboratorios: " + actual.getLaboratorios().size());
            System.out.println("numero de centros de alta especialidad: " + actual.getCentrosAltaEspecialidad().size());
            System.out.println();
        }
        
    }
}
