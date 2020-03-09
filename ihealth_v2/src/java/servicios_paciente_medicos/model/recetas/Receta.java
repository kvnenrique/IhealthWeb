
package servicios_paciente_medicos.model.recetas;

import java.util.ArrayList;
import java.util.Iterator;


public class Receta {
    String matriculaPaciente;
    String numeroReceta;
    ArrayList <Medicamento> medicamentos;
    
    public Receta(String matriculaPaciente, String numReceta){
        this.matriculaPaciente = matriculaPaciente;
        this.numeroReceta = numReceta;
        medicamentos = new ArrayList<Medicamento>();
    }
    
    public Receta(String matriculaPaciente, String numeroReceta, ArrayList<Medicamento> medicamentos){
        this.numeroReceta = numeroReceta;
        this.matriculaPaciente = matriculaPaciente;
        this.medicamentos = new ArrayList<Medicamento>();
        this.medicamentos = medicamentos;
    }
    
    public void agregarMedicamento(Medicamento nuevoMedicamento){
        medicamentos.add(nuevoMedicamento);
    }
    
    public void elimninarMedicamento(String idMedicamento){
        Iterator iter;
        iter = medicamentos.iterator(); 
        Medicamento actual = medicamentos.get(0);
        int i = 0;
        
        while(iter.hasNext() && (actual.idMedicamento).equals(idMedicamento) == false){
            actual = (Medicamento) iter.next();
            i++;
        }
        
        if(actual.idMedicamento.equals(idMedicamento) ){
            medicamentos.remove(i);
        }
    }
}
