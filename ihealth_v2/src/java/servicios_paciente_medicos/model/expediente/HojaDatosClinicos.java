
package servicios_paciente_medicos.model.expediente;


public class HojaDatosClinicos extends Documento{
    public int peso;
    public String tipoSanguineo;
    public int presionArterial;
    public int talla;
    
    public HojaDatosClinicos(){super();}
    
    public HojaDatosClinicos(String idDocumento, String matriculaPaciente, int peso, String tipoSanguineo, int presionArterial, int talla) {
        super(idDocumento, matriculaPaciente);
        this.peso = peso;
        this.tipoSanguineo = tipoSanguineo;
        this.presionArterial = presionArterial;
        this.talla = talla;
    }
}
