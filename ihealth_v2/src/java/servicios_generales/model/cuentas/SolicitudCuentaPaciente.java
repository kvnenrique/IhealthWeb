
package servicios_generales.model.cuentas;

/**
 *
 * @author Kevin Enrique
 */
public class SolicitudCuentaPaciente {
    private String correo;
    private String nombre;
    private String apellido;
    private String codigoPostal;
    private String fechaNacimiento;
    
    public SolicitudCuentaPaciente(){super();}
    
    //La matricula y contrasenia se asignas una vez que es un cliente registrado
    public SolicitudCuentaPaciente(String correo, String nombre, String apellido, String codigoPostal, String fechaNacimiento){
        this.correo = correo;
        this.nombre =          nombre;
        this.apellido =        apellido;
        this.codigoPostal =    codigoPostal;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
}
