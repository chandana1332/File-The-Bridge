package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Registration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Green Day</title>\n");
      out.write("<link href=\"global.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link href=\"yellow.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <form action=\"Registration\">\n");
      out.write("<div id=\"body\">\n");
      out.write("  <div id=\"top_bg\">\n");
      out.write("    <div id=\"top_nav\"><a href=\"#\">ABOUT</a> | <a href=\"#\">SITEMAP</a> | <a href=\"#\">CONTACT US</a></div>\n");
      out.write("    <div id=\"header\">Green Day</div>\n");
      out.write("    <div id=\"menu\">\n");
      out.write("      <ul>\n");
      out.write("        <li><a href=\"index.html\">Home</a></li>\n");
      out.write("        <li><a href=\"login.jsp\">Login</a></li>\n");
      out.write("        <li><span class=\"pressed\">Registration</span></li>\n");
      out.write("        <li><a href=\"intake1.jsp\">Blank page</a></li>\n");
      out.write("        <li><a href=\"#\">Page five</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"content_single\">\n");
      out.write("        <br/>\n");
      out.write("        <br/>\n");
      out.write("     \t\t <center>\n");
      out.write("                          <font face=\"Arial\" size=\"+3\">REGISTRATION</font>\n");
      out.write("                          </center>\n");
      out.write("                                             </br>\n");
      out.write("                                        </br>\n");
      out.write("                                        </br>\n");
      out.write("                                        \n");
      out.write("                                    \n");
      out.write("\n");
      out.write("    <table>\n");
      out.write("        <tr>    \n");
      out.write("            <td> <font face=\"Arial\" size=\"+1.5\">NAME</font><br/><br/></td>\n");
      out.write("            <td><input type=\"text\" name=\"Name\"/><br/><br/></td>\n");
      out.write("        </tr>\n");
      out.write("       \n");
      out.write("         <tr>\n");
      out.write("            <td> <font face=\"Arial\" size=\"+1.5\">SEX</font></td>\n");
      out.write("            <td><input type=\"radio\" name=\"Sex\" value=\"Male\"> <font face=\"Arial\" size=\"+0.5\"> Male</font></td>\n");
      out.write("         </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td></td><td><input type=\"radio\" name=\"Sex\" value=\"Female\"> <font face=\"Arial\" size=\"+0.5\"> Female</font></td>\n");
      out.write("         </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td> <font face=\"Arial\" size=\"+1.5\">QUALIFICATION</font><br/><br/></td>\n");
      out.write("            <td><input type=\"text\" name=\"Qualification\"><br/><br/></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td> <font face=\"Arial\" size=\"+1.5\">AREA OF SPECIALIZATION</font><br/><br/></td>\n");
      out.write("            <td><input type=\"text\" name=\"AOS\" /><br/><br/></td>\n");
      out.write("            </tr>\n");
      out.write("          <tr>\n");
      out.write("            <td> <font face=\"Arial\" size=\"+1.5\">ADDRESS</font><br/>(Max 120 characters)<br/><br/></td>\n");
      out.write("            <td><textarea name=\"Address\" rows=\"7\" cols=\"20\" onkeyup=\"if (this.value.length >120) { alert('Character limit has been reached!'); this.value = this.value.substr(0,120); }\" ></textarea>\n");
      out.write("<br/><br/></td>\n");
      out.write("            </tr>\n");
      out.write("         <tr>\n");
      out.write("            <td> <font face=\"Arial\" size=\"+1.5\">CONTACT DETAILS</font></td>\n");
      out.write("            <td> <font face=\"Arial\" size=\"+0.5\">PHONE   </font><input type=\"text\" name=\"Mobile\"></td>\n");
      out.write("         </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td></td><td><font face=\"Arial\" size=\"+0.5\">EMAIL   </font><input type=\"text\" name=\"Email\"> </td>\n");
      out.write("         </tr>\n");
      out.write("        <tr>\n");
      out.write("         <tr>\n");
      out.write("            <td> <font face=\"Arial\" size=\"+1.5\">WHY I CHOSE PSYCHOLOGY?</font><br/>(Max 200 characters)<br/><br/></td>\n");
      out.write("            <td><textarea name=\"Why_Psychology\" rows=\"10\" cols=\"30\" onkeyup=\"if (this.value.length >200) { alert('Character limit has been reached!'); this.value = this.value.substr(0,120); }\" ></textarea>\n");
      out.write("<br/><br/></td>\n");
      out.write("            </tr>\n");
      out.write("         <tr>\n");
      out.write("            <td> <font face=\"Arial\" size=\"+1.5\">WHAT IS IT THAT I WANT TO DO AS A PSYCHOLOGIST?</font><br/>(Max 200 characters)<br/><br/></td>\n");
      out.write("            <td><textarea name=\"WANT_TO_DO_AS_Psy\" rows=\"10\" cols=\"30\" onkeyup=\"if (this.value.length >200) { alert('Character limit has been reached!'); this.value = this.value.substr(0,120); }\" ></textarea>\n");
      out.write("<br/><br/></td>\n");
      out.write("            </tr>\n");
      out.write("           <tr>\n");
      out.write("            <td> <font face=\"Arial\" size=\"+1.5\">MY PHILOSOPHY OF INTERVENTION</font><br/>(Max 200 characters)<br/><br/></td>\n");
      out.write("            <td><textarea name=\"Intervention\" rows=\"10\" cols=\"30\" onkeyup=\"if (this.value.length >200) { alert('Character limit has been reached!'); this.value = this.value.substr(0,120); }\" ></textarea>\n");
      out.write("<br/><br/></td>\n");
      out.write("            </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td> <font face=\"Arial\" size=\"+1.5\">EXPERIENCE</font></td>\n");
      out.write("            <td><input type=\"checkbox\" name=\"Exp\" value=\"Self-brief of work\"> <font face=\"Arial\" size=\"+0.5\">Self-brief of work</font></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td></td>\n");
      out.write("            <td><input type=\"checkbox\" name=\"Exp\" value=\"Projects\"> <font face=\"Arial\" size=\"+0.5\">Projects</font></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>\n");
      out.write("            </td>\n");
      out.write("<td><input type=\"checkbox\" name=\"Exp\" value=\"Assignments done\"> <font face=\"Arial\" size=\"+0.5\">Assignments done</font></td>\n");
      out.write("         </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td> <font face=\"Arial\" size=\"+1.5\">TRAINING AND WORKSHOPS ATTENDED</font><br/>(Max 200 characters)<br/><br/></td>\n");
      out.write("            <td><textarea name=\"Training\" rows=\"10\" cols=\"30\" onkeyup=\"if (this.value.length >200) { alert('Character limit has been reached!'); this.value = this.value.substr(0,120); }\" ></textarea>\n");
      out.write("<br/><br/></td>\n");
      out.write("            </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td> <font face=\"Arial\" size=\"+1.5\">MENTION IF NEED FOR FURTHER TRAINING</font><br/>(Max 200 characters)<br/><br/></td>\n");
      out.write("            <td><textarea name=\"Further_Training\" rows=\"10\" cols=\"30\" onkeyup=\"if (this.value.length >200) { alert('Character limit has been reached!'); this.value = this.value.substr(0,120); }\" ></textarea>\n");
      out.write("<br/><br/></td>\n");
      out.write("            </tr>\n");
      out.write("         <tr>\n");
      out.write("            <td> <font face=\"Arial\" size=\"+1.5\">AREAS OF INTEREST TO WORK</font></td>\n");
      out.write("            <td><input type=\"checkbox\" name=\"Interest\" value=\"Child\"> <font face=\"Arial\" size=\"+0.5\">Child</font></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td></td>\n");
      out.write("            <td><input type=\"checkbox\" name=\"Interest\" value=\"Adolescent\"> <font face=\"Arial\" size=\"+0.5\">Adolescent</font></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>\n");
      out.write("            </td>\n");
      out.write("<td><input type=\"checkbox\" name=\"Interest\" value=\"Adult\"> <font face=\"Arial\" size=\"+0.5\">Adult</font></td>\n");
      out.write("         </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>\n");
      out.write("            </td>\n");
      out.write("<td><input type=\"checkbox\" name=\"Interest\" value=\"Marital\"> <font face=\"Arial\" size=\"+0.5\">Marital</font></td>\n");
      out.write("         </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>\n");
      out.write("            </td>\n");
      out.write("<td><input type=\"checkbox\" name=\"Interest\" value=\"Disability\"> <font face=\"Arial\" size=\"+0.5\">Disability</font></td>\n");
      out.write("         </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>\n");
      out.write("            </td>\n");
      out.write("<td><input type=\"checkbox\" name=\"Interest\" value=\"De-addiction\"> <font face=\"Arial\" size=\"+0.5\">De-addiction</font></td>\n");
      out.write("         </tr>\n");
      out.write(" <tr>\n");
      out.write("            <td>\n");
      out.write("            </td>\n");
      out.write("<td><input type=\"checkbox\" name=\"Interest\" value=\"Other\"> <font face=\"Arial\" size=\"+0.5\">If any other, specify</font><input type=\"text\" name=\"Other1\"></td>\n");
      out.write("         </tr>\n");
      out.write("                \n");
      out.write("    </table>\n");
      out.write("                                        <center>\n");
      out.write("</br>\n");
      out.write("                                        <input type=\"submit\" value=\"REGISTER\">\n");
      out.write("</br>\n");
      out.write("<input type=\"reset\" value=\"RESET\">\n");
      out.write("    </center>\n");
      out.write("</br>\n");
      out.write("    \n");
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
