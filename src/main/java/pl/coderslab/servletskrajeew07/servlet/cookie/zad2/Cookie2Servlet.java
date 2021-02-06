package pl.coderslab.servletskrajeew07.servlet.cookie.zad2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Cookie2", urlPatterns = {"/addToCookies"})
public class Cookie2Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("key");
        String value = request.getParameter("value");
        Cookie c = new Cookie(name, value);
        c.setMaxAge(24 * 60 * 60);
        c.setPath("/");

        response.addCookie(c);
        response.getWriter().println("Ustawiono ciasteczko: " + c.getName());
    }
}
