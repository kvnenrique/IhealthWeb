package servicios_generales.model.instalaciones;

/**
 *
 * @author Kevin Enrique
 */
public class Laboratorio {
    private String idLaboratorio;
    private String idCentroDeTrabajo;
    private String nombre;
    
    public Laboratorio(){}
    
    public Laboratorio(String idLaboratorio, String idCentroDeTrabajo, String nombre){
        this.idLaboratorio = idLaboratorio;
        this.idCentroDeTrabajo = idCentroDeTrabajo;
        this.nombre = nombre;
    }
    
    public void setIdLaboratorio(String idLaboratorio){
        this.idLaboratorio = idLaboratorio;
    }
    public void setIdCentroDeTrabajo(String idCentroTrabajo){
        this.idCentroDeTrabajo = idCentroTrabajo;
    }
    public void setnombre(String nombre){
        this.nombre = nombre;
    }
    
    
    public String getIdLaboratorio(){
        return this.idLaboratorio;
    }
    public String getIdCentroDeTrabajo(){
        return this.idCentroDeTrabajo;
    }
    public String getNombre(){
        return this.nombre;
    }
}
