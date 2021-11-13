package Servlets;

import Logica.Controladora;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ServletUno", urlPatterns = {"/ServletUno"})
public class ServletUno extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String dni = request.getParameter("dni");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String fechaNacimiento = request.getParameter("fechanacimiento");
        String direccion = request.getParameter("direccion");
        String profesion = request.getParameter("profesion");
        String tipoHabitacion = request.getParameter("tipohabitacion");
        String cantPersona = request.getParameter("cantpersona");
        String fechaInicio = request.getParameter("fechainicio");
        String fechaSalida = request.getParameter("fechasalida");
        
        
        
        
        request.getSession().setAttribute("dni", dni);
        request.getSession().setAttribute("nombre", nombre);
        request.getSession().setAttribute("apellido", apellido);
        request.getSession().setAttribute("fechanacimiento", fechaNacimiento);
        request.getSession().setAttribute("direccion", direccion);
        request.getSession().setAttribute("profesion", profesion);
        request.getSession().setAttribute("tipohabitacion", tipoHabitacion);
        request.getSession().setAttribute("cantpersona", cantPersona);
        request.getSession().setAttribute("fechainicio", fechaInicio);
        request.getSession().setAttribute("fechasalida", fechaSalida);
        
        response.sendRedirect("mostrar.jsp");
        
        
        Controladora control = new Controladora ();
        control.crearPersona(dni, nombre, apellido, direccion, profesion, tipoHabitacion, cantPersona);
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
