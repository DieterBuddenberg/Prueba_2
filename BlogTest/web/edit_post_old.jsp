<%@page import="model.dto.Post"%>
<%
    Post p = (Post) request.getAttribute("post");
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
        <h3>Editar Post</h3>
        
        <form action="${pageContext.request.contextPath}/Post/modificar" method="POST">
            <table border="0">
                <tr>
                    <td>Titulo</td>
                    <td><input type="text" name="titulo" value="<%=p.getTitulo() %>" /></td>
                </tr>
                <tr>
                    <td>Cuerpo</td>
                    <td><input type="text" name="cuerpo" value="<%=p.getCuerpo()%>" /></td>
                </tr>
                <tr>
                
                    <td colspan="2"><input type="submit" value="Modificar" /></td>
                </tr>

            </table>
                <input type="hidden" name="id" value="<%=p.getId() %>" />
            <a href="list_post.jsp">Volver</a>
        </form>
    </body>
</html>
