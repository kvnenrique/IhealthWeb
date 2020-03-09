
package servicios_paciente_medicos.servicios;

import java.util.ArrayList;
import java.util.Iterator;
import servicios_generales.model.instalaciones.Hospital;
import servicios_generales.servicios.ProxyBD;

/**
 *
 * @author Kevin Enrique
 */
public class FabricaGUIDirectorioInstalaciones {
    public String getGUI(){
        String GUI = "";
        ProxyBD proxy = new ProxyBD();
        ArrayList<Hospital> hospitales = proxy.getInfoHospitales();
        Iterator iterHospitales = hospitales.iterator();
        
        GUI = "";
        String header = "<!DOCTYPE html>\n" +
"<html lang=\"en\">\n" +
"<head> <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\">\n" +
"  <script src=\"https://code.jquery.com/jquery-3.4.1.slim.min.js\" integrity=\"sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n\" crossorigin=\"anonymous\"></script>\n" +
"  <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\"></script>\n" +
"  <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\" integrity=\"sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6\" crossorigin=\"anonymous\"></script>\n" +
"  <meta charset=\"UTF-8\">\n" +
"  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
"  <LINK REL=StyleSheet HREF=\"/ihealth_v2/assets/styles/index.css\" TYPE=\"text/css\" MEDIA=screen>\n" +
"  <title>Ihealth</title> </head><body><nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n" +
"      <a class=\"navbar-brand\" href=\"/ihealth_v2\"> ABC </a>\n" +
"      <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" \n" +
"      aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n" +
"        <span class=\"navbar-toggler-icon\"></span>\n" +
"      </button>\n" +
"\n" +
"      <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n" +
"        <ul class=\"navbar-nav mr-auto\">\n" +
"          <li class=\"nav-item active\">\n" +
"            <a class=\"nav-link text-info\" href=\"/ihealth_v2\">Ihealth<span class=\"sr-only\">(current)</span></a>\n" +
"          </li>\n" +
"          <li class=\"nav-item\">\n" +
"            <a class=\"nav-link text-info\" href=\"/ihealth_v2\">Conocenos</a>\n" +
"          </li>\n" +
"\n" +
"          <li class=\"nav-item dropdown\">\n" +
"\n" +
"            <a class=\"nav-link text-info\" href=\"#\" role=\"button\" id=\"dropdownMenuLink\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">Directorio</a>\n" +
"            <div class=\"dropdown-menu\" aria-labelledby=\"dropdownMenuButton\">\n" +
"              <a class=\"dropdown-item\" href=\"/ihealth_v2/servletDirectorioMedico\">Medicos</a>\n" +
"              <a class=\"dropdown-item\" href=\"/ihealth_v2/servletInstalaciones\">Instalaciones</a>\n" +
"            </div>\n" +
"          </li>               \n" +
"        </ul>\n" +
"\n" +
"        <form class=\"form-inline my-2 my-lg-0\" action=\"index.html\">\n" +
"          <a class=\"btn btn-outline-info my-2 my-sm-0\" href=\"/ihealth_v2/portal_clientes/pagina_de_registro.jsp\">Registrarse</a>\n" +
"        </form>\n" +
"          &nbsp;\n" +
"        <form class=\"form-inline my-2 my-lg-0\" action=\"index.html\">\n" +
"          <a class=\"btn btn-outline-info my-2 my-sm-0\" href=\"/ihealth_v2/portal_clientes/login.jsp\">Iniciar Sesion</a>\n" +
"        </form>\n" +
"      </div>\n" +
"  </nav>";
        
         String footer = " <footer class=\"site-footer\">\n" +
"      <div class=\"container\">\n" +
"        <div class=\"row\">\n" +
"          <div class=\"col-sm-12 col-md-6\">\n" +
"            <h6>About</h6>\n" +
"            <p class=\"text-justify\">Scanfcode.com <i>CODE WANTS TO BE SIMPLE </i> is an initiative  to help the upcoming programmers with the code. Scanfcode focuses on providing the most efficient code or snippets as the code wants to be simple. We will help programmers build up concepts in different programming languages that include C, C++, Java, HTML, CSS, Bootstrap, JavaScript, PHP, Android, SQL and Algorithm.</p>\n" +
"          </div>\n" +
"\n" +
"          \n" +
"\n" +
"        </div>\n" +
"        <hr>\n" +
"      </div>\n" +
"      <div class=\"container\">\n" +
"        <div class=\"row\">\n" +
"          <div class=\"col-md-8 col-sm-6 col-xs-12\">\n" +
"            <p class=\"copyright-text\">Copyright &copy; 2020 All Rights Reserved by\n" +
"         <a href=\"#\">Ihealth</a>.\n" +
"            </p>\n" +
"          </div>\n" +
"\n" +
"          <div class=\"col-md-4 col-sm-6 col-xs-12\">\n" +
"            <ul class=\"social-icons\">\n" +
"              <li><a class=\"facebook\" href=\"#\"><i class=\"fa fa-facebook\"></i></a></li>\n" +
"              <li><a class=\"twitter\" href=\"#\"><i class=\"fa fa-twitter\"></i></a></li>\n" +
"              <li><a class=\"dribbble\" href=\"#\"><i class=\"fa fa-dribbble\"></i></a></li>\n" +
"              <li><a class=\"linkedin\" href=\"#\"><i class=\"fa fa-linkedin\"></i></a></li>   \n" +
"            </ul>\n" +
"          </div>\n" +
"        </div>\n" +
"      </div>\n" +
"</footer>" + "</body>\n" +
"</html>";
        
        String tituloGUI = "<h2>Hospitales</h2><br>";
        String tabla = "<table class=\"table table-bordered\">";
        
        
        while(iterHospitales.hasNext()){
            Hospital actual = (Hospital) iterHospitales.next();
            String nombre = actual.getNombre();
            String ubicacion = actual.getUbicacion();
            String descripcion = actual.getDescripcion();
            
            
            
            
            
            
            String elementoTabla = "<tr>\n" +
"                <td colspan=\"2\" style=\"background-color: cadetblue\"><a href=\"http://data.salud.cdmx.gob.mx/portal/index.php/um-sedesa/110-hospital-materno-infantil-dr-nicolas-m-cedillo-soriano\" target=\"_blank\" class=\"list-group-item list-group-item-action\" >"+ nombre +"</a>\n" +
"                </td>\n" +
"            </tr>\n" +
"            <tr>\n" +
"                <td class=\"col-sm-3 col-md-6\" >\n" +
"                    <p></p>\n" +
"                    <p>" + descripcion+   "</p>\n" +
"                </td>\n" +
"                <td><iframe src=\" " + ubicacion  + "    \" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0;\" allowfullscreen=\"\"></iframe></td>\n" +
"\n" +
"            </tr>";
        
            
            
            tabla = tabla + elementoTabla;
        }
        
        
        
        
        
        tabla = tabla + "</table>";
        GUI = header+ "<div class=\"container\">" + tituloGUI +   tabla  +"</div>"+footer;
        
        
        return GUI;
    }
}
