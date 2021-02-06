package pl.coderslab.servletskrajeew07.servlet.session.zad2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "Session2", urlPatterns = "/session2")
public class Session2Servlet extends HttpServlet {
    private static final String HTML = "<html>" +
            "<body>" +
            "<form method='post'>" +
            "Enter grade: <input type='number' name='grade'>" +
            "<input type='submit' />" +
            "</form>" +
            "<div>%s</div>" +
            "</body>" +
            "</html>";

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().println(String.format(HTML, ""));
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final HttpSession session = request.getSession();
        // try retrieve data from session
        List<Integer> data = (List<Integer>)session.getAttribute("data");

        if (data==null){
            // if data not present in session, then create new list
            data = new ArrayList<>();
        }

        // get value from form
        String gradeStr = request.getParameter("grade");

        try {
            // try convert input to number and if success then add to collection in session
            int grade = Integer.parseInt(gradeStr);
            data.add(grade);
            session.setAttribute("data", data);
        } catch (NumberFormatException e){
            e.printStackTrace();
        }

        // generate visual response
        String html = "";
        // calculate sum
        double sum = 0.;
        for (int val : data){
            sum += val;
        }

        if (data.size() < 1){
            // if no data in arr then write empty response
            html = String.format(HTML, "data=[], avg=n/a");
        } else {
            // if no data in arr then calculate avg and display
            double avg = sum / data.size();
            html = String.format(HTML, "data="+data.toString() + ", avg="+avg);
        }

        // set visual response to response object
        response.getWriter().println(html);
    }
}
