package pl.coderslab.servletskrajeew07.servlet.session.zad1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "Session1Get", urlPatterns = "/session1Get")
public class Session1GetServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final HttpSession session = request.getSession();
        Integer counter = (Integer)session.getAttribute("counter");

        if (counter==null){
            response.getWriter().println("EMPTY");
        } else {
            response.getWriter().println("counter="+counter);
            counter++;
            session.setAttribute("counter", counter);
        }



    }
}
