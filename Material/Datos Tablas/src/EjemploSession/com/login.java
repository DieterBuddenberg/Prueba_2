package EjemploSession.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 //metodo encargado de la gesti�n del m�todo POST (se esta enviando via post desde el .jsp!!)
		
		HttpSession sesion = request.getSession(); // Se crea la session 
        String usuario, pass;
        usuario = request.getParameter("usuario");
        pass = request.getParameter("password");
        
        //deber�amos buscar el usuario en la base de datos (proxima clase!!)  
        //Asi que crearemos 
        if(usuario.equals("admin") && pass.equals("1234") 
        		&& sesion.getAttribute("admin") == null)
        {
            //si coincide usuario y password y adem�s no hay sesi�n iniciada
            sesion.setAttribute("admin", usuario);
            //redirijo a p�gina con informaci�n de login exitoso
            response.sendRedirect("loginExito.jsp");
        }else{
            //l�gica para login inv�lido
        	//por ejemplo lo podemos redigir a una pagina jsp de error o como en este caso se imprime
        	
        	PrintWriter out = response.getWriter();
        	 out.println("<html>");
             out.println("<head></head>");         
             out.println("<body>");
             out.println("<h1>Usuario incorrecto!!!</h1>");
             out.println(usuario);
             out.println("</body>");
             out.println("</html>");  
        }
	}

}
