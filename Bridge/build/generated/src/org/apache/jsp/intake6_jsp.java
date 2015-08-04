package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class intake6_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\n");
      out.write("<title>Slablet</title>\n");
      out.write("<link href=\"global.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link href=\"yellow.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <form action=\"intake6\">\n");
      out.write("<div id=\"body\">\n");
      out.write("  <div id=\"top_bg\">\n");
      out.write("    <div id=\"top_nav\"><a href=\"#\">ABOUT</a> | <a href=\"#\">SITEMAP</a> | <a href=\"#\">CONTACT US</a></div>\n");
      out.write("    <div id=\"header\">Slablet</div>\n");
      out.write("    <div id=\"menu\">\n");
      out.write("      <ul>\n");
      out.write("        <li><a href=\"index.html\">Home</a></li>\n");
      out.write("        <li><a href=\"demo.html\">Demo page</a></li>\n");
      out.write("        <li><a href=\"single.html\">Single column</a></li>\n");
      out.write("        <li><span class=\"pressed\">Blank page</span></li>\n");
      out.write("        <li><a href=\"#\">Page five</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"content_single\">\n");
      out.write("    </br> <font face=\"Arial\" size=\"+1.5\">PARENT CHILD RELATIONSHIP</font>\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write("                          </br>\n");
      out.write("                          (select all that apply)\n");
      out.write("    </br>\n");
      out.write("                          </br>\n");
      out.write("\n");
      out.write("<input type=\"checkbox\" name=\"sym\" value=\"1\"> <font face=\"Arial\" size=\"+0.5\">1.Love is expressed?</font>\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write("<input type=\"checkbox\" name=\"sym\" value=\"3\"> <font face=\"Arial\" size=\"+0.5\">2.Not aware of child needs?</font>\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write("<input type=\"checkbox\" name=\"sym\" value=\"4\"> <font face=\"Arial\" size=\"+0.5\">3.Fights between parents?</font>\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write("<input type=\"checkbox\" name=\"sym\" value=\"1\"> <font face=\"Arial\" size=\"+0.5\">4.New opportunities are created for learning?</font>\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write("<input type=\"checkbox\" name=\"sym\" value=\"2\"> <font face=\"Arial\" size=\"+0.5\">5.Scolding in public places using slang language?</font>\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write("<input type=\"checkbox\" name=\"sym\" value=\"4\"> <font face=\"Arial\" size=\"+0.5\">6.Physically punishing the child, where punishment is disproportionate to child?s mistakes?</font>\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write("<input type=\"checkbox\" name=\"sym\" value=\"1\"> <font face=\"Arial\" size=\"+0.5\">7.Childs basic needs are taken care of?</font>\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write("<input type=\"checkbox\" name=\"sym\" value=\"3\"> <font face=\"Arial\" size=\"+0.5\">8.Parent not available at home when child comes back from school?</font>\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write("<input type=\"checkbox\" name=\"sym\" value=\"2\"> <font face=\"Arial\" size=\"+0.5\">9.Using slang words?</font>\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write("<input type=\"checkbox\" name=\"sym\" value=\"3\"> <font face=\"Arial\" size=\"+0.5\">10.Not providing basic material for child growth?</font>\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write("<input type=\"checkbox\" name=\"sym\" value=\"1\"> <font face=\"Arial\" size=\"+0.5\">11.Allowed to explore various things for learning?</font>\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write("<input type=\"checkbox\" name=\"sym\" value=\"2\"> <font face=\"Arial\" size=\"+0.5\">12.Repeatedly passing comments on any task that child does?</font>\n");
      out.write("</br>\n");

  String name=(String)request.getAttribute("name");
  
      out.write("\n");
      out.write("  <input type=\"text\" name=\"name\" value=\"");
      out.print(name);
      out.write("\" style=\"visibility:hidden\" >\n");
      out.write("  </br>\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write("\n");
      out.write("<input type=\"submit\" value=\"Save\">\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write("<input type=\"reset\" value=\"Reset\">\n");
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
