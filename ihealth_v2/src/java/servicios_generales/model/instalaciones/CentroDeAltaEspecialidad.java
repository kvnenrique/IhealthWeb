    package servicios_generales.model.instalaciones;

/**
 *
 * @author Kevin Enrique
 */
public class CentroDeAltaEspecialidad {
    private String idCentroDeAltaEspecialidad;
    private String idCentroDeTrabajo;
    private String nombre;
    
    public CentroDeAltaEspecialidad(){}
    
    public CentroDeAltaEspecialidad(String idCentroDeAltaEspecialidad, String idCentroDeTrabajo, String nombre){
        this.idCentroDeAltaEspecialidad = idCentroDeAltaEspecialidad;
        this.idCentroDeTrabajo = idCentroDeTrabajo;
        this.nombre = nombre;
    }
    
    public void setIdCentroDeAltaEspecialidad(String idCentroDeAltaExpecialidad){
        this.idCentroDeAltaEspecialidad = idCentroDeAltaEspecialidad;
    }
    public void setIdCentroDeTrabajo(String idCentroTrabajo){
        this.idCentroDeTrabajo = idCentroTrabajo;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getIdCentroDeAltaEspecialidad(){
        return this.idCentroDeAltaEspecialidad;
    }
    public String getIdCentroDeTrabajo(){
        return this.idCentroDeTrabajo;
    }
    public String getNombre(){
        return this.nombre;
    }
}
