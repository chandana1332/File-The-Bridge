package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class intake5a_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <form action=\"intake5a\"\n");
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
      out.write("    </br>\n");
      out.write("    </br>\n");
      out.write("         <font face=\"Arial\" size=\"+2\">The Diagnosed Parenting Styles are-</font>\n");
      out.write("         </br>\n");
      out.write("</br>\n");
      out.write("\n");
  
String s1=(String)request.getAttribute("type1");
String s2=(String)request.getAttribute("type2");
             
      out.write("  \n");
      out.write("               \n");
      out.write("<input type=\"radio\" name=\"tiedParentingstyle\" value=\"");
      out.print(s1);
      out.write("\"> <font face=\"Arial\" size=\"+0.5\">");
      out.print(s1);
      out.write("</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"tiedParentingstyle\" value=\"");
      out.print(s2);
      out.write("\"> <font face=\"Arial\" size=\"+0.5\">");
      out.print(s2);
      out.write("</font>\n");
      out.write("</br>\n");
      out.write("    \n");
      out.write("</br>\n");
      out.write("</br>\n");

  String Parenting=(String)request.getAttribute("parenting");
  
      out.write("\n");
      out.write("  <input type=\"text\" name=\"parenting\" value=\"");
      out.print(Parenting);
      out.write("\"  style=\"visibility:hidden\">\n");
      out.write("  </br>\n");

  String name=(String)request.getAttribute("name");
  
      out.write("\n");
      out.write("  <input type=\"text\" name=\"name\" value=\"");
      out.print(name);
      out.write("\" style=\"visibility:hidden\"  >\n");
      out.write("  </br>\n");
      out.write("<input type=\"submit\" value=\"Apply\">\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write("<input type=\"reset\" value=\"Reset\">\n");
      out.write("    </div>\n");
      out.write("    <div id=\"footer\">&copy;2009 Green Day. All rights reserved. Based on a <a href=\"http://www.elemental-templates.com\" target=\"_blank\">free web template</a> by Elemental-Templates. Valid <a href=\"http://validator.w3.org/check?uri=referer\" target=\"_blank\">XHTML</a> &amp; <a href=\"http://jigsaw.w3.org/css-validator/check/referer\" target=\"_blank\">CSS</a>.</div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("</form>\n");
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
