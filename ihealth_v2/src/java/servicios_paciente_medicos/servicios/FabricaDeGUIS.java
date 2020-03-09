/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios_paciente_medicos.servicios;


public class FabricaDeGUIS {
    public String getGuiDirectorioMedico(){
        String HTML_GUI = "\"<head></head><body>Saludos desde la fabrica</body>\"";
        FabricaGUIDirectorioMedico fabrica = new FabricaGUIDirectorioMedico();
        
        HTML_GUI = fabrica.getGUI();
        return HTML_GUI;
    }
    
    public String getGUIDirectorioInstalaciones(){
        String HTML_GUI = "";
        FabricaGUIDirectorioInstalaciones fabrica = new FabricaGUIDirectorioInstalaciones();
        
        HTML_GUI = fabrica.getGUI();
        return HTML_GUI;
    }
}
