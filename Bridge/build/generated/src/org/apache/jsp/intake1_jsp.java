package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class intake1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>FILE</title>\n");
      out.write("<link href=\"global.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link href=\"yellow.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <form action=\"intake1\">\n");
      out.write("<div id=\"body\">\n");
      out.write("  <div id=\"top_bg\">\n");
      out.write("    <div id=\"top_nav\"><a href=\"#\">ABOUT</a> | <a href=\"#\">SITEMAP</a> | <a href=\"#\">CONTACT US</a></div>\n");
      out.write("    <div id=\"header\">FILE</div>\n");
      out.write("    <div id=\"menu\">\n");
      out.write("      <ul>\n");
      out.write("        <li><a href=\"index.html\">HOME</a></li>\n");
      out.write("        <li><a href=\"login.jsp\">LOGIN</a></li>\n");
      out.write("        <li><a href=\"Registration.jsp\">REGISTRATION</a></li>\n");
      out.write("          <li><a href=\"about.jsp\">ABOUT</a></li>\n");
      out.write("       \n");
      out.write("        \n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"content_single\">\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                          <center>\n");
      out.write("                          <font face=\"Arial\" size=\"+3\">GENERAL DETAILS</font>\n");
      out.write("                          </center>\n");
      out.write("                          </br>\n");
      out.write("                          </br>\n");
      out.write("                          </br>\n");
      out.write("                          </br>\n");
      out.write("                           <font face=\"Arial\" size=\"+1.5\">NAME</font> <input type=\"text\" name=\"Name\">\n");
      out.write("                              </br>\n");
      out.write("                              </br>\n");
      out.write("                           </br>\n");
      out.write("                             <font face=\"Arial\" size=\"+1.5\">DATE OF BIRTH</font> <input type=\"date\" name=\"Dob\"></br>\n");
      out.write("                             </br>   \n");
      out.write("                             </br>\n");
      out.write("                                   <font face=\"Arial\" size=\"+1.5\">SEX</font> \n");
      out.write("                             </br><input type=\"radio\" name=\"Sex\" value=\"Male\"> <font face=\"Arial\" size=\"+0.5\"> Male</font>\n");
      out.write("                                   </br>\n");
      out.write("                                   \n");
      out.write("                                      <input type=\"radio\" name=\"Sex\" value=\"Female\">  <font face=\"Arial\" size=\"+0.5\">Female</font>\n");
      out.write("                                      </br>\n");
      out.write("</br>\n");
      out.write("\n");
      out.write("                                      </br>\n");
      out.write("                                       <font face=\"Arial\" size=\"+1.5\">AGE GROUP</font> \n");
      out.write("                             </br><input type=\"radio\" name=\"Agegroup\" value=\"3-6\"> <font face=\"Arial\" size=\"+0.5\"> Early childhood(3-6 yrs)</font>\n");
      out.write("                                   </br>\n");
      out.write("                                   \n");
      out.write("                                      <input type=\"radio\" name=\"Agegroup\" value=\"6-10\">  <font face=\"Arial\" size=\"+0.5\">Childhood(6-10 yrs)</font>\n");
      out.write("                                      </br>\n");
      out.write(" <input type=\"radio\" name=\"Agegroup\" value=\"10-13\">  <font face=\"Arial\" size=\"+0.5\">Early Adolscenece(10-13 yrs)</font>\n");
      out.write("                                      </br>\n");
      out.write(" <input type=\"radio\" name=\"Agegroup\" value=\"13-18\">  <font face=\"Arial\" size=\"+0.5\">Adolscence(13-18 yrs)</font>\n");
      out.write("                                      </br>\n");
      out.write("                                      </br>\n");
      out.write(" </br>\n");
      out.write(" <font face=\"Arial\" size=\"+1.5\">ADDRESS</font> (Max 120 characters) </br>\n");
      out.write("    <textarea name=\"Address\" rows=\"7\" cols=\"20\" onkeyup=\"if (this.value.length >120) { alert('Character limit has been reached!'); this.value = this.value.substr(0,120); }\" ></textarea>\n");
      out.write("\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write("                                      </br>\n");
      out.write(" <font face=\"Arial\" size=\"+1.5\">PHONE</font> \n");
      out.write("</br>\n");
      out.write("                                      </br>\n");
      out.write("<div align=\"left\">\n");
      out.write("    <table>\n");
      out.write("        <tr>    \n");
      out.write("            <td> <font face=\"Arial\" size=\"+0.5\">RESIDENCE</font></td>\n");
      out.write("            <td><input type=\"number\" name=\"Residence\" size=\"10\"></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td> <font face=\"Arial\" size=\"+0.5\">OFFICE</font></td>\n");
      out.write("            <td><input type=\"number\" name=\"Office\" size=\"10\"></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td> <font face=\"Arial\" size=\"+0.5\">MOBILE</font></td>\n");
      out.write("            <td><input type=\"number\" name=\"Mobile\" size=\"10\"></td>\n");
      out.write("            </tr>\n");
      out.write("    </table>\n");
      out.write("            </br>\n");
      out.write("</br>\n");
      out.write("</br></br>\n");
      out.write(" <font face=\"Arial\" size=\"+1.5\">BOARD</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"Board\" value=\"State\"> <font face=\"Arial\" size=\"+0.5\">State</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"Board\" value=\"CBSE\"> <font face=\"Arial\" size=\"+0.5\">CBSE </font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"Board\" value=\"ICSE\">  <font face=\"Arial\" size=\"+0.5\">ICSE</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"Board\" value=\"Other\">  <font face=\"Arial\" size=\"+0.5\">Other</font>\n");
      out.write("</br>           \n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write(" <font face=\"Arial\" size=\"+1.5\">MEDIUM OF EDUCATION</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"Medium\" value=\"Kannada\">  <font face=\"Arial\" size=\"+0.5\">Kannada</font>\n");
      out.write("</br>                                      \n");
      out.write("<input type=\"radio\" name=\"Medium\" value=\"English\">  <font face=\"Arial\" size=\"+0.5\">English</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"Medium\" value=\"Hindi\">  <font face=\"Arial\" size=\"+0.5\">Hindi</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"Medium\" value=\"Urdu\">  <font face=\"Arial\" size=\"+0.5\">Urdu</font>\n");
      out.write("</br>           \n");
      out.write("<input type=\"radio\" name=\"Medium\" value=\"Other\">  <font face=\"Arial\" size=\"+0.5\">Other</font>\n");
      out.write("</br></br>\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write(" <font face=\"Arial\" size=\"+1.5\">INCOME OF PARENTS</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"Income\" value=\"less than 2lakh\">  <font face=\"Arial\" size=\"+0.5\">less than 2lakh</font>                                      \n");
      out.write("</br>                                      \n");
      out.write("<input type=\"radio\" name=\"Income\" value=\"2-5lakh\">  <font face=\"Arial\" size=\"+0.5\">2-5lakh</font>                                     \n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"Income\" value=\"5-8lakh\">  <font face=\"Arial\" size=\"+0.5\">5-8lakh</font>                                      \n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"Income\" value=\"More than 8lakh\">  <font face=\"Arial\" size=\"+0.5\">More than 8lakh</font>                                   \n");
      out.write("</br></br>\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write(" <font face=\"Arial\" size=\"+1.5\">PAST ACADEMIC RECORD</font>\n");
      out.write("</br>\n");
      out.write("<div align=\"left\">\n");
      out.write("<table>\n");
      out.write("<tr>\n");
      out.write("<th> <font face=\"Arial\" size=\"+0.5\">Subject</font></th>\n");
      out.write("<th> <font face=\"Arial\" size=\"+0.5\">Marks or % in last sem</font></th>\n");
      out.write("</tr>\n");
      out.write("    <tr>\n");
      out.write("<td> <font face=\"Arial\" size=\"+0.5\">Maths</font></td>\n");
      out.write("<td><input type=\"number\" name=\"Maths\"></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("<td> <font face=\"Arial\" size=\"+0.5\">Social</font></td>\n");
      out.write("<td><input type=\"number\" name=\"Social\"></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("<td> <font face=\"Arial\" size=\"+0.5\">Science</font></td>\n");
      out.write("<td><input type=\"number\" name=\"Science\"></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("<td> <font face=\"Arial\" size=\"+0.5\">First Language</font></td>\n");
      out.write("<td><input type=\"text\" name=\"First Language\"></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("<td> <font face=\"Arial\" size=\"+0.5\">Second Language</font></td>\n");
      out.write("<td><input type=\"text\" name=\"Second Language\"></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("<td> <font face=\"Arial\" size=\"+0.5\">Third Language</font></td>\n");
      out.write("<td><input type=\"text\" name=\"Third Language\"></td>\n");
      out.write("    </tr>\n");
      out.write("</table>\n");
      out.write("</div>\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write(" \n");
      out.write("<input type=\"submit\" value=\"Save\">\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write("<input type=\"reset\" value=\"Reset\">\n");
      out.write("   \n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write("                                      \n");
      out.write("</td>\n");
      out.write("                \n");
      out.write("                <td>\n");
      out.write("                    NOTES\n");
      out.write("                    <textarea rows=\"17\" cols=\"17\" name=\"notes\"></textarea>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
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
