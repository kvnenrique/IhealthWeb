
package servicios_paciente_medicos.model;


import servicios_generales.model.cuentas.CuentaPaciente;
import servicios_generales.model.cuentas.Cuenta;


public class GestorClientes {
    public CuentaPaciente logIn(String usuario, String contrasenia){
        GestorLoginPaciente gestorLogin = new GestorLoginPaciente();
        CuentaPaciente cuenta = new CuentaPaciente();
        
        cuenta = gestorLogin.login(usuario, contrasenia);
        
        return cuenta;
    }
}
