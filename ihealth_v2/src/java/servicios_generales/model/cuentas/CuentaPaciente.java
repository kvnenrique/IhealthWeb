
package servicios_generales.model.cuentas;

import servicios_generales.model.cuentas.Cuenta;


public class CuentaPaciente extends Cuenta{
    private String matricula;
    private String nombre;
    private String correo;
    private String apellido;
    private String codigoPostal;
    private String fechaNacimiento;
    
    public CuentaPaciente(){
        super();
    }
    
    public CuentaPaciente(String matricula, String contrasenia, String correo, String nombre, String apellido, String codigoPostal, String fechaNacimiento){
        super(contrasenia);
        this.correo          = correo;
        this.matricula       = matricula;
        this.nombre          = nombre;
        this.apellido        = apellido;
        this.codigoPostal    = codigoPostal;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public String getMatricula(){
        return this.matricula;
    }
    public String getCorreo(){
        return this.correo;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public String getCodigoPostal(){
        return this.codigoPostal;
    }
    public String getFechaNacimiento(){
        return this.fechaNacimiento;
    }
    
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public void setCorreo(String correo){
        this.correo = correo;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setCodigoPostal(String codigoPostal){
        this.codigoPostal = codigoPostal;
    }
    public void setFechaNacimiento(String fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }   
}
