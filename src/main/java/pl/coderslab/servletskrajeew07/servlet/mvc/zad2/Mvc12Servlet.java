package pl.coderslab.servletskrajeew07.servlet.mvc.zad2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// W projekcie stwórz servlet Mvc12 dostępny pod adresem /mvc12 , który wczyta dwie zmienne GET : start i end . Następnie:
//
//W servlecie zwiększ obie wartości o wartość 10, przekaż zwiększone zmienne do widoku jsp2.jsp.
//W widoku wyświetl wszystkie liczby start do end.

@WebServlet(name = "Mvc12", urlPatterns = "/mvc12")
public class Mvc12Servlet extends HttpServlet {
     protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         String startStr = request.getParameter("start");
         String endStr = request.getParameter("end");
         try {
             int start = Integer.parseInt(startStr);
             int end = Integer.parseInt(endStr);
             start += 10;
             end += 10;
             request.setAttribute("start", start);
             request.setAttribute("end", end);
         } catch (NumberFormatException e){
             e.printStackTrace();
         }

         request.getRequestDispatcher("WEB-INF/view/mvc12.jsp").forward(request, response);
    }
}
