
package servicios_paciente_medicos.model.expediente;


public class PruebaDeLaboratorio extends Documento{
    private String nombrePrueba;
    private String idPrueba;
    private String idLaboratorio;
    private String resultado;
    
    
    public PruebaDeLaboratorio(String idDocumento, String matriculaPaciente, String idPrueba,String idLaboratorio, String nombrePrueba, String resultado) {
        super(idDocumento, matriculaPaciente);
        this.idPrueba = idPrueba;
        this.idLaboratorio = idLaboratorio;
        this.nombrePrueba = nombrePrueba;
        this.resultado = resultado;
    }
    
    public PruebaDeLaboratorio() {
        super();

    }

   

    public String getIdPrueba() {
        return idPrueba;
    }

    public void setIdPrueba(String idPrueba) {
        this.idPrueba = idPrueba;
    }

    public String getNombrePrueba() {
        return nombrePrueba;
    }

    public void setNombrePrueba(String nombrePrueba) {
        this.nombrePrueba = nombrePrueba;
    }

    public String getIdLaboratorio() {
        return idLaboratorio;
    }

    public void setIdLaboratorio(String idLaboratorio) {
        this.idLaboratorio = idLaboratorio;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(String idDocumento) {
        this.idDocumento = idDocumento;
    }

    public String getMatriculaPaciente() {
        return matriculaPaciente;
    }

    public void setMatriculaPaciente(String matriculaPaciente) {
        this.matriculaPaciente = matriculaPaciente;
    }
    
}
