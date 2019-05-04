<%-- 
    Document   : formulario
    Created on : 4/05/2019, 01:45:04 PM
    Author     : g_ric
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculadora</title>
    </head>
    <body bgcolor="lightgreen">
        <h1>Operaciones Basicas</h1>
        
        <hr/>
        
        <form action="Result.jsp" method="POST">
            
            <p>Primer Valor <input type="number" name="num1" size="25"></p>
            
            <p>Segundo Valor <input type="number" name="num2" size="25"></p>
            <br>
            <b>Operacion</b><br/>
            <input type="radio" name="g1" value="add">SUMA <br/>
            <input type="radio" name="g1" value="sub">RESTA <br/>
            <br/><br/>
            
            
            <input type="submit" value="Enviar" />    
            <input type="reset" value="Limpiar" />
            
        </form>
    </body>
</html>
