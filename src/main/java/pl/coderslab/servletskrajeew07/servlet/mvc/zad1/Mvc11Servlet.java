package pl.coderslab.servletskrajeew07.servlet.mvc.zad1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// Dołącz do projektu bibliotekę jstl.
//W projekcie stwórz servlet Mvc11 dostępny pod adresem /mvc11.
//W servlecie pobierz wartość GET o nazwie role a następnie zamień zawartość na wielkie litery oraz dodaj prefix ROLE_ (dla wartości manager otrzymamy ROLE_MANAGER).
//Ustaw atrybut o nazwie userRole ze zmienioną wartością.
//Ustaw plik jsp jako plik widoku dla tego servletu.
//W przypadku braku wartości ma się wyświetlić napis guest.

@WebServlet(name = "Mvc11", urlPatterns = "/mvc11")
public class Mvc11Servlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String role = request.getParameter("role");
        if(role!=null){
            role = role.toUpperCase();
            role = "ROLE_"+role;

            request.setAttribute("userRole", role);
        }

        request.getRequestDispatcher("/WEB-INF/view/mvc11.jsp").forward(request, response);
    }
}
