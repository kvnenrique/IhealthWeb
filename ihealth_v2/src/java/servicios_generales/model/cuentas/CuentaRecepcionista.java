package servicios_generales.model.cuentas;
/**
 *
 * @author Kevin Enrique
 */
public class CuentaRecepcionista extends CuentaPersonalAdministrativo{
    private String idCentroTrabajo;
    
    public CuentaRecepcionista(){super();}
    
    public CuentaRecepcionista(String correo,String numeroEmpleado, String contraseña, String nombre, String apellido, String telefono, float salario, String idCentroTrabajo){
        super(correo, numeroEmpleado, contraseña, nombre, apellido, telefono, salario);
        this.idCentroTrabajo = idCentroTrabajo;
    }
    
    public void setIdCentroTrabajo(String idCentroTrabajo){
        this.idCentroTrabajo = idCentroTrabajo;
    }
    
    public String getIdCentroTrabajo(){
        return this.idCentroTrabajo;
    }
}
