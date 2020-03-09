
package servicios_generales.model.cuentas;

/**
 *
 * @author Kevin Enrique
 */
public class CuentaMedico extends CuentaPersonalMedico{
    private String especialidad;
    private String departamento;
    private String almaMater;
    private String idCentroDeTrabajo;
    private String dirFoto;
    
    public CuentaMedico(){
        super();
    }
    
    public CuentaMedico(String correo, String contraseña, String numeroEmpleado, String nombre, String apellido, String telefono, float salario, String especialidad, String departamento, String almaMater, String idCentroDeTrabajo, String dirFoto){
        super(correo, contraseña, numeroEmpleado, nombre, apellido, telefono, salario);
        this.especialidad = especialidad;
        this.departamento = departamento;
        this.almaMater = almaMater;
        this.idCentroDeTrabajo = idCentroDeTrabajo;
        this.dirFoto = dirFoto;
    }
    
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getAlmaMater() {
        return almaMater;
    }

    public void setAlmaMater(String almaMater) {
        this.almaMater = almaMater;
    }

    public String getIdCentroDeTrabajo() {
        return idCentroDeTrabajo;
    }

    public void setIdCentroDeTrabajo(String idCentroTrabajo) {
        this.idCentroDeTrabajo = idCentroTrabajo;
    }
    
    public String getDirFoto(){
        return this.dirFoto;
    }
    
    public void setDirFoto(){
        this.dirFoto = dirFoto;
    }

}
