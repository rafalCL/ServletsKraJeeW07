package pl.coderslab.servletskrajeew07.servlet.zad1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Get1", urlPatterns = {"/get1"})
public class Get1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");
        String startStr = req.getParameter("start");
        String endStr = req.getParameter("end");
        try {
            int start = Integer.valueOf(startStr);
            int end = Integer.valueOf(endStr);

            for (int i = start; i<=end;i++){
                resp.getWriter().println(i+"<br/>");
            }
        } catch (NumberFormatException e){
            resp.getWriter().println("BRAK");
        }
    }
}
