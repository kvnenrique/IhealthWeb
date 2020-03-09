
package servicios_paciente_medicos.model.expediente;

/**
 *
 * @author Kevin Enrique
 */
public class NotaMedica extends Documento{
    public String numeroEmpleado;
    public String notaDelMedico;
    
    public NotaMedica(String idDocumento, String matriculaPaciente, String numeroDeEmpleado, String notaDelMedico) {
        super(idDocumento, matriculaPaciente);
        this.numeroEmpleado = numeroEmpleado;
        this.notaDelMedico = notaDelMedico;
    }
}
