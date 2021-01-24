package pl.coderslab.servletskrajeew07.servlet.zad1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

@WebServlet(name = "Get2", urlPatterns = {"/get2"})
public class Get2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");

        final Map<String, String[]> parameters = req.getParameterMap();
        final Set<Map.Entry<String, String[]>> entries = parameters.entrySet();

        for(Map.Entry<String, String[]> entry : entries){
            String htmlRow = entry.getKey() + " : " + Arrays.toString(entry.getValue()) + "<br/>";
            resp.getWriter().println(htmlRow);
        }
    }
}
