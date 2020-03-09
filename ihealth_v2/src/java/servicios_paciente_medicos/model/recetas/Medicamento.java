
package servicios_paciente_medicos.model.recetas;


public class Medicamento {
    String idMedicamento;
    String idReceta;
    String matriculaPaciente;
    String nombreMedicamento;
    String descripcionDeHorarios;
    String notaDelMedico;
    
    public Medicamento(String idMedicamento, String idReceta, String matriculaPaciente, String nombreMedicamento, String descripcionDeHorarios, String notaDelMedico){
        this.idMedicamento = idMedicamento;
        this.idReceta = idReceta;
        this.matriculaPaciente = matriculaPaciente;
        this.nombreMedicamento = nombreMedicamento;
        this.descripcionDeHorarios = descripcionDeHorarios;
        this.notaDelMedico = notaDelMedico;
    }
}
