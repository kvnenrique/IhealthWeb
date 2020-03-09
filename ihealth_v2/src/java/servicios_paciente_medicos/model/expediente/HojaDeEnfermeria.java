
package servicios_paciente_medicos.model.expediente;


public class HojaDeEnfermeria extends Documento{
    public String notaEnfermeria;
    public int peso;
    public int talla;
    
    public HojaDeEnfermeria(){super();}
            
    public HojaDeEnfermeria(String idDocumento, String matriculaPaciente, String notaEnfermeria, int peso, int estatura) {
        super(idDocumento, matriculaPaciente);
        this.notaEnfermeria = notaEnfermeria;
        this.peso = peso;
        this.talla = estatura;
    }
}
