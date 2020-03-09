package servicios_generales.model.instalaciones;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Kevin Enrique
 */
public class Hospital {
    private String idCentroDeTrabajo;
    private String ubicacion;
    private String nombre;
    private String descripcion;
    private ArrayList <Laboratorio> laboratorios;
    private ArrayList <CentroDeAltaEspecialidad> centrosAltaEspecialidad;
    
    public Hospital(){
        laboratorios = new ArrayList<Laboratorio> ();
        centrosAltaEspecialidad = new ArrayList<CentroDeAltaEspecialidad>();
    }
    
    public Hospital(String idCentroDeTrabajo, String ubicacion, String nombre, String descripcion){
        laboratorios = new ArrayList<Laboratorio> ();
        centrosAltaEspecialidad = new ArrayList<CentroDeAltaEspecialidad>();
        this.idCentroDeTrabajo = idCentroDeTrabajo;
        this.ubicacion = ubicacion;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    
    public Hospital(String idCentroDeTrabajo, String ubicacion, String nombre, String descripcion, ArrayList<Laboratorio> laboratorios, ArrayList<CentroDeAltaEspecialidad> centrosAltaEspecialidad){
        laboratorios = new ArrayList<Laboratorio> ();
        centrosAltaEspecialidad = new ArrayList<CentroDeAltaEspecialidad>();
        this.idCentroDeTrabajo = idCentroDeTrabajo;
        this.ubicacion = ubicacion;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.laboratorios = laboratorios;
        this.centrosAltaEspecialidad = centrosAltaEspecialidad;
    }

    public String getIdCentroDeTrabajo() {
        return idCentroDeTrabajo;
    }

    public void setIdCentroDeTrabajo(String idCentroDeTrabajo) {
        this.idCentroDeTrabajo = idCentroDeTrabajo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getDescripcion(){
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    
    public ArrayList<Laboratorio> getLaboratorios() {
        return laboratorios;
    }

    public void setLaboratorios(ArrayList<Laboratorio> laboratorios) {
        this.laboratorios = laboratorios;
    }

    public ArrayList<CentroDeAltaEspecialidad> getCentrosAltaEspecialidad() {
        return centrosAltaEspecialidad;
    }

    public void setCentrosAltaEspecialidad(ArrayList<CentroDeAltaEspecialidad> centrosAltaEspecialidad) {
        this.centrosAltaEspecialidad = centrosAltaEspecialidad;
    }
    
    
    
    public void agregarLaboratorio(Laboratorio nuevoLaboratorio){
        laboratorios.add(nuevoLaboratorio);
    }
    
    public void agregarCentroDeAltaEspecialidad(CentroDeAltaEspecialidad nuevoCentro){
        centrosAltaEspecialidad.add(nuevoCentro);
    }
    
    public void eliminarLaboratorio(String idLaboratorio){
        Iterator iter;
        iter = laboratorios.iterator(); 
        Laboratorio actual = laboratorios.get(0);
        int i = 0;
        
        while(iter.hasNext() && (actual.getIdLaboratorio()).equals(idLaboratorio) == false){
            actual = (Laboratorio) iter.next();
            i++;
        }
        
        if(actual.getIdLaboratorio().equals(idLaboratorio) ){
            laboratorios.remove(i);
        }
    }
    
    public void eliminarCentroDeAltaEspecialidad (String idCentroDeAltaEspecialidad){
        Iterator iter;
        iter = centrosAltaEspecialidad.iterator(); 
        CentroDeAltaEspecialidad actual = centrosAltaEspecialidad.get(0);
        int i = 0;
        
        while(iter.hasNext() && (actual.getIdCentroDeAltaEspecialidad()).equals(idCentroDeAltaEspecialidad) == false){
            actual = (CentroDeAltaEspecialidad) iter.next();
            i++;
        }
        
        if(actual.getIdCentroDeAltaEspecialidad().equals(idCentroDeAltaEspecialidad) ){
            centrosAltaEspecialidad.remove(i);
        }
    }

    public void printHospital(){
            Iterator iter;
        
            System.out.println("*****Hospital*****");
            System.out.println("idHospital: " + idCentroDeTrabajo);
            System.out.println("nombre: " + nombre);
            System.out.println("ubicacion: " + ubicacion);
            System.out.println("-----Laboratorios-----");
            System.out.println("numero de laboratorios: " + laboratorios.size());

            iter = laboratorios.iterator(); 
            Laboratorio Lactual = laboratorios.get(0);
            while(iter.hasNext()){
                Lactual = (Laboratorio) iter.next();
                System.out.println("Laboratorio: " + Lactual.getNombre());
            }
            
            
            System.out.println("-----Centros de Alta Especidalidad-----");
            System.out.println("numero de centros de alta especialidad: " + centrosAltaEspecialidad.size());
            iter = centrosAltaEspecialidad.iterator(); 
            CentroDeAltaEspecialidad Cactual = centrosAltaEspecialidad.get(0);
 
        
            while(iter.hasNext()){
                Cactual = (CentroDeAltaEspecialidad) iter.next();
                System.out.println("CentroDeAltaEspecialiadad: " + Cactual.getNombre());
            }
            
            
            System.out.println();
    }
    
}
