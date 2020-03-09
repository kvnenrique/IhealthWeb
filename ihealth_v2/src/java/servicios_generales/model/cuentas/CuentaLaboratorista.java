
package servicios_generales.model.cuentas;

/**
 *
 * @author Kevin Enrique
 */
public class CuentaLaboratorista extends CuentaPersonalMedico{
    public String idCentroTrabajo;
    
    public CuentaLaboratorista(){super();}
    
    public CuentaLaboratorista(String correo, String contraseña, String numeroEmpleado, String nombre, String apellido, String telefono, float salario, String idCentroTrabajo){
        super(correo, contraseña, numeroEmpleado, nombre, apellido, telefono, salario);
        this.idCentroTrabajo = idCentroTrabajo;
    }
    
    public void setCentroTrabajo(String idCentroTrabajo){
        this.idCentroTrabajo = idCentroTrabajo;
    }
    
    public String getCentroTrabajo(){
        return this.idCentroTrabajo;
    }
}
