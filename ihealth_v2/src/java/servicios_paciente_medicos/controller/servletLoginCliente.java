/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios_paciente_medicos.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import servicios_generales.model.cuentas.CuentaPaciente;
import servicios_paciente_medicos.model.GestorClientes;


@WebServlet(name = "servletLoginCliente", urlPatterns = {"/servletLoginCliente"})
public class servletLoginCliente extends HttpServlet{

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        
        String usuario = request.getParameter("usuario");
        String contrasenia = request.getParameter("contrasenia");
      
        GestorClientes gestorClientes = new GestorClientes();
        CuentaPaciente cuenta = new CuentaPaciente();
        cuenta = gestorClientes.logIn(usuario, contrasenia);
        
        
        if(cuenta != null){
            request.getRequestDispatcher("/portal_clientes/GUIPrincipalClientes.jsp").forward(request, response);
        }{
            request.getRequestDispatcher("/portal_clientes/login.jsp").forward(request, response);
        }
        /*Cuando del archivo jsp esta en una carpeta, dentro de web pages, es necesario decir en que carpeta de web pages está*/
               
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
