<%-- 
    Document   : logueado
    Created on : Aug 8, 2015, 6:47:23 PM
    Author     : Soler
--%>

<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrado como:</title>
    </head>
    <body>
        
        <% Date d= new Date(); %>
        
        <h1>Bienvenido!,<br> <%= request.getParameter("userName") %>!</h1>
        <br>
        Fecha de ingreso: <%=d %>
        
    </body>
</html>