package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class create_005fpost_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"resources/css/bootstrap.min.css\"/>\n");
      out.write("        <title>Creación de Post</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("\t\t<h1>Creación de Post</h1><br>\n");
      out.write("\n");
      out.write("                <form action=\"controller.ComentariosController\" method=\"POST\">\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"form-group row\">\n");
      out.write("\t\t      <label for=\"inputPassword3\" class=\"col-sm-2 col-form-label\">Título</label>\n");
      out.write("\t\t      <div class=\"col-sm-10\">\n");
      out.write("\t\t        <input type=\"text\" class=\"form-control\" placeholder=\"Escriba Título del post\" name=\"titulo\" required>\n");
      out.write("\t\t      </div>\n");
      out.write("\t\t    </div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"form-group row\">\n");
      out.write("\t\t      <label for=\"inputPassword3\" class=\"col-sm-2 col-form-label\">Cuerpo</label>\n");
      out.write("\t\t      <div class=\"col-sm-10\">\n");
      out.write("\t\t        <textarea class=\"form-control\" id=\"TextArea\" name=\"cuerpo\" placeholder=\"Escriba contenido del Post\" required=\"\"></textarea>\n");
      out.write("\t\t      </div>\n");
      out.write("\t\t    </div>\n");
      out.write("\n");
      out.write("\t\t    <div class=\"form-group row\">\n");
      out.write("\t\t      <div class=\"offset-sm-2 col-sm-10 \">\n");
      out.write("\t\t        <button type=\"submit\" class=\"btn btn-primary\" style=\"float: right;\">Crear Post</button>\n");
      out.write("\t\t      </div>\n");
      out.write("\t\t    </div>\n");
      out.write("\n");
      out.write("\t\t  </form>\n");
      out.write("\t</div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
