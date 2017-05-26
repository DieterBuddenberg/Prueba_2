<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Blog</title>
    </head>
    <body>
        <h1>Blog</h1>
        <h3>Login</h3>
        
        <form action="Usuario/login" method="POST">

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
              <div class="offset-sm-2 col-sm-10 ">
                <button type="submit" class="btn btn-primary" style="float: right;">Login</button>
              </div>
            </div>
        </form>

        <a href="index.jsp">Volver</a>
    </body>
</html>