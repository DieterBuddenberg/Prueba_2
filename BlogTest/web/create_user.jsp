<%-- 
    Document   : create_post
    Created on : 23-05-2017, 19:52:40
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="resources/css/bootstrap.min.css"/>
        <title>Creación de Usuario</title>
    </head>
    <body>
        <div class="container">
		<h1>Creación de Usuario</h1><br>

                <form action="Usuario/ingresar" method="POST">

		    <div class="form-group row">
		      <label for="inputPassword3" class="col-sm-2 col-form-label">Usuario</label>
		      <div class="col-sm-10">
		        <input type="text" class="form-control" placeholder="Escriba Nombre Usuario" name="usuario" required>
		      </div>
		    </div>

                    <div class="form-group row">
		      <label for="inputPassword3" class="col-sm-2 col-form-label">Password</label>
		      <div class="col-sm-10">
		        <input type="password" class="form-control" placeholder="Escriba password" name="password" required>
		      </div>
		    </div>
                    
                    <div class="form-group row">
		      <label for="inputPassword3" class="col-sm-2 col-form-label">Email</label>
		      <div class="col-sm-10">
                        <input type="text" class="form-control" placeholder="Escriba Email" name="email" required>
                      </div>
		    </div>

		    <div class="form-group row">
		      <div class="offset-sm-2 col-sm-10 ">
		        <button type="submit" class="btn btn-primary" style="float: right;">Crear Usuario</button>
		      </div>
		    </div>
                       <input type="hidden" name="perfil_id" value="1" />
		  </form>
	</div>
    </body>
</html>
