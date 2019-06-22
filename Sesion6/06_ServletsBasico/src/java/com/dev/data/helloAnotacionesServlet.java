package com.dev.data;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Map;
import java.util.UUID;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author g_ric
 */
@WebServlet(urlPatterns = {"/hello2", "/1", "/2"}) //Se puede tener un arreglo de direcciones que responden con el servlet!

public class helloAnotacionesServlet extends HttpServlet {

    private void handler(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        String usr = request.getParameter("user");
        String pwd = request.getParameter("password");
        out.println("<h2> Hola 2</h2>");
        out.print("<ul>");
        out.print("<li>" + usr + "</li>");
        out.print("<li>" + pwd + "</li>");
        out.print("</ul>");

        out.print("<ul>");
        
        Enumeration<String> params = request.getParameterNames();
        while(params.hasMoreElements())
        {
          out.print("<li>" + params.nextElement() + "</li>");
        }
        out.print("</ul>");
        
        
         //Asi de facil se agrega una Cookie <3
         
        Cookie cookie = new Cookie("CLASE","JavaEE7");
        cookie.setMaxAge(30); //Expira en 30 Segundos
        response.addCookie(cookie);
        
        
        
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        handler(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        handler(req, resp);
    }

}
