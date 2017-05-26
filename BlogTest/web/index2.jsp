<%@page import="java.util.ArrayList"%>
<%@page import="model.dto.Post"%>
<%@page import="model.dao.PostDAO"%>
<%@page import="model.dto.Comentarios"%>
<%@page import="model.dao.ComentariosDAO"%>
<%@page import="model.dto.Usuario"%>


<%
  Usuario user = (Usuario) request.getAttribute("perfil");
  PostDAO pstDao = new PostDAO();
  ArrayList<Post> posts = pstDao.listar();
  ComentariosDAO comDao = new ComentariosDAO();
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Blog</title>
    </head>
    <body>
        <h1>Blog <%= user.getPerfil_id() %></h1>
        
        <% if(user.getPerfil_id() == 3) { 
            response.getWriter().print("<h3>Noticias</h3>");
        } %>
        
        <table>
            <% for(Post p : posts){ %>
            <tr>
                <th>
                    <%=p.getTitulo() %>
                </th>
            </tr>
            <tr>
                <td><%=p.getCuerpo() %></td>
            </tr>
            <% ArrayList<Comentarios> coms = comDao.listar(p.getId());
               for(Comentarios c : coms){ %>
            <tr>
                <td><%=c.getComentario() %></td>
            </tr>
            <% } %>
            <tr>
                <td><a href="Comentarios/ingresar?id=<%=p.getId() %>">Comentar</a></td>
            </tr>
            <tr></tr>
            <% } %>
        </table>
        
        <a href="index.jsp">Volver</a>
    </body>
</html>