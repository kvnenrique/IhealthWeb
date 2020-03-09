
package servicios_generales.model.agendas;

/**
 *
 * @author Kevin Enrique
 */
public class Actividad extends Agendable{
    private String numeroEmpleado;
    
    public Actividad(){super();}
    
    public Actividad(String idActividad, String numeroEmpleado, String titulo, String descripcion, String fecha, String hora){
        super(idActividad, titulo, descripcion, fecha, hora);
    }
    
    public void setNumeroEmpleado(String numeroEmpleado){
        this.numeroEmpleado = numeroEmpleado;
    }
    
    public String getNumeroEmpleado(){
        return this.numeroEmpleado;
    }
}
