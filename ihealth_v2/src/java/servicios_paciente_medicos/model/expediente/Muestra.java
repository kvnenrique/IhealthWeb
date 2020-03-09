
package servicios_paciente_medicos.model.expediente;

/*
 * @author Kevin Enrique
 */
public class Muestra extends Documento{
    public String tipoDeMuestra;
    public String resultado;
    
    public Muestra(){super();}
    
    public Muestra(String idDocumento, String matriculaPaciente, String tipoDeMuestra, String resultado) {
        super(idDocumento, matriculaPaciente);
        this.tipoDeMuestra = tipoDeMuestra;
        this.resultado = resultado;
    }
}
