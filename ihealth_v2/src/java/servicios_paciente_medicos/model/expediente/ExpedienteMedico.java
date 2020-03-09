
package servicios_paciente_medicos.model.expediente;


import java.util.ArrayList;
import java.util.Iterator;

public class ExpedienteMedico {
    public ArrayList<Documento> documentos;
    
    public ExpedienteMedico(){
        documentos = new ArrayList<Documento>();
    }
    
    public ExpedienteMedico(ArrayList <Documento> documentos){
        this.documentos = new ArrayList<Documento>();
        this.documentos = documentos;
    }
    
    public void agregarDocuemento(Documento nuevoDocuemto){
        documentos.add(nuevoDocuemto);
    }
    
    public void eliminarDocumento (String idDocumento){
        Iterator iter;
        iter = documentos.iterator(); 
        Documento actual = documentos.get(0);
        int i = 0;
        
        while(iter.hasNext() && (actual.idDocumento).equals(idDocumento) == false){
            actual = (Documento) iter.next();
            i++;
        }
        
        if(actual.idDocumento.equals(idDocumento) ){
            documentos.remove(i);
        }
    }
    
}
