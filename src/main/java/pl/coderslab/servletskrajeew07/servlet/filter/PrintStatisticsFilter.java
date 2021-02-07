package pl.coderslab.servletskrajeew07.servlet.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter("/*")
public class PrintStatisticsFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        long start = System.currentTimeMillis();

        filterChain.doFilter(request, response);

        long end = System.currentTimeMillis();
        long duration = end-start;

        System.out.println("Handling request took: "+duration+"ms");
        HttpServletRequest httpRequest =(HttpServletRequest)request;
        String userAgent = httpRequest.getHeader("User-Agent");
        System.out.println("Agent: " + userAgent);
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }
}
