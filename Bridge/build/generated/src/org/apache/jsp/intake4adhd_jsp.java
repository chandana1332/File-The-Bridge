package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class intake4adhd_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <form action=\"intake4adhd\">\n");
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
      out.write("                            </br>\n");
      out.write("                          </br>\n");
      out.write("                          (select all that apply)\n");
      out.write("    </br>\n");
      out.write("                          </br>\n");
      out.write("\n");
      out.write("<input type=\"checkbox\" name=\"adhd\" value=\"Doesnt stay seated\"> <font face=\"Arial\" size=\"+0.5\">Doesn't stay seated </font>\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write("<input type=\"checkbox\" name=\"adhd\" value=\"Runs or climbs excessively\"> <font face=\"Arial\" size=\"+0.5\">Runs or climbs excessively</font>\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write("<input type=\"checkbox\" name=\"adhd\" value=\"Often interrupts or intrudes on others\"> <font face=\"Arial\" size=\"+0.5\">Often interrupts or intrudes on others</font>\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write("<input type=\"checkbox\" name=\"adhd\" value=\"Often fails to give close attention to details or makes mistakes in schoolwork\"> <font face=\"Arial\" size=\"+0.5\">Often fails to give close attention to details or makes mistakes in schoolwork</font>\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write("<input type=\"checkbox\" name=\"adhd\" value=\"Difficulty sustaining attention in tasks\"> <font face=\"Arial\" size=\"+0.5\">Difficulty sustaining attention in tasks</font>\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write("<input type=\"checkbox\" name=\"adhd\" value=\"Seems not to listen\"> <font face=\"Arial\" size=\"+0.5\">Seems not to listen</font>\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write("<input type=\"checkbox\" name=\"adhd\" value=\"Fails to follow instructions or finish work\"> <font face=\"Arial\" size=\"+0.5\">Fails to follow instructions or finish work</font>\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write("<input type=\"checkbox\" name=\"adhd\" value=\"Unorganized\"> <font face=\"Arial\" size=\"+0.5\">Unorganized</font>\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write("<input type=\"checkbox\" name=\"adhd\" value=\"Difficulties with schoolwork or homework\"> <font face=\"Arial\" size=\"+0.5\">Difficulties with schoolwork or homework</font>\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write("<input type=\"checkbox\" name=\"adhd\" value=\"Loses things like school assignments, books, tools, etc\"> <font face=\"Arial\" size=\"+0.5\">Loses things like school assignments, books, tools, etc</font>\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write("<input type=\"checkbox\" name=\"adhd\" value=\"Easily distracted\"> <font face=\"Arial\" size=\"+0.5\">Easily distracted</font>\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write("<input type=\"checkbox\" name=\"adhd\" value=\"Forgetful about daily activities\"> <font face=\"Arial\" size=\"+0.5\">Forgetful about daily activities</font>\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write("<input type=\"checkbox\" name=\"adhd\" value=\"Fidgety in a squirmy sense\"> <font face=\"Arial\" size=\"+0.5\">Fidgety in a squirmy sense</font>\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write("<input type=\"checkbox\" name=\"adhd\" value=\"Feelings of restlessness in older children\"> <font face=\"Arial\" size=\"+0.5\">Feelings of restlessness in older children</font>\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write("<input type=\"checkbox\" name=\"adhd\" value=\"Difficulty playing quietly\"> <font face=\"Arial\" size=\"+0.5\">Difficulty playing quietly</font>\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write("<input type=\"checkbox\" name=\"adhd\" value=\"Often ON THE GO or acts if DRIVEN BY MOTOR\"> <font face=\"Arial\" size=\"+0.5\">Often \"on the go\" or acts if \"driven by a motor\"</font>\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write("<input type=\"checkbox\" name=\"adhd\" value=\"Often talks excessively\"> <font face=\"Arial\" size=\"+0.5\">Often talks excessively</font>\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write("<input type=\"checkbox\" name=\"adhd\" value=\"Blurts out answers to questions\"> <font face=\"Arial\" size=\"+0.5\">Blurts out answers to questions</font>\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write("<input type=\"checkbox\" name=\"adhd\" value=\"Difficulty waiting in lines or waiting turns\"> <font face=\"Arial\" size=\"+0.5\">Difficulty waiting in lines or waiting turns</font>\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write("<input type=\"checkbox\" name=\"adhd\" value=\"Often easily distracted by extraneous stimuli\"> <font face=\"Arial\" size=\"+0.5\">Often easily distracted by extraneous stimuli</font>\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write("<input type=\"checkbox\" name=\"adhd\" value=\"Often difficulty following through on instructions from others\"> <font face=\"Arial\" size=\"+0.5\">Often difficulty following through on instructions from others</font>\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write("<input type=\"checkbox\" name=\"adhd\" value=\"Difficulty sustaining attention\"> <font face=\"Arial\" size=\"+0.5\">Difficulty sustaining attention </font>\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write("<input type=\"checkbox\" name=\"adhd\" value=\"Often does not seem to listen to what is being said\"> <font face=\"Arial\" size=\"+0.5\">Often does not seem to listen to what is being said </font>\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write("<input type=\"checkbox\" name=\"adhd\" value=\"Tendency to lose things necessary for tasks or activities\"> <font face=\"Arial\" size=\"+0.5\">Tendency to lose things necessary for tasks or activities </font>\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write("<input type=\"checkbox\" name=\"adhd\" value=\"Difficulty organizing goal-directed activities\"> <font face=\"Arial\" size=\"+0.5\">Difficulty organizing goal-directed activities </font>\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write("<input type=\"checkbox\" name=\"adhd\" value=\"Often shifts from one uncompleted activity to another\"> <font face=\"Arial\" size=\"+0.5\">Often shifts from one uncompleted activity to another </font>\n");
      out.write("</br>\n");

  String name=(String)request.getAttribute("name");
  
      out.write("\n");
      out.write("  <input type=\"text\" name=\"name\" value=\"");
      out.print(name);
      out.write("\" style=\"visibility:hidden\">\n");
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
