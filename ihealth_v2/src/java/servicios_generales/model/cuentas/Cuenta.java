
package servicios_generales.model.cuentas;


public class Cuenta {
    private String contrasenia;
    
    public Cuenta(String contrasenia){
        this.contrasenia = contrasenia;
    }
    public Cuenta( ){
 
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
}
