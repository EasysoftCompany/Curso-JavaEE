
package com.dev.data;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author g_ric
 */
public class helloConfigServlet extends HttpServlet {

    private void process(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        String usr = request.getParameter("user");
        String pwd = request.getParameter("password");
        out.println("<h2> Hola 1 </h2>");
        out.print("<ul>");
        out.print("<li>"+usr+"</li>");
        out.print("<li>"+pwd+"</li>");
        out.print("<ul>");
        
        
    }
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       process(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        process(req,resp);
      }
    
    
    
}
