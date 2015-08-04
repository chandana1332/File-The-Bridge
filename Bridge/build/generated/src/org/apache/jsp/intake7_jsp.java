package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class intake7_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <form action=\"intake7\">\n");
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
      out.write("       </br> <font face=\"Arial\" size=\"+1.5\">PARENTAL HEALTH PROBLEMS</font>\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write("  \n");
      out.write("<input type=\"radio\" name=\"healthprob\" value=\"Healthy\"> <font face=\"Arial\" size=\"+0.5\">Healthy</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"healthprob\" value=\"Unhealthy\"> <font face=\"Arial\" size=\"+0.5\">Unhealthy</font>\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write("(If Unhealthy, Select all that apply)\n");
      out.write("</br>\n");
      out.write("<input type=\"checkbox\" name=\"prob\" value=\"Diabetes\"> <font face=\"Arial\" size=\"+0.5\">Diabetes</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"checkbox\" name=\"prob\" value=\"Blood Pressure\"> <font face=\"Arial\" size=\"+0.5\">Blood Pressure</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"checkbox\" name=\"prob\" value=\"Jaundice\"> <font face=\"Arial\" size=\"+0.5\">Jaundice</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"checkbox\" name=\"prob\" value=\"Alcoholism\"> <font face=\"Arial\" size=\"+0.5\">Alcoholism</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"checkbox\" name=\"prob\" value=\"Smoking\"> <font face=\"Arial\" size=\"+0.5\">Smoking</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"checkbox\" name=\"prob\" value=\"Paan/Gutka chewing\"> <font face=\"Arial\" size=\"+0.5\">Paan/Gutka chewing</font>\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write("  </br> <font face=\"Arial\" size=\"+1.5\">PARENTAL MENTAL ILLNESS</font>\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write("<input type=\"checkbox\" name=\"mentalill\" value=\"Alcoholism\"> <font face=\"Arial\" size=\"+0.5\">Alcoholism</font>\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write("<input type=\"checkbox\" name=\"mentalill\" value=\"Depression\"> <font face=\"Arial\" size=\"+0.5\">Depression</font>\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write("<input type=\"checkbox\" name=\"mentalill\" value=\"Epilepsy\"> <font face=\"Arial\" size=\"+0.5\">Epilepsy</font>\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write("<input type=\"checkbox\" name=\"mentalill\" value=\"Mental Retardation\"> <font face=\"Arial\" size=\"+0.5\">Mental Retardation</font>\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write(" <font face=\"Arial\" size=\"+1.5\">PARENTAL CRIMINALITY</font> (Max 50 characters) </br>\n");
      out.write("</br>\n");
      out.write("    <textarea name=\"criminality\" rows=\"7\" cols=\"20\" onkeyup=\"if (this.value.length >50) { alert('Character limit has been reached!'); this.value = this.value.substr(0,50); }\" ></textarea>\n");
      out.write("\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write("</br> <font face=\"Arial\" size=\"+1.5\">FAMILY STRENGTHS</font>\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write("<input type=\"checkbox\" name=\"famstrength\" value=\"One parent gainfully employed or having family business\"> <font face=\"Arial\" size=\"+0.5\">One parent gainfully employed or having family business</font>\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write("<input type=\"checkbox\" name=\"famstrength\" value=\"Caring family\"> <font face=\"Arial\" size=\"+0.5\">Caring family</font>\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write("<input type=\"checkbox\" name=\"famstrength\" value=\"Willing to support the child?s condition\"> <font face=\"Arial\" size=\"+0.5\">Willing to support the child?s condition</font>\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write("<input type=\"checkbox\" name=\"famstrength\" value=\"Caring siblings\"> <font face=\"Arial\" size=\"+0.5\">Caring siblings</font>\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write("<input type=\"checkbox\" name=\"famstrength\" value=\"Support from extended family for any challenge or crisis\"> <font face=\"Arial\" size=\"+0.5\">Support from extended family for any challenge or crisis</font>\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write("<input type=\"checkbox\" name=\"famstrength\" value=\"Acceptance of the child?s condition in the larger family\"> <font face=\"Arial\" size=\"+0.5\">Acceptance of the child?s condition in the larger family</font>\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write("<input type=\"checkbox\" name=\"famstrength\" value=\"Family bilingual or multilingual\"> <font face=\"Arial\" size=\"+0.5\">Family bilingual or multilingual</font>\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write("<input type=\"checkbox\" name=\"famstrength\" value=\"Family resourceful\"> <font face=\"Arial\" size=\"+0.5\">Family resourceful</font>\n");
      out.write("</br>\n");
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
