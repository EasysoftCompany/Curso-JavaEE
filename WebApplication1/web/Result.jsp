<%-- 
    Document   : Result
    Created on : 4/05/2019, 01:55:53 PM
    Author     : g_ric
--%>
<%@page import="com.dev.ejb.NewSessionBeanRemote"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="javax.naming.*"%>
 
<%!
    private NewSessionBeanRemote ops = null;
    float result = 0;
 
    public void jspInit() {
        try {
 
            InitialContext ic = new InitialContext();
            ops = (NewSessionBeanRemote)ic.lookup(NewSessionBeanRemote.class.getName());
             
 
            System.out.println("Loaded Calculator Bean");
 
 
        } catch (Exception ex) {
            System.out.println("Error:"
                    + ex.getMessage());
        }
    }
 
    public void jspDestroy() {
        ops = null;
    }
%>
 
 
<%
 
    try {
        String s1 = request.getParameter("num1");
        String s2 = request.getParameter("num2");
        String s3 = request.getParameter("g1");
 
        System.out.println(s3);
 
        if (s1 != null && s2 != null) {
            Float num1 = new Float(s1);
            Float num2 = new Float(s2);
if (s3.equals("add")) {
                result = ops.suma(num1.floatValue(), num2.floatValue());
            } else if (s3.equals("sub")) {
                result = ops.resta(num1.floatValue(), num2.floatValue());
            } 
 
%>
<p>
    <b>El resultado es:</b> <%= result%>
<p>
 
    <%
            }
        }// end of try
        catch (Exception e) {
            e.printStackTrace();
            //result = "Not valid";
        }
    %>
