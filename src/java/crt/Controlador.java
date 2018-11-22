/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crt;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Calcular;

/**
 *
 * @author luisignacio
 */
public class Controlador extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        Calcular obj = new Calcular();
        obj.setRut(request.getParameter("rut"));
        obj.setNombre(request.getParameter("nombre"));
        obj.setApellido_p(request.getParameter("apellido_p"));
        obj.setApellido_m(request.getParameter("apellido_m"));
        obj.setEmail(request.getParameter("email"));
        obj.setTelefono(Integer.parseInt(request.getParameter("telefono")));
        obj.setMonto(Integer.parseInt(request.getParameter("monto")));
        obj.setPlazo(Integer.parseInt(request.getParameter("plazo")));
        obj.setFecha_p(request.getParameter("fecha_p"));
        obj.setFecha_n(request.getParameter("fecha_n"));
        obj.subir();
        obj.validar_rut();
        obj.validar_nombre();
        obj.validar_apellido_p();
        obj.validar_apellido_m();
        obj.validar_email();
        obj.validar_telefono();
        obj.validar_monto();
        obj.validar_plazo();
        obj.validar_fecha_pago();
        obj.validar_fecha_nacimiento();
        
        
        request.setAttribute("ObjetoJava", obj);

        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            //out.println("Controlador");
            RequestDispatcher a = request.getRequestDispatcher("index.jsp");
            a.forward(request, response);
            
        }
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


