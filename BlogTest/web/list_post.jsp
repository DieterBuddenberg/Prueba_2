<%@page import="java.util.ArrayList"%>
<%@page import="model.dto.Post"%>
<%@page import="model.dao.PostDAO"%>
<%
  PostDAO pstDao = new PostDAO();
  ArrayList<Post> posts = pstDao.listar();
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Blog</h1>
        <h3>Listar Post</h3>
        
        <table>
            <tr>
                <td>Modificar</td>
                <td>Eliminar</td>
                <td>Id Post</td>
                <td>Titulo</td>
            </tr>
            
            <% for(Post p : posts){ %>
            <tr>
                    <td><a href="Post/buscar?id=<%=p.getId() %>"><img src="img/edit.png" /></a></td>
                <td><a href="Post/eliminar?id=<%=p.getId() %>"><img src="img/delete.png" /></a></td>
                <td><%=p.getId() %></td>
                <td><%=p.getTitulo() %></td>
            </tr>
            
            <% } %>
        </table>
        
        <a href="index.html">Volver</a>
    </body>
</html>
