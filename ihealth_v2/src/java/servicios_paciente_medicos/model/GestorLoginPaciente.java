
package servicios_paciente_medicos.model;


import servicios_generales.model.cuentas.CuentaPaciente;
import servicios_generales.servicios.ProxyBD;


public class GestorLoginPaciente {
    
    public CuentaPaciente login(String usuario, String contrasenia){
        CuentaPaciente cuenta = new CuentaPaciente();
        ProxyBD proxy = new ProxyBD();
        
        cuenta = proxy.getCuentaPaciente(usuario);
        if(cuenta != null){
            if(contrasenia.equals(cuenta.getContrasenia())){
                //la cuenta con la matricula dada existe y
                //la contrasenia coincide
            }else{
                cuenta = null;
            }
        }
        
        return cuenta;
    }
}
