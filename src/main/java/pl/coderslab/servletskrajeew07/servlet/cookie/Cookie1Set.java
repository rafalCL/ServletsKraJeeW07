package pl.coderslab.servletskrajeew07.servlet.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Cookie1Set", urlPatterns = {"/setCookie"})
public class Cookie1Set extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie c = new Cookie("User", "CodersLab");
        c.setMaxAge(24 * 60 * 60);
        c.setPath("/");

        response.addCookie(c);
        response.getWriter().println("Ustawiono ciasteczko");
    }
}
