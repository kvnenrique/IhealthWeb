/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios_paciente_medicos.model.expediente;

/**
 *
 * @author Kevin Enrique
 */
public class HistoriaClinica extends Documento{
    
    public String sexo;
    public String antecedentesFamiliares;
    public String antecedentesPersonales;
    public String fechaDeNacimiento;
    
    public HistoriaClinica(){super();}
    
    public HistoriaClinica(String idDocumento, String matriculaPaciente, String sexo, String antecedentesFamiliares, String antecedentesPersonales, String fechaDeNacimiento ) {
        super(idDocumento, matriculaPaciente);
        this.sexo = sexo;
        this.antecedentesFamiliares = antecedentesFamiliares;
        this.antecedentesPersonales = antecedentesPersonales;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
        
}
