package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class activity_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("         <form action=\"activity\">\n");
      out.write("\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\n");
      out.write("<title>Green Day</title>\n");
      out.write("<link href=\"global.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link href=\"yellow.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write(" <script>\n");
      out.write("function myFunction1()\n");
      out.write("{\n");
      out.write("//document.write(\"Oops! The document disappeared!\");\n");
      out.write(" document.getElementById(\"B1\").style.visibility=\"visible\";\n");
      out.write("}\n");
      out.write("function myFunction2()\n");
      out.write("{\n");
      out.write("//document.write(\"Oops! The document disappeared!\");\n");
      out.write(" document.getElementById(\"B2\").style.visibility=\"visible\";\n");
      out.write("}\n");
      out.write("function myFunction3()\n");
      out.write("{\n");
      out.write("//document.write(\"Oops! The document disappeared!\");\n");
      out.write(" document.getElementById(\"B3\").style.visibility=\"visible\";\n");
      out.write("}\n");
      out.write("function myFunction4()\n");
      out.write("{\n");
      out.write("//document.write(\"Oops! The document disappeared!\");\n");
      out.write(" document.getElementById(\"B4\").style.visibility=\"visible\";\n");
      out.write("}\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("   \n");
      out.write("    \n");
      out.write("<div id=\"body\">\n");
      out.write("  <div id=\"top_bg\">\n");
      out.write("    <div id=\"top_nav\"><a href=\"#\">ABOUT</a> | <a href=\"#\">SITEMAP</a> | <a href=\"#\">CONTACT US</a></div>\n");
      out.write("    <div id=\"header\">Green Day</div>\n");
      out.write("    <div id=\"menu\">\n");
      out.write("      <ul>\n");
      out.write("         <li><a href=\"index.html\">HOME</a></li>\n");
      out.write("        <li><a href=\"login.jsp\">LOGIN</a></li>\n");
      out.write("        <li><a href=\"Registration.jsp\">REGISTRATION</a></li>\n");
      out.write("          <li><a href=\"about.jsp\">ABOUT</a></li>\n");
      out.write("       \n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"content_single\">\n");
      out.write("     \n");
      out.write("<input type=\"button\" onclick=\"myFunction1()\" value=\"FRAME DRAWING\">\n");
      out.write("\n");
      out.write("<div id=\"B1\" style=\"visibility: hidden\">\n");
      out.write("    <br/>\n");
      out.write("    <table>\n");
      out.write("        <tr>\n");
      out.write("            <td>DURATION</td>\n");
      out.write("            <td> <input type=\"text\" name=\"A1\" /></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>DESIGN CODE</td>\n");
      out.write("            <td><input type=\"text\" name=\"A2\" /></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>NUMBER OF DESIGNS DONE IN 10 MINUTES</td>\n");
      out.write("            <td> <input type=\"text\" name=\"A3\" /></td>\n");
      out.write("        </tr>\n");
      out.write("    </table>\n");
      out.write("    <br />\n");
      out.write("</div>\n");
      out.write("    \n");
      out.write("     \n");
      out.write("<input type=\"button\" onclick=\"myFunction2()\" value=\"LINE CANCELLATION\">\n");
      out.write("\n");
      out.write("<div id=\"B2\" style=\"visibility: hidden\">\n");
      out.write("   <br/>\n");
      out.write("    <table>\n");
      out.write("        <tr>\n");
      out.write("            <td>DURATION</td>\n");
      out.write("            <td> <input type=\"text\" name=\"B1\" /></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>NUMBER OF LINES CANCELLED</td>\n");
      out.write("            <td> <input type=\"text\" name=\"B2\" /></td>\n");
      out.write("        </tr>\n");
      out.write("    </table>\n");
      out.write("    <br />\n");
      out.write("  \n");
      out.write("</div>\n");
      out.write("    \n");
      out.write("     \n");
      out.write("<input type=\"button\" onclick=\"myFunction3()\" value=\"COLORING\">\n");
      out.write("\n");
      out.write("<div id=\"B3\" style=\"visibility: hidden\">\n");
      out.write("    <br/>\n");
      out.write("    <table>\n");
      out.write("        <tr>\n");
      out.write("            <td>DURATION</td>\n");
      out.write("            <td> <input type=\"text\" name=\"C1\" /></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>DESIGN CODE</td>\n");
      out.write("            <td><input type=\"text\" name=\"C2\" /></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>WHITE SPACES/OUT OF BOUNDARY COLORING</td>\n");
      out.write("            <td> <input type=\"text\" name=\"C3\" /></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>NUMBER OF COLORS USED</td>\n");
      out.write("            <td><input type=\"text\" name=\"C4\" /></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>AESTHETIC RATING BY CHILD</td>\n");
      out.write("            <td> <input type=\"text\" name=\"C5\" /></td>\n");
      out.write("        </tr>\n");
      out.write("    </table>\n");
      out.write("    <br />\n");
      out.write("    \n");
      out.write("    \n");
      out.write("</div>\n");
      out.write("    \n");
      out.write("       \n");
      out.write("<input type=\"button\" onclick=\"myFunction4()\" value=\"SORTING\">\n");
      out.write("<div id=\"B4\" style=\"visibility: hidden\">\n");
      out.write("    <br/>\n");
      out.write("\n");
      out.write("     <table>\n");
      out.write("        <tr>\n");
      out.write("            <td>DURATION</td>\n");
      out.write("            <td> <input type=\"text\" name=\"D1\" /></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>PULSE CODE</td>\n");
      out.write("            <td><input type=\"text\" name=\"D2\" /></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>NUMBER SORTED CORRECTLY</td>\n");
      out.write("            <td> <input type=\"text\" name=\"D3\" /></td>\n");
      out.write("        </tr>\n");
      out.write("       \n");
      out.write("    </table>\n");
      out.write("    <br/>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("                            \n");
      out.write("                                          ");
  
   String name=(String)request.getParameter("user");
   
      out.write("\n");
      out.write("    <input type=\"text\" name=\"name\" value=\"");
      out.print(name);
      out.write("\" style=\"visibility: hidden\" />\n");
      out.write("    <center>   <input type=\"submit\" value=\"Save\"/></center>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <div id=\"footer\">&copy;2009 Green Day. All rights reserved. Based on a <a href=\"http://www.elemental-templates.com\" target=\"_blank\">free web template</a> by Elemental-Templates. Valid <a href=\"http://validator.w3.org/check?uri=referer\" target=\"_blank\">XHTML</a> &amp; <a href=\"http://jigsaw.w3.org/css-validator/check/referer\" target=\"_blank\">CSS</a>.</div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("    </form>\n");
      out.write("</body>\n");
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
