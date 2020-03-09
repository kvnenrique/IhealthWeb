
package servicios_paciente_medicos.model.expediente;


public class Documento {
    public String idDocumento;
    public String matriculaPaciente;
    
    public Documento(){
    }
    
    public Documento(String idDocumento, String matriculaPaciente){
        this.idDocumento = idDocumento;
        this.matriculaPaciente = matriculaPaciente;
    }
    
}
