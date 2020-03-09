package servicios_generales.model.eventos;

/**
 *
 * @author Kevin Enrique
 */
public class Evento {
    private String idEvento;
    private String titulo;
    private String descripcion;
    private String fecha;
    private String hora;
    private String ubicacion;
    private String foto;
    
    public Evento(){}
    
    public Evento(String idEvento, String titulo, String descripcion, String fecha, String hora, String ubicacion,String foto){
        this.idEvento = idEvento;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
        this.ubicacion = ubicacion;
        this.foto=foto;
        
    }

    public String getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(String idEvento) {
        this.idEvento = idEvento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public String getHora(){
        return this.hora;
    }
    
    public void setHora(String hora){
        this.hora = hora;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    
    //Metoddo para depuracion
    private void consolePrint(){
        System.out.println(""+titulo);
        System.out.println(""+descripcion);
        System.out.println(""+fecha);
        System.out.println(""+ubicacion);
        System.out.println("\n");
        
        
    }
}
