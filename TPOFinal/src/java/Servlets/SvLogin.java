package Servlets;

import Logica.ControladoraUser;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "SvLogin", urlPatterns = {"/SvLogin"})
public class SvLogin extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       
        
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String usuario =request.getParameter("user");
        String contra =request.getParameter("pass");
        
        ControladoraUser control = new ControladoraUser ();
        boolean autorizado = control.verificarUsuario(usuario,contra);
        
        if (autorizado == true) {
            HttpSession misession = request.getSession(true);
            misession.setAttribute("usuario", usuario);
            misession.setAttribute("contra", contra);
            
            response.sendRedirect ("reserva.jsp");
        } else {
            response.sendRedirect("index.jsp");
        }
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
