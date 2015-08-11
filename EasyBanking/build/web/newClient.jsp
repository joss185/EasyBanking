<%-- 
    Document   : newClient
    Created on : 09-ago-2015, 21:49:22
    Author     : Joss
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nuevo cliente</title>
        <form action="CreatePersons">
            id:<input type="text" name="Cedula"/><br/>
             name:<input type="text" name="Nombre"/><br/>
             password:<input type="text" name="Contraseña" /><br/>
             birtdate:<input type="date" name="Fecha de nacimiento">
             address:<input type="text" name="Dirección"/><br/>
             phone: <input type="text" name="Telefono"/>
             <br/>
             <h1>Seleccione el tipo de cliente </h1>
             <select name="clientType" size="2">
                 <option>Jurídico</option>
                 <option>Físico</option>
             </select><br/>
         
         <input type="submit" value="Add" name="newClient" />
    </form>
    </head>
    <body>
        
    </body>
</html>
