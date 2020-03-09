
package servicios_generales.model.cuentas;

/**
 *
 * @author Kevin Enrique
 */
public class CuentaPersonalAdministrativo extends Cuenta{
    private String correo;
    private String numeroEmpleado;
    private String nombre;
    private String apellido;
    private String telefono;
    private float  salario;
    
    public CuentaPersonalAdministrativo(){super();}
    
    public CuentaPersonalAdministrativo(String correo, String numeroEmpleado, String contrasenia, String nombre, String apellido, String telefono, float salario){
        super(contrasenia);
        this.correo = correo;
        this.numeroEmpleado = numeroEmpleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.salario = salario;
    }
    
    public void setCorreo(String correo){
        this.correo = correo;
    }
    public void setNumeroEmpleado(String numeroEmpleado){
        this.numeroEmpleado = numeroEmpleado;
    }
    public void setNombre(String nomre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    public void setSalario(float salario){
        this.salario = salario;
    }
    
    public String getCorreo(){
        return this.correo;
    }
    public String getNumeroEmpleado(){
        return this.numeroEmpleado;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public String getTelefono(){
        return this.telefono;
    }
    public float getSalario(){
        return this.salario;
    }
    
}
