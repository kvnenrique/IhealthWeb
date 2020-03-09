
package servicios_generales.model.agendas;

/**
 *
 * @author Kevin Enrique
 */
public class Agendable {
    private String idAgendable;
    private String titulo;
    private String descripcion;
    private String fecha;
    private String hora;
    
    public Agendable(){}
    
    public Agendable(String idAgendable, String titulo, String descripcion, String fecha, String hora){
        this.idAgendable = idAgendable;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
    }
    
    public void setIdAgendable(String idAgendable){
        this.idAgendable = idAgendable;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    public void setFecha(String fecha){
        this.fecha = fecha;
    }
    public void setHora(String hora){
        this.hora = hora;
    }
    
    
    
    public String getIdAgendable(){
        return this.idAgendable;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public String getDescripcion(){
        return this.descripcion;
    }
    public String getFecha(){
        return this.fecha;
    }
    public String getHora(){
        return this.hora;
    }
    
}
