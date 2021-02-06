package pl.coderslab.servletskrajeew07.servlet.cookie.zad4;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Cookie4Show", urlPatterns = "/showAllCookies")
public class Cookie4ShowServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");

        final Cookie[] cookies = request.getCookies();
        for(Cookie c : cookies){
            String name = c.getName();
            String row = String.format("<a href=\"removeCookie?toDelete=%s\">Del cookie: %s</a><br/>", name, name);
            response.getWriter().println(row);
        }
    }
}
