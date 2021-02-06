package pl.coderslab.servletskrajeew07.servlet.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Cookie1Del", urlPatterns = {"/deleteCookie"})
public class Cookie1Del extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        boolean cookieFound = false;
        final Cookie[] cookies = request.getCookies();
        for(Cookie c : cookies){
            if(c.getName().equals("User")){
                c.setMaxAge(0);
                c.setPath("/");
                response.addCookie(c);
                response.getWriter().println("Usunięto ciasteczko");
                cookieFound = true;
            }
        }

        if(!cookieFound){
            response.getWriter().println("BRAK");
        }
    }
}
