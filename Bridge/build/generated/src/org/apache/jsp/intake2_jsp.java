package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class intake2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <form action=\"intake2\">\n");
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
      out.write("          <center>\n");
      out.write("                          <font face=\"Arial\" size=\"+3\">GENERAL DETAILS</font>\n");
      out.write("                          </center>\n");
      out.write("                          </br>\n");
      out.write("                          </br>\n");
      out.write("                          </br>\n");
      out.write("                          </br>\n");
      out.write("     <font face=\"Arial\" size=\"+1.5\">INFORMANT</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"checkbox\" name=\"Informant\" value=\"Mother\">  <font face=\"Arial\" size=\"+0.5\">Mother</font>\n");
      out.write("</br>                                      \n");
      out.write("<input type=\"checkbox\" name=\"Informant\" value=\"Father\">  <font face=\"Arial\" size=\"+0.5\">Father</font>                                      \n");
      out.write("</br>\n");
      out.write("<input type=\"checkbox\" name=\"Informant\" value=\"Teacher\">  <font face=\"Arial\" size=\"+0.5\">Teacher</font>                                      \n");
      out.write("</br>\n");
      out.write("<input type=\"checkbox\" name=\"Informant\" value=\"Other\">  <font face=\"Arial\" size=\"+0.5\">Other,Specify the Relationship</font> <input type=\"text\" name=\"otherInformant\">                                   \n");
      out.write("</br></br>\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write(" <font face=\"Arial\" size=\"+1.5\">REFERRED BY</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"checkbox\" name=\"Referred\" value=\"School\">  <font face=\"Arial\" size=\"+0.5\">School</font>\n");
      out.write("</br>                                      \n");
      out.write("<input type=\"checkbox\" name=\"Referred\" value=\"Neighbour\">  <font face=\"Arial\" size=\"+0.5\">Neighbour</font>                                      \n");
      out.write("</br>\n");
      out.write("<input type=\"checkbox\" name=\"Referred\" value=\"Local Medical Consultant\">  <font face=\"Arial\" size=\"+0.5\">Local Medical Consultant,Name of the doctor </font><input type=\"text\" name=\"NameofLocalConsultant\">                                      \n");
      out.write("</br>\n");
      out.write("<input type=\"checkbox\" name=\"Referred\" value=\"Self\">  <font face=\"Arial\" size=\"+0.5\">Self</font>                                \n");
      out.write("</br>\n");
      out.write("<input type=\"checkbox\" name=\"Referred\" value=\"Parent\">  <font face=\"Arial\" size=\"+0.5\">Parent</font>\n");
      out.write("</br>                                      \n");
      out.write("<input type=\"checkbox\" name=\"Referred\" value=\"Grandparent\">  <font face=\"Arial\" size=\"+0.5\">Grandparent</font>                                      \n");
      out.write("</br>\n");
      out.write("</br></br>\n");
      out.write("</br>\n");
      out.write(" <font face=\"Arial\" size=\"+1.5\">REASONS FOR REFERRAL</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"checkbox\" name=\"ReasonsReferred\" value=\"Poor academic performance\">  <font face=\"Arial\" size=\"+0.5\">Poor academic performance</font>\n");
      out.write("</br>                                      \n");
      out.write("<input type=\"checkbox\" name=\"ReasonsReferred\" value=\"Disturbs the class\">  <font face=\"Arial\" size=\"+0.5\">Disturbs the class</font>                                      \n");
      out.write("</br>\n");
      out.write("<input type=\"checkbox\" name=\"ReasonsReferred\" value=\"Does not complete homework\">  <font face=\"Arial\" size=\"+0.5\">Does not complete homework</font>                                      \n");
      out.write("</br>\n");
      out.write("<input type=\"checkbox\" name=\"ReasonsReferred\" value=\"Assessment for dyslexia\">  <font face=\"Arial\" size=\"+0.5\">Assessment for dyslexia</font>                                \n");
      out.write("</br>\n");
      out.write("<input type=\"checkbox\" name=\"ReasonsReferred\" value=\"Language exemption\">  <font face=\"Arial\" size=\"+0.5\">Language exemption</font>\n");
      out.write("</br>                                      \n");
      out.write("<input type=\"checkbox\" name=\"ReasonsReferred\" value=\"Change of school or stream for poor performance\">  <font face=\"Arial\" size=\"+0.5\">Change of school or stream for poor performance</font>                                      \n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write("</br></br>\n");
      out.write(" <font face=\"Arial\" size=\"+1.5\">ANY OTHER PROBLEMS OR CONSTRAINTS</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"checkbox\" name=\"Otherprobs\" value=\"Keeps running out of class\"> <font face=\"Arial\" size=\"+0.5\">Keeps running out of class</font>\n");
      out.write("</br>                                      \n");
      out.write("<input type=\"checkbox\" name=\"Otherprobs\" value=\"Irritates other students\">  <font face=\"Arial\" size=\"+0.5\">Irritates other students</font>                                      \n");
      out.write("</br>\n");
      out.write("<input type=\"checkbox\" name=\"Otherprobs\" value=\"Forgets everything soon\">  <font face=\"Arial\" size=\"+0.5\">Forgets everything soon </font>                                      \n");
      out.write("</br>\n");
      out.write("<input type=\"checkbox\" name=\"Otherprobs\" value=\"Makes lots of spelling mistakes\">  <font face=\"Arial\" size=\"+0.5\">Makes lots of spelling mistakes</font>                                \n");
      out.write("</br>\n");
      out.write("<input type=\"checkbox\" name=\"Otherprobs\" value=\"Comes shabbily to school\">  <font face=\"Arial\" size=\"+0.5\">Comes shabbily to school</font>                                                             \n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write("</br></br>\n");
      out.write(" <font face=\"Arial\" size=\"+1.5\">PARENTS DETAILS</font>\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write(" <font face=\"Arial\" size=\"+0.5\">FATHER'S NAME</font> <input type=\"text\" name=\"Fathersname\"></br>\n");
      out.write("</br>\n");
      out.write(" <font face=\"Arial\" size=\"+0.5\">OCCUPATION</font> <input type=\"text\" name=\"Foccupation\">\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write(" <font face=\"Arial\" size=\"+0.5\">EDUCATION</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"Feducation\" value=\"Below 10th\">  <font face=\"Arial\" size=\"+0.5\">Below 10th</font>\n");
      out.write("</br>                                      \n");
      out.write("<input type=\"radio\" name=\"Feducation\" value=\"10th Pass\">  <font face=\"Arial\" size=\"+0.5\">10th Pass</font>                                     \n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"Feducation\" value=\"12th Pass\">  <font face=\"Arial\" size=\"+0.5\">12th Pass</font>                                      \n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"Feducation\" value=\"Graduate\">  <font face=\"Arial\" size=\"+0.5\">Graduate</font>                                \n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"Feducation\" value=\"Postgraduate\">  <font face=\"Arial\" size=\"+0.5\">Postgraduate</font>  \n");
      out.write("</br>                                                                          \n");
      out.write("</br></br>\n");
      out.write("</br>\n");
      out.write(" <font face=\"Arial\" size=\"+0.5\">MOTHER'S NAME <input type=\"text\" name=\"Mothersname\"></br>\n");
      out.write("</br>\n");
      out.write("OCCUPATION <input type=\"text\" name=\"Moccupation\">\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write("EDUCATION</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"Meducation\" value=\"Below 10th\">  <font face=\"Arial\" size=\"+0.5\">Below 10th</font>\n");
      out.write("</br>                                      \n");
      out.write("<input type=\"radio\" name=\"Meducation\" value=\"10th Pass\"> <font face=\"Arial\" size=\"+0.5\">10th Pass</font>                                     \n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"Meducation\" value=\"12th Pass\">  <font face=\"Arial\" size=\"+0.5\">12th Pass</font>                                      \n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"Meducation\" value=\"Graduate\">  <font face=\"Arial\" size=\"+0.5\">Graduate</font>                                \n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"Meducation\" value=\"Postgraduate\">  <font face=\"Arial\" size=\"+0.5\">Postgraduate</font>  \n");
      out.write("</br>                                                                          \n");
      out.write("</br></br>\n");
      out.write("</br>\n");
      out.write(" <font face=\"Arial\" size=\"+1.5\">MAIN CARETAKER AT HOME</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"Caretaker\" value=\"Mother\">  <font face=\"Arial\" size=\"+0.5\">Mother</font>\n");
      out.write("</br>                                      \n");
      out.write("<input type=\"radio\" name=\"Caretaker\" value=\"Father\">  <font face=\"Arial\" size=\"+0.5\">Father</font>                                     \n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"Caretaker\" value=\"Grandparents\">  <font face=\"Arial\" size=\"+0.5\">Grandparents</font>                                      \n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"Caretaker\" value=\"Nana\">  <font face=\"Arial\" size=\"+0.5\">Nana</font>                                \n");
      out.write("</br>                               \n");
      out.write("</br>\n");

  String name=(String)request.getAttribute("name");
  
      out.write("\n");
      out.write("  <input type=\"text\" name=\"name\" value=\"");
      out.print(name);
      out.write("\" style=\"visibility:hidden\">\n");
      out.write("  </br>\n");
      out.write("</br></br>\n");
      out.write("<input type=\"submit\" value=\"Save\">\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write("<input type=\"reset\" value=\"Reset\">\n");
      out.write("\n");
      out.write("        \n");
      out.write("                                      \n");
      out.write("                                      \n");
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
