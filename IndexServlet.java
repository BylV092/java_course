package org.aguzman.webapp.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/index.html")
public class IndexServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        if (nombre != null && apellido != null) {
            String fechaActual = new SimpleDateFormat("dd 'de' MMMM, yyyy").format(new Date());

            out.println("<html>");
            out.println("<body>");
            out.println("<p>Nombre: " + nombre + "</p>");
            out.println("<p>Apellido: " + apellido + "</p>");
            out.println("<p>Fecha y hora actual: " + fechaActual + "</p>");
            out.println("</body>");
            out.println("</html>");
        } else {
            out.println("No se enviaron los datos necesarios (nombre y apellido).");
        }
    }
}
