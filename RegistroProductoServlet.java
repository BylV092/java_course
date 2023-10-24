package org.lopez;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.ServletException;
import java.io.IOException;

@WebServlet("/crear")
public class RegistroProductoServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/jsp/form.jsp").forward(request, response);
        request.getRequestDispatcher("/form.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String precioStr = request.getParameter("precio");
        String fabricante = request.getParameter("fabricante");

        // Validar los datos
        boolean valid = true;
        String errorMessage = "";

        // Validación del nombre (no vacío)
        if (nombre == null || nombre.isEmpty()) {
            valid = false;
            errorMessage += "El nombre no puede estar vacío.<br>";
        }

        // Validación del precio (no vacío y entero)
        int precio = 0;
        try {
            precio = Integer.parseInt(precioStr);
        } catch (NumberFormatException e) {
            valid = false;
            errorMessage += "El precio debe ser un número entero.<br>";
        }

        // Validación del fabricante (no vacío, entre 4 y 10 caracteres)
        if (fabricante == null || fabricante.isEmpty() || fabricante.length() < 4 || fabricante.length() > 10) {
            valid = false;
            errorMessage += "El fabricante debe tener entre 4 y 10 caracteres.<br>";
        }

        if (valid) {
            // Si los datos son válidos, mostrarlos en el navegador
            response.setContentType("text/html");
            response.getWriter().println("<html><body>");
            response.getWriter().println("<h1>Datos válidos:</h1>");
            response.getWriter().println("Nombre: " + nombre + "<br>");
            response.getWriter().println("Precio: " + precio + "<br>");
            response.getWriter().println("Fabricante: " + fabricante + "<br>");
            response.getWriter().println("</body></html>");
        } else {
            // Si hay errores de validación, mostrar los mensajes de error
            response.setContentType("text/html");
            response.getWriter().println("<html><body>");
            response.getWriter().println("<h1>Errores de validación:</h1>");
            response.getWriter().println(errorMessage);
            response.getWriter().println("</body></html>");
        }
    }
}
