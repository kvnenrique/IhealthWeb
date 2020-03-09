
package servicios_generales.model.cuentas;

/**
 *
 * @author Kevin Enrique
 */
public class CuentaPersonalMedico extends Cuenta{
    private String correo;
    private String numeroEmpleado;
    private String nombre;
    private String apellido;
    private String telefono;
    private float salario;
    
    public CuentaPersonalMedico(){super();}
    
    public CuentaPersonalMedico(String correo, String contrasenia, String numeroEmpleado, String nombre, String apellido, String telefono, float salario){
        super(contrasenia);
        this.correo = correo;
        this.numeroEmpleado = numeroEmpleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.telefono = telefono;
    }
     
    public void setCorreo(String correo){
        this.correo = correo;
    }
    
    public String getCorreo(){
        return this.correo;
    }
    
    public String getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(String numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
