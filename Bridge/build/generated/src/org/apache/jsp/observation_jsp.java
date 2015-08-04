package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class observation_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("     <form action=\"observation\">\n");
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
      out.write("function myFunction5()\n");
      out.write("{\n");
      out.write("//document.write(\"Oops! The document disappeared!\");\n");
      out.write(" document.getElementById(\"B5\").style.visibility=\"visible\";\n");
      out.write("}\n");
      out.write("function myFunction6()\n");
      out.write("{\n");
      out.write("//document.write(\"Oops! The document disappeared!\");\n");
      out.write(" document.getElementById(\"B6\").style.visibility=\"visible\";\n");
      out.write("}\n");
      out.write("function myFunction7()\n");
      out.write("{\n");
      out.write("//document.write(\"Oops! The document disappeared!\");\n");
      out.write(" document.getElementById(\"B7\").style.visibility=\"visible\";\n");
      out.write("}\n");
      out.write("function myFunction8()\n");
      out.write("{\n");
      out.write("//document.write(\"Oops! The document disappeared!\");\n");
      out.write(" document.getElementById(\"B8\").style.visibility=\"visible\";\n");
      out.write("}\n");
      out.write("function myFunction9()\n");
      out.write("{\n");
      out.write("//document.write(\"Oops! The document disappeared!\");\n");
      out.write(" document.getElementById(\"B9\").style.visibility=\"visible\";\n");
      out.write("}\n");
      out.write("function myFunction10()\n");
      out.write("{\n");
      out.write("//document.write(\"Oops! The document disappeared!\");\n");
      out.write(" document.getElementById(\"B10\").style.visibility=\"visible\";\n");
      out.write("}\n");
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
      out.write("        <li><a href=\"index.html\">Home</a></li>\n");
      out.write("        <li><a href=\"demo.html\">Demo page</a></li>\n");
      out.write("        <li><a href=\"single.html\">Single column</a></li>\n");
      out.write("        <li><span class=\"pressed\">Blank page</span></li>\n");
      out.write("        <li><a href=\"#\">Page five</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"content_single\">\n");
      out.write("     \n");
      out.write("<input type=\"button\" onclick=\"myFunction1()\" value=\"WHILE WRITING NAMES\">\n");
      out.write("\n");
      out.write("<div id=\"B1\" style=\"visibility: hidden\">\n");
      out.write("    <br/>\n");
      out.write("   \n");
      out.write("   <input type=\"radio\" name=\"B1\" value=\"GOOD\"/><img src=\"GOOD.png\">\n");
      out.write("       <input type=\"radio\" name=\"B1\" value=\"MEDIOCRE\"/><img src=\"MED.png\">\n");
      out.write("           <input type=\"radio\" name=\"B1\" value=\"BAD\"/> <img src=\"BAD.png\"><br/>\n");
      out.write("               <br/>\n");
      out.write("               <textarea rows=\"8\" cols=\"33\" name=\"T1\"></textarea>\n");
      out.write("               <br/>\n");
      out.write("               <br/>\n");
      out.write("</div>\n");
      out.write("    \n");
      out.write("     \n");
      out.write("<input type=\"button\" onclick=\"myFunction2()\" value=\"WHILE DOING LINE CANCELLATIONS\">\n");
      out.write("\n");
      out.write("<div id=\"B2\" style=\"visibility: hidden\">\n");
      out.write("    <br/>\n");
      out.write("   <input type=\"radio\" name=\"B2\" value=\"GOOD\"/><img src=\"GOOD.png\">\n");
      out.write("       <input type=\"radio\" name=\"B2\" value=\"MEDIOCRE\"/><img src=\"MED.png\">\n");
      out.write("           <input type=\"radio\" name=\"B2\" value=\"BAD\"/> <img src=\"BAD.png\"><br/>\n");
      out.write("                <br/>\n");
      out.write("               <textarea rows=\"8\" cols=\"33\" name=\"T2\"></textarea>\n");
      out.write("               <br/>\n");
      out.write("               <br/>\n");
      out.write("</div>\n");
      out.write("    \n");
      out.write("     \n");
      out.write("<input type=\"button\" onclick=\"myFunction3()\" value=\"WHILE WRITING\">\n");
      out.write("\n");
      out.write("<div id=\"B3\" style=\"visibility: hidden\">\n");
      out.write("    <br/>\n");
      out.write("   <input type=\"radio\" name=\"B3\" value=\"GOOD\"/><img src=\"GOOD.png\">\n");
      out.write("       <input type=\"radio\" name=\"B3\" value=\"MEDIOCRE\"/><img src=\"MED.png\">\n");
      out.write("           <input type=\"radio\" name=\"B3\" value=\"BAD\"/> <img src=\"BAD.png\"><br/>\n");
      out.write("                <br/>\n");
      out.write("               <textarea rows=\"8\" cols=\"33\" name=\"T3\"></textarea>\n");
      out.write("               <br/>\n");
      out.write("               <br/>\n");
      out.write("</div>\n");
      out.write("    \n");
      out.write("       \n");
      out.write("<input type=\"button\" onclick=\"myFunction4()\" value=\"NUMBER OF TIMES THE CHILD ASKED FOR REPEATING THE WORDS DURING DICTATION\">\n");
      out.write("\n");
      out.write("<div id=\"B4\" style=\"visibility: hidden\">\n");
      out.write("    <br/>\n");
      out.write("<input type=\"radio\" name=\"B4\" value=\"GOOD\"/><img src=\"GOOD.png\">\n");
      out.write("    <input type=\"radio\" name=\"B4\" value=\"MEDIOCRE\"/><img src=\"MED.png\">\n");
      out.write("        <input type=\"radio\" name=\"B4\" value=\"BAD\"/> <img src=\"BAD.png\"><br/>\n");
      out.write("             <br/>\n");
      out.write("               <textarea rows=\"8\" cols=\"33\" name=\"T4\"></textarea>\n");
      out.write("               <br/>\n");
      out.write("               <br/>\n");
      out.write("</div>\n");
      out.write("    \n");
      out.write("    <input type=\"button\" onclick=\"myFunction5()\" value=\"MAKES ATTEMPT TO LOOK AROUND FOR QUESTION NO.4\">\n");
      out.write("\n");
      out.write("<div id=\"B5\" style=\"visibility: hidden\">\n");
      out.write("<br/>\n");
      out.write("<input type=\"radio\" name=\"B5\" value=\"GOOD\"/><img src=\"GOOD.png\">\n");
      out.write("    <input type=\"radio\" name=\"B5\" value=\"MEDIOCRE\"/><img src=\"MED.png\">\n");
      out.write("        <input type=\"radio\" name=\"B5\" value=\"BAD\"/> <img src=\"BAD.png\"><br/>\n");
      out.write("             <br/>\n");
      out.write("               <textarea rows=\"8\" cols=\"33\" name=\"T5\"></textarea>\n");
      out.write("               <br/>\n");
      out.write("               <br/>\n");
      out.write("</div>\n");
      out.write("        \n");
      out.write("        <input type=\"button\" onclick=\"myFunction6()\" value=\"ASKS FOR HELP WHILE READING\">\n");
      out.write("\n");
      out.write("<div id=\"B6\" style=\"visibility: hidden\">\n");
      out.write("    <br/>\n");
      out.write("   <input type=\"radio\" name=\"B6\" value=\"GOOD\"/><img src=\"GOOD.png\">\n");
      out.write("       <input type=\"radio\" name=\"B6\" value=\"MEDIOCRE\"/><img src=\"MED.png\">\n");
      out.write("           <input type=\"radio\" name=\"B6\" value=\"BAD\"/> <img src=\"BAD.png\"><br/>\n");
      out.write("                <br/>\n");
      out.write("               <textarea rows=\"8\" cols=\"33\" name=\"T6\"></textarea>\n");
      out.write("               <br/>\n");
      out.write("               <br/>\n");
      out.write("</div>\n");
      out.write("            \n");
      out.write("            <input type=\"button\" onclick=\"myFunction7()\" value=\"ASKS FOR HELP WHILE WRITING\">\n");
      out.write("\n");
      out.write("<div id=\"B7\" style=\"visibility: hidden\">\n");
      out.write("    <br/>\n");
      out.write("   <input type=\"radio\" name=\"B7\" value=\"GOOD\"/><img src=\"GOOD.png\">\n");
      out.write("       <input type=\"radio\" name=\"B7\" value=\"MEDIOCRE\"/><img src=\"MED.png\">\n");
      out.write("           <input type=\"radio\" name=\"B7\" value=\"BAD\"/> <img src=\"BAD.png\"><br/>\n");
      out.write("                <br/>\n");
      out.write("               <textarea rows=\"8\" cols=\"33\" name=\"T7\"></textarea>\n");
      out.write("               <br/>\n");
      out.write("               <br/>\n");
      out.write("</div>\n");
      out.write("                \n");
      out.write("                <input type=\"button\" onclick=\"myFunction8()\" value=\"DISTRACTED DURING THE TEST\">\n");
      out.write("\n");
      out.write("<div id=\"B8\" style=\"visibility: hidden\">\n");
      out.write("    <br/>\n");
      out.write("  <br/>\n");
      out.write("   <input type=\"radio\" name=\"B8\" value=\"GOOD\"/><img src=\"GOOD.png\">\n");
      out.write("       <input type=\"radio\" name=\"B8\" value=\"MEDIOCRE\"/><img src=\"MED.png\">\n");
      out.write("           <input type=\"radio\" name=\"B8\" value=\"BAD\"/> <img src=\"BAD.png\"><br/>\n");
      out.write("                <br/>\n");
      out.write("               <textarea rows=\"8\" cols=\"33\" name=\"T8\"></textarea>\n");
      out.write("               <br/>\n");
      out.write("               <br/></div>\n");
      out.write("                    \n");
      out.write("                    <input type=\"button\" onclick=\"myFunction9()\" value=\"SCRIBBLE WHILE WRITING THE TEST\">\n");
      out.write("\n");
      out.write("<div id=\"B9\" style=\"visibility: hidden\">\n");
      out.write("  <br/>\n");
      out.write("   <input type=\"radio\" name=\"B9\" value=\"GOOD\"/><img src=\"GOOD.png\">\n");
      out.write("       <input type=\"radio\" name=\"B9\" value=\"MEDIOCRE\"/><img src=\"MED.png\">\n");
      out.write("           <input type=\"radio\" name=\"B9\" value=\"BAD\"/> <img src=\"BAD.png\"><br/>\n");
      out.write("                <br/>\n");
      out.write("               <textarea rows=\"8\" cols=\"33\" name=\"T9\"></textarea>\n");
      out.write("               <br/>\n");
      out.write("               <br/></div>\n");
      out.write("                        \n");
      out.write("                           \n");
      out.write("                    <input type=\"button\" onclick=\"myFunction10()\" value=\"ERASE NUMBER OF TIMES\">\n");
      out.write("\n");
      out.write("<div id=\"B10\" style=\"visibility: hidden\">\n");
      out.write("  <br/>\n");
      out.write("   <input type=\"radio\" name=\"B10\" value=\"GOOD\"/><img src=\"GOOD.png\">\n");
      out.write("       <input type=\"radio\" name=\"B10\" value=\"MEDIOCRE\"/><img src=\"MED.png\">\n");
      out.write("           <input type=\"radio\" name=\"B10\" value=\"BAD\"/> <img src=\"BAD.png\"><br/>\n");
      out.write("                <br/>\n");
      out.write("               <textarea rows=\"8\" cols=\"33\" name=\"T10\"></textarea>\n");
      out.write("               <br/>\n");
      out.write("               <br/></div>\n");
      out.write("                            \n");
      out.write("                                          ");
  
   String name=(String)request.getParameter("user");
   
      out.write("\n");
      out.write("    <input type=\"text\" name=\"name\" value=\"");
      out.print(name);
      out.write("\"  />\n");
      out.write("    </div>\n");
      out.write("    <div id=\"footer\">&copy;2009 Green Day. All rights reserved. Based on a <a href=\"http://www.elemental-templates.com\" target=\"_blank\">free web template</a> by Elemental-Templates. Valid <a href=\"http://validator.w3.org/check?uri=referer\" target=\"_blank\">XHTML</a> &amp; <a href=\"http://jigsaw.w3.org/css-validator/check/referer\" target=\"_blank\">CSS</a>.</div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("    <input type=\"submit\" value=\"Save\"/>\n");
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
