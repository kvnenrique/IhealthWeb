
package servicios_generales.model.cuentas;


public class CuentaDirectivo extends CuentaPersonalAdministrativo{
    public CuentaDirectivo(String correo, String numeroEmpleado, String contraseña, String nombre, String apellido, String telefono, float salario){
        super(correo, numeroEmpleado, contraseña, nombre, apellido, telefono, salario);    
    }
}
