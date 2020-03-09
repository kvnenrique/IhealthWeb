
package servicios_generales.model.agendas;

/**
 *
 * @author Kevin Enrique
 */
public class Cita extends Agendable{
    private String matriculaPaciente;
    private String idCentroTrabajo;
    private String numeroEmpleadoDoctor;
    private String nombreDoctor;
    
    public Cita(){super();}
    
    public Cita(String idActividad, String matriculaPaciente, String idCentroTrabajo, String numeroEmpleadoDoctor, String nombreDoctor, String titulo, String descripcion, String fecha, String hora){
        super(idActividad, titulo, descripcion, fecha, hora);
        this.matriculaPaciente = matriculaPaciente;
        this.idCentroTrabajo = idCentroTrabajo;
        this.numeroEmpleadoDoctor = numeroEmpleadoDoctor;
        this.nombreDoctor = nombreDoctor;
    }
    
    public void setMatriculaPaciente(String matriculaPaciente){
        this.matriculaPaciente = matriculaPaciente;
    }
    public void setIdCentroTrabajo(String idCentroTrabajo){
        this.idCentroTrabajo = idCentroTrabajo;
    }
    public void setNumeroEmpleadoDoctor(String numeroEmpleadoDoctor){
        this.numeroEmpleadoDoctor = numeroEmpleadoDoctor;
    }
    public void setNombreDoctor(String nombreDoctor){
        this.nombreDoctor = nombreDoctor;
    }
    
}
