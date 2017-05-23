<%-- 
    Document   : index
    Created on : 21-05-2017, 20:21:58
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="resources/css/style.css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <form action="Profesor/ingresar" method="POST">
            <table border="0">
                <tr>
                    <td>Nombres</td>
                    <td><input type="text" name="txtNombres" value="" /></td>
                </tr>
                <tr>
                    <td>Apellidos</td>
                    <td><input type="text" name="txtApellidos" value="" /></td>
                </tr>
                <tr>
                    <td>Correo</td>
                    <td><input type="text" name="txtCorreo" value="" /></td>
                </tr>
                <tr>
                    <td colspan="2"><input type="submit" value="Agregar" /></td>
                </tr>

            </table>
            <a href="index.html">Volver</a>
        </form>
    </body>
    
</html>
