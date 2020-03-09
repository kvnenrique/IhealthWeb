
package servicios_generales.servicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import servicios_generales.model.cuentas.CuentaMedico;
import servicios_generales.model.cuentas.CuentaPaciente;
import servicios_generales.model.instalaciones.CentroDeAltaEspecialidad;
import servicios_generales.model.instalaciones.Hospital;
import servicios_generales.model.instalaciones.Laboratorio;
import servicios_paciente_medicos.model.recetas.Recetario;


public class ProxyBD {
    private static Connection conexion;
    private static String usuario = "root";
    private static String contraseniaBD = "";
    private static String url = "jdbc:mysql://localhost/ihealth"; 
   
    private void conectar(){
       try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion =  DriverManager.getConnection(url, usuario, contraseniaBD);
        }catch(ClassNotFoundException e){
            System.out.println("No se encontro la Driver clase de java");
            e.printStackTrace();
        }catch(SQLException e){
            System.out.println("Error sql a nivel de la conexion");
            e.printStackTrace();
        }
   }
   
    private void desconectar(){
       try {
           conexion.close();
       } catch (SQLException ex) {
           Logger.getLogger(ProxyBD.class.getName()).log(Level.SEVERE, null, ex);
           System.out.println("Error al desconectar");
       }
       
   }
   
   
    public CuentaPaciente getCuentaPaciente(String correo){
       conectar();
       
       ResultSet result = null;
       PreparedStatement statement = null;
       CuentaPaciente cuenta = new CuentaPaciente();
       
        try{
            String statementText = "SELECT* FROM `ihealth`.`cuentas` where correo = '"+ correo + "';" ;
            statement = conexion.prepareStatement(statementText);
            result = statement.executeQuery();
                   ///Regresa la primera cuenta que se encuentre
            if(result.next()){
                String contrasenia = result.getString(2);
                cuenta.setCorreo(correo);
                cuenta.setContrasenia(contrasenia);

            }else{
                cuenta = null;
            }

            return cuenta;
        }catch (SQLException e){
            System.out.println("Error al realizar la consulta en getCuentaPaciente");
            e.printStackTrace();
        }
        
        if(cuenta != null){
        //buscamos los demas datos del paciente en la tabla cuentasPacientes
            try{
                String statementText = "SELECT* FROM `ihealth`.`cuentaspacientes` where correo = '"+ correo + "';" ;
                statement = conexion.prepareStatement(statementText);
                result = statement.executeQuery();
                if(result.next()){
                    //Si si se encuentran los demas datos registrados
                    //se agregan a la informacion de la cuenta
                    String matricula = result.getString(2);
                    String nombre = result.getString(3);
                    String apellido = result.getString(4);
                    String codigoPostal = result.getString(5);
                    String fechaNacimiento = result.getString(6);
                    
                    cuenta.setMatricula(matricula);
                    cuenta.setNombre(nombre);
                    cuenta.setApellido(apellido);
                    cuenta.setCodigoPostal(codigoPostal);
                    cuenta.setFechaNacimiento(fechaNacimiento);
                }
                
            }catch(SQLException e){
            }
        
        
        }
       
       desconectar();
       return cuenta;

   }

    
    public ArrayList<CuentaMedico> getInfoMedicos(){
        ArrayList<CuentaMedico> medicos = new ArrayList<>();
        conectar();
        
        ResultSet result = null;
        PreparedStatement statement = null;
           
        
        try{
            String statementText = "SELECT * FROM `ihealth`.`cuentasmedicos`;" ;
            statement = conexion.prepareStatement(statementText);
            result = statement.executeQuery();
                   
            
            while(result.next()){
                String correo = result.getString(1);
                String numeroDeEmpleado = result.getString(2);
                String nombre = result.getString(3);
                String apellido = result.getString(4);
                String telefono = result.getString(5);
                float salario =(float) result.getFloat(6);
                String especialidad = result.getString(7);
                String departamento = result.getString(8);
                String almaMater = result.getString(9);
                String idCentroDeTrabajo = result.getString(10);
                String dirFoto = result.getString(11);
                
                //Note que para mostrar la informacion del medico no se requiere recuperar la contraseña de su cuenta
                medicos.add(new CuentaMedico(correo, "", numeroDeEmpleado, nombre, apellido, telefono, salario,
                especialidad, departamento, almaMater, idCentroDeTrabajo, dirFoto));
            }

            return medicos;
        }catch (SQLException e){
            System.out.println("Error al realizar la consulta en getInfoMedicos");
            e.printStackTrace();
        }
        
        
        desconectar();
        return medicos;
    }
    
    
    public ArrayList<Hospital> getInfoHospitales(){
        
        //Regresa la informacion de todos los hospitales omitiendo los
        //laboratorios y centros de alta especialidad
        ArrayList<Hospital> listaHospitales = new ArrayList<>();
        conectar();
        
        ResultSet result = null;
        PreparedStatement statement = null;
        
        
        try{
            String statementText = "SELECT * FROM `ihealth`.`hospitales`;" ;
            statement = conexion.prepareStatement(statementText);
            result = statement.executeQuery();
                   
            
            while(result.next()){
                String idCentroDeTrabajo = result.getString(1);
                String ubicacion = result.getString(2);
                String nombre = result.getString(3);
                String descripcion = result.getString(4);
                
                listaHospitales.add(new Hospital(idCentroDeTrabajo, ubicacion, nombre, descripcion, null, null));
            }

            return listaHospitales;
        }catch (SQLException e){
            System.out.println("Error al realizar la consulta en getInfoHospitales");
            e.printStackTrace();
        }
        
        
        
        desconectar();
        return listaHospitales;
    }
    
    public Hospital getHospital(String idCentroDeTrabajo){
        conectar();
        
        ResultSet result = null;
        PreparedStatement statement = null;
        String ubicacionHospital = null;
        String nombreHospital = null;
        String descripcionHospital = null;
        
        try{
            String statementText = "SELECT * FROM `ihealth`.`hospitales` WHERE idCentroDeTrabajo='"+ idCentroDeTrabajo +"';";
            statement = conexion.prepareStatement(statementText);
            result = statement.executeQuery();
                   
            
            if(result.next()){
               
                ubicacionHospital = result.getString(2);
                nombreHospital = result.getString(3);
                descripcionHospital = result.getString(4);
                
              
                //return new Hospital(idCentroDeTrabajo, ubicacion, nombre, null, null);
            }else{
                //return new Hospital();
            }          
        }catch (SQLException e){
            System.out.println("Error al realizar la consulta en getInfoHospitales");
            e.printStackTrace();
        }
        
        
        ArrayList<Laboratorio> laboratorios = new ArrayList<>();
        //Sacamos los laboratorios de ese hospital de la base de datos
        try{
            String statementText = "SELECT * FROM `ihealth`.`laboratorios` WHERE idCentroDeTrabajo='"+ idCentroDeTrabajo +"';";
            statement = conexion.prepareStatement(statementText);
            result = statement.executeQuery();
                   
            
            while(result.next()){
                String idLaboratorio = result.getString(1);
                String nombre = result.getString(3);

                laboratorios.add(new Laboratorio(idLaboratorio, idCentroDeTrabajo, nombre));
            }          
        }catch (SQLException e){
            System.out.println("Error al realizar la consulta en laboratorios para recuperar los datos del hospital");
            e.printStackTrace();
        }
        
        
        
        ArrayList<CentroDeAltaEspecialidad> centros = new ArrayList<>();
        //Sacamos los centros de alta especialidad que se encuentran en el hospital especificado
        
        try{
            String statementText = "SELECT * FROM `ihealth`.`centrosDeAltaEspecialidad` WHERE idCentroDeTrabajo='"+ idCentroDeTrabajo +"';";
            statement = conexion.prepareStatement(statementText);
            result = statement.executeQuery();
            
            while(result.next()){
                String idCentroDeAltaEspecialidad = result.getString(1);
                String nombre = result.getString(3);
                centros.add(new CentroDeAltaEspecialidad(idCentroDeAltaEspecialidad, idCentroDeTrabajo, nombre));
            }
        }catch(SQLException e){
            System.out.println("Error al realizar la consulta en centrosDeAltaEspecialidad para recuperar los datos del hospital");
            e.printStackTrace();
        }
        
        
        desconectar();
        return new Hospital(idCentroDeTrabajo, ubicacionHospital, nombreHospital, descripcionHospital ,laboratorios, centros);
     
    }
    
    
    //BETA
    public void savePaciente(CuentaPaciente paciente){
        conectar();
        
        String matricula = paciente.getMatricula();
        String contrasenia = paciente.getContrasenia();
        String nombre = paciente.getNombre();
        String apellido = paciente.getApellido();
        String correo = paciente.getCorreo();
        String codigoPostal = paciente.getCodigoPostal();
        String fechaNacimiento = paciente.getFechaNacimiento();
        
        try{
            PreparedStatement statement = conexion.prepareStatement("INSERT INTO `ihealth`.`cuentas`"
            + "(`correo`,"
            + "`contrasenia`) "
            + "VALUES(?, ?);");

            statement.setString(1, correo);
            statement.setString(2, contrasenia);

            statement.executeUpdate();
        }catch(SQLException e){
            System.out.println("Error al agregar la cuenta, insertando los datos de la tabla cuentas");
            e.printStackTrace();
        }    
        
        try{
            PreparedStatement statement = conexion.prepareStatement("INSERT INTO `ihealth`.`cuentas`"
            + "(`correo`,"
            + "`matricula`, " 
            + "`nombre`, " 
            + "`apellido`, "
            + "`codigoPostal`, "
            + "`fechaNacimiento`) "
            + "VALUES(?, ?, ?, ?, ?, ?);");

            statement.setString(1, correo);
            statement.setString(2, matricula);
            statement.setString(3, nombre);
            statement.setString(4, apellido);
            statement.setString(5, codigoPostal);
            statement.setString(6, fechaNacimiento);
            
            statement.executeUpdate();
        }catch(SQLException e){
            System.out.println("Error al agregar la cuenta, insertando los datos adicionaels de la cuenta en la tabla cuentas pacientes");
            e.printStackTrace();
        }  
            
        desconectar();        
    }
   
    //BETA
    public void saveRecetario(Recetario recetario){
    
    }
    
    //BETA
    public Recetario getRecetario(String matricula){
        Recetario recetario = new Recetario();
        return recetario;
    }
    
    
   
}
