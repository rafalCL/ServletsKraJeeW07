package pl.coderslab.servletskrajeew07.servlet.form.zad1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Form1", urlPatterns = "/post1")
public class Form1Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");

        String toDisplay = String.format("Witaj, %s %s.", firstName, lastName);

        response.getWriter().println(toDisplay);
    }
}
