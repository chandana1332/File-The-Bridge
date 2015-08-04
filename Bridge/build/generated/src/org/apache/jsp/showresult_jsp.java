package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.sql.*;

public final class showresult_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\n");
      out.write("<title>Green Day</title>\n");
      out.write("<link href=\"global.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link href=\"yellow.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("</head>\n");
      out.write("      \n");
      out.write("<body>\n");
      out.write("<div id=\"body\">\n");
      out.write("  <div id=\"top_bg\">\n");
      out.write("    <div id=\"top_nav\"><a href=\"#\">ABOUT</a> | <a href=\"#\">SITEMAP</a> | <a href=\"#\">CONTACT US</a></div>\n");
      out.write("    <div id=\"header\">Green Day</div>\n");
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
      out.write("                     <center>\n");
      out.write("                                                <font size=\"+2.0\">SUGGESTIONS</font>\n");
      out.write("                                                <br/>\n");
      out.write("                                                <br/>\n");
      out.write("                                                <br/>\n");
      out.write("\n");
      out.write("    \n");
      out.write("        <table cellpadding=\"5\" cellspacing=\"5\" border=\"1\">\n");
      out.write("            <tr>\n");
      out.write("                <th>NAME</th>\n");
      out.write("                <th>DOB</th>\n");
      out.write("                <th>SEX</th>\n");
      out.write("                <th>AGE GROUP</th>\n");
      out.write("                <th>ADHD</th>\n");
      out.write("                <th>SHOW DETAILS</th>\n");
      out.write("                <th>SELECT</th>\n");
      out.write("            </tr>\n");
      out.write("              ");
  String s1,s2,s3,s4,s5;
    Statement stmt=null;
    int i=1;
       s1=request.getParameter("name");
Class.forName("com.mysql.jdbc.Driver");
//P.println("driver loaded");
        Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bridge","root","root");
stmt=con.createStatement();
ResultSet rs=null;
String q="select NAME,DOB,SEX,AGEGROUP ,ADHD from generaldetails where NAME LIKE '"+s1+"%';";
                rs=stmt.executeQuery(q);
               while(rs.next())
                    {
                            s1=rs.getString(1);
                              s2=rs.getString(2);
                                s3=rs.getString(3);
                                  s4=rs.getString(4);
                                    s5=rs.getString(5);
                                                                                                                                       
             
      out.write("  \n");
      out.write("               \n");
      out.write("    <tr>\n");
      out.write("        <td>");
      out.print(s1);
      out.write("</td>\n");
      out.write("         <td>");
      out.print(s2);
      out.write("</td>\n");
      out.write("          <td>");
      out.print(s3);
      out.write("</td>\n");
      out.write("           <td>");
      out.print(s4);
      out.write("</td>\n");
      out.write("              <td>");
      out.print(s5);
      out.write("</td>\n");
      out.write("              \n");
      out.write("        \n");
      out.write("<td><a href=\"showdetails2.jsp?user=");
      out.print(s1);
      out.write("\">SHOW DETAILS</a></td>\n");
      out.write("<td><a href=\"select?user=");
      out.print(s1);
      out.write("\">SELECT</a></td>\n");
      out.write("     \n");
      out.write("    </tr>\n");
      out.write("            \n");
      out.write("    ");

       }
                             
               
      out.write("\n");
      out.write("               \n");
      out.write("               \n");
      out.write("               \n");
      out.write("                  </table>\n");
      out.write("                                            </center>\n");
      out.write("               \n");
      out.write("    </div>\n");
      out.write("    <div id=\"footer\">&copy;2009 Green Day. All rights reserved. Based on a <a href=\"http://www.elemental-templates.com\" target=\"_blank\">free web template</a> by Elemental-Templates. Valid <a href=\"http://validator.w3.org/check?uri=referer\" target=\"_blank\">XHTML</a> &amp; <a href=\"http://jigsaw.w3.org/css-validator/check/referer\" target=\"_blank\">CSS</a>.</div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
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
