package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class intake3_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <form action=\"intake3\">\n");
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
      out.write("<center>\n");
      out.write("                          <font face=\"Arial\" size=\"+3\">PERSONAL DETAILS</font>\n");
      out.write("                          </center>\n");
      out.write("\t\t\t\t<div id=\"content\">\n");
      out.write("\t\t\t\t\t<div><div><div><div class=\"inner\">\n");
      out.write("                                                        </br>\n");
      out.write("                          </br>\n");
      out.write("                          </br>\n");
      out.write("                          </br>\n");
      out.write(" <font face=\"Arial\" size=\"+1.5\">TYPE OF DELIVERY\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"typeofdelivery\" value=\"Normal\">  <font face=\"Arial\" size=\"+0.5\">Normal</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"typeofdelivery\" value=\"Caesarian\">  <font face=\"Arial\" size=\"+0.5\">Caesarian</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"typeofdelivery\" value=\"Instrumental\">  <font face=\"Arial\" size=\"+0.5\">Instrumental</font>\n");
      out.write("</br></br>\n");
      out.write("</br>\n");
      out.write(" <font face=\"Arial\" size=\"+1.5\">BIRTH ASPHYXIA</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"BirthAsphyxia\" value=\"Yes\">  <font face=\"Arial\" size=\"+0.5\">Yes</font>\n");
      out.write("</br>                                      \n");
      out.write("<input type=\"radio\" name=\"BirthAsphyxia\" value=\"No\">  <font face=\"Arial\" size=\"+0.5\">No</font>\n");
      out.write("</br>\n");
      out.write("</br></br>\n");
      out.write(" <font face=\"Arial\" size=\"+1.5\">EARLY DEVELOPMENT</font>\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write(" <font face=\"Arial\" size=\"+1.5\">1. WHAT AGE DID THE CHILD HOLD NECK?</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"Ageholdneck\" value=\"2months\">  <font face=\"Arial\" size=\"+0.5\">2 months</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"Ageholdneck\" value=\"3months\"> <font face=\"Arial\" size=\"+0.5\">3 months</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"Ageholdneck\" value=\"4month\">  <font face=\"Arial\" size=\"+0.5\">4 months</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"Ageholdneck\" value=\"5months\"> <font face=\"Arial\" size=\"+0.5\">5 months</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"Ageholdneck\" value=\"6months\">  <font face=\"Arial\" size=\"+0.5\">6 months</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"Ageholdneck\" value=\"7month\">  <font face=\"Arial\" size=\"+0.5\">7 months</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"Ageholdneck\" value=\"8months\"> <font face=\"Arial\" size=\"+0.5\">8 months</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"Ageholdneck\" value=\"9months\">  <font face=\"Arial\" size=\"+0.5\">9 months</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"Ageholdneck\" value=\"10month\">  <font face=\"Arial\" size=\"+0.5\">10 months</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"Ageholdneck\" value=\"11months\"> <font face=\"Arial\" size=\"+0.5\">11 months</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"Ageholdneck\" value=\"12months\"> <font face=\"Arial\" size=\"+0.5\">12 months</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"Ageholdneck\" value=\"13months\"> <font face=\"Arial\" size=\"+0.5\">13 months</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"Ageholdneck\" value=\"14months\"> <font face=\"Arial\" size=\"+0.5\">14 months</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"Ageholdneck\" value=\"15months\"> <font face=\"Arial\" size=\"+0.5\">15 months</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"Ageholdneck\" value=\"16month\"> <font face=\"Arial\" size=\"+0.5\">16 months</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"Ageholdneck\" value=\"17months\"> <font face=\"Arial\" size=\"+0.5\">17 months</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"Ageholdneck\" value=\"18months\"> <font face=\"Arial\" size=\"+0.5\">18 months</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"Ageholdneck\" value=\"more than 18months\"> <font face=\"Arial\" size=\"+0.5\">More Than 18 Months</font>\n");
      out.write("</br>\n");
      out.write("</br></br></br>\n");
      out.write("<font face=\"Arial\" size=\"+1.5\">2. WHAT AGE DID THE CHILD SIT WITH SUPPORT?</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"agesitsupport\" value=\"2months\"> <font face=\"Arial\" size=\"+0.5\">2 months</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"agesitsupport\" value=\"3months\"> <font face=\"Arial\" size=\"+0.5\">3 months</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"agesitsupport\" value=\"4month\"> <font face=\"Arial\" size=\"+0.5\">4 months</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"agesitsupport\" value=\"5months\"> <font face=\"Arial\" size=\"+0.5\">5 months</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"agesitsupport\" value=\"6months\"> <font face=\"Arial\" size=\"+0.5\">6 months</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"agesitsupport\" value=\"7month\"> <font face=\"Arial\" size=\"+0.5\">7 months</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"agesitsupport\" value=\"8months\"> <font face=\"Arial\" size=\"+0.5\">8 months</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"agesitsupport\" value=\"9months\"> <font face=\"Arial\" size=\"+0.5\">9 months</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"agesitsupport\" value=\"10month\"> <font face=\"Arial\" size=\"+0.5\">10 months</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"agesitsupport\" value=\"11months\"> <font face=\"Arial\" size=\"+0.5\">11 months</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"agesitsupport\" value=\"12months\"> <font face=\"Arial\" size=\"+0.5\">12 months</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"agesitsupport\" value=\"13months\"> <font face=\"Arial\" size=\"+0.5\">13 months</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"agesitsupport\" value=\"14months\"> <font face=\"Arial\" size=\"+0.5\">14 months</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"agesitsupport\" value=\"15months\"> <font face=\"Arial\" size=\"+0.5\">15 months</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"agesitsupport\" value=\"16month\"> <font face=\"Arial\" size=\"+0.5\">16 months</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"agesitsupport\" value=\"17months\"> <font face=\"Arial\" size=\"+0.5\">17 months</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"agesitsupport\" value=\"18months\"> <font face=\"Arial\" size=\"+0.5\">18 months</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"agesitsupport\" value=\"more than 18months\"> <font face=\"Arial\" size=\"+0.5\">More Than 18 Months</font>\n");
      out.write("</br>\n");
      out.write("</br></br></br>\n");
      out.write("<font face=\"Arial\" size=\"+1.5\">3. WHAT AGE DID THE CHILD WALK WITH SUPPORT?</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"agewalksupport\" value=\"2months\"> <font face=\"Arial\" size=\"+0.5\">2 months</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"agewalksupport\" value=\"3months\"> <font face=\"Arial\" size=\"+0.5\">3 months</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"agewalksupport\" value=\"4month\"> <font face=\"Arial\" size=\"+0.5\">4 months</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"agewalksupport\" value=\"5months\"> <font face=\"Arial\" size=\"+0.5\">5 months</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"agewalksupport\" value=\"6months\"> <font face=\"Arial\" size=\"+0.5\">6 months</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"agewalksupport\" value=\"7month\"> <font face=\"Arial\" size=\"+0.5\">7 months</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"agewalksupport\" value=\"8months\"> <font face=\"Arial\" size=\"+0.5\">8 months</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"agewalksupport\" value=\"9months\"> <font face=\"Arial\" size=\"+0.5\">9 months</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"agewalksupport\" value=\"10month\"> <font face=\"Arial\" size=\"+0.5\">10 months</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"agewalksupport\" value=\"11months\"> <font face=\"Arial\" size=\"+0.5\">11 months</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"agewalksupport\" value=\"12months\"> <font face=\"Arial\" size=\"+0.5\">12 months</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"agewalksupport\" value=\"13months\"> <font face=\"Arial\" size=\"+0.5\">13 months</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"agewalksupport\" value=\"14months\"> <font face=\"Arial\" size=\"+0.5\">14 months</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"agewalksupport\" value=\"15months\"> <font face=\"Arial\" size=\"+0.5\">15 months</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"agewalksupport\" value=\"16month\"> <font face=\"Arial\" size=\"+0.5\">16 months</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"agewalksupport\" value=\"17months\"> <font face=\"Arial\" size=\"+0.5\">17 months</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"agewalksupport\" value=\"18months\"> <font face=\"Arial\" size=\"+0.5\">18 months</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"agewalksupport\" value=\"more than 18months\"> <font face=\"Arial\" size=\"+0.5\">More Than 18 Months</font>\n");
      out.write("</br>\n");
      out.write("</br></br></br>\n");
      out.write("<font face=\"Arial\" size=\"+1.5\">4. WHAT AGE DID THE CHILD UTTER THE FIRST WORDS?</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"agefirstwords\" value=\"2months\"> <font face=\"Arial\" size=\"+0.5\">2 months</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"agefirstwords\" value=\"3months\"> <font face=\"Arial\" size=\"+0.5\">3 months</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"agefirstwords\" value=\"4month\"> <font face=\"Arial\" size=\"+0.5\">4 months</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"agefirstwords\" value=\"5months\"> <font face=\"Arial\" size=\"+0.5\">5 months</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"agefirstwords\" value=\"6months\"> <font face=\"Arial\" size=\"+0.5\">6 months</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"agefirstwords\" value=\"7month\"> <font face=\"Arial\" size=\"+0.5\">7 months</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"agefirstwords\" value=\"8months\"> <font face=\"Arial\" size=\"+0.5\">8 months</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"agefirstwords\" value=\"9months\"> <font face=\"Arial\" size=\"+0.5\">9 months</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"agefirstwords\" value=\"10month\"> <font face=\"Arial\" size=\"+0.5\">10 months</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"agefirstwords\" value=\"11months\"> <font face=\"Arial\" size=\"+0.5\">11 months</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"agefirstwords\" value=\"12months\"> <font face=\"Arial\" size=\"+0.5\">12 months</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"agefirstwords\" value=\"13months\"> <font face=\"Arial\" size=\"+0.5\">13 months</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"agefirstwords\" value=\"14months\"> <font face=\"Arial\" size=\"+0.5\">14 months</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"agefirstwords\" value=\"15months\"> <font face=\"Arial\" size=\"+0.5\">15 months</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"agefirstwords\" value=\"16month\"> <font face=\"Arial\" size=\"+0.5\">16 months</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"agefirstwords\" value=\"17months\"> <font face=\"Arial\" size=\"+0.5\">17 months</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"agefirstwords\" value=\"18months\"> <font face=\"Arial\" size=\"+0.5\">18 months</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"agefirstwords\" value=\"more than 18months\"> <font face=\"Arial\" size=\"+0.5\">More Than 18 Months</font>\n");
      out.write("</br>\n");
      out.write("</br></br></br>\n");
      out.write("<font face=\"Arial\" size=\"+1.5\">5.COMPARED TO OTHER CHILDREN OF YOUR CHILD'S AGE, DO YOU THINK YOUR CHILD'S GROWTH WAS SLOW OR USUAL?</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"growth\" value=\"Normal\"> <font face=\"Arial\" size=\"+0.5\">Normal</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"growth\" value=\"Delayed\"> <font face=\"Arial\" size=\"+0.5\">Delayed</font>\n");
      out.write("</br>\n");
      out.write("</br></br></br>\n");
      out.write("<font face=\"Arial\" size=\"+1.5\">NEUROTIC SYMPTOMS IN CHILDHOOD</font> \n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"Neuroticsymptoms\" value=\"Night terrors\"> <font face=\"Arial\" size=\"+0.5\">Night Terrors</font>\n");
      out.write("</br>                                      \n");
      out.write("<input type=\"radio\" name=\"Neuroticsymptoms\" value=\"Temper Tantrums\"> <font face=\"Arial\" size=\"+0.5\">Temper Tantrums</font>                                      \n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"Neuroticsymptoms\" value=\"Somnambulism\"> <font face=\"Arial\" size=\"+0.5\">Somnambulism</font>                                       \n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"Neuroticsymptoms\" value=\"Enuresis\"> <font face=\"Arial\" size=\"+0.5\">Enuresis</font>                                 \n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"Neuroticsymptoms\" value=\"Nail Biting\"> <font face=\"Arial\" size=\"+0.5\">Nail Biting</font>\n");
      out.write("</br>                                      \n");
      out.write("<input type=\"radio\" name=\"Neuroticsymptoms\" value=\"Food Fads\"><font face=\"Arial\" size=\"+0.5\">Food Fads</font>                                      \n");
      out.write("</br>\n");
      out.write("</br></br></br>\n");
      out.write("<font face=\"Arial\" size=\"+1.5\">ANY PHYSICAL ILLNESS DURING CHILDHOOD</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"illnesschildhood\" value=\"High fever\"> <font face=\"Arial\" size=\"+0.5\">High Fever</font>\n");
      out.write("</br>                                      \n");
      out.write("<input type=\"radio\" name=\"illnesschildhood\" value=\"Fall from height and was unconscious\"> <font face=\"Arial\" size=\"+0.5\">Fall From Height And Was Unconcious</font>                                     \n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"illnesschildhood\" value=\"Severe diarrhea and was admitted into hospital\"> <font face=\"Arial\" size=\"+0.5\">Severe Diarrhea</font> And Was Admitted Into Hospital                                      \n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"illnesschildhood\" value=\"Juvenile diabetes\"> <font face=\"Arial\" size=\"+0.5\">Juvenile Diabetes</font>                                \n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"illnesschildhood\" value=\"Asthma\"> <font face=\"Arial\" size=\"+0.5\">Asthma</font>                                                             \n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"illnesschildhood\" value=\"Coughing bouts\"> <font face=\"Arial\" size=\"+0.5\">Coughing bouts</font>                                     \n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"illnesschildhood\" value=\"Kidney failure\"> <font face=\"Arial\" size=\"+0.5\">Kidney failure</font>                                      \n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"illnesschildhood\" value=\"Cancer\"> <font face=\"Arial\" size=\"+0.5\">Cancer</font>                             \n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"illnesschildhood\" value=\"High fever with seizures\"> <font face=\"Arial\" size=\"+0.5\">High fever with seizures</font>                                                          \n");
      out.write("</br>\n");
      out.write("</br></br></br>\n");
      out.write("<font face=\"Arial\" size=\"+1.5\">ANY EFFECT OF ILLNESS ON DEVELOPMENT?</font> \n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"effectdevelopment\" value=\"Delayed development\"> <font face=\"Arial\" size=\"+0.5\">Delayed Development</font>\n");
      out.write("</br>                                      \n");
      out.write("<input type=\"radio\" name=\"effectdevelopment\" value=\"Long absences from school\"> <font face=\"Arial\" size=\"+0.5\">Long Absences From School</font>                                      \n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"effectdevelopment\" value=\"Unable to appear for exams\"> <font face=\"Arial\" size=\"+0.5\">Unable To Appear For Exams</font>                                       \n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"effectdevelopment\" value=\"Promoted based on past performance\"> <font face=\"Arial\" size=\"+0.5\">Promoted Based On Past Performance</font>                                 \n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"effectdevelopment\" value=\"Home schooling\"> <font face=\"Arial\" size=\"+0.5\">Home Schooling</font>\n");
      out.write("</br>                                      \n");
      out.write("</br>\n");
      out.write("</br></br>\n");
      out.write("<font face=\"Arial\" size=\"+1.5\">TYPE OF SPONTANEOUS GAMES DURING CHILDHOOD</font>\n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"gameschildhood\" value=\"Playing with any material available around \"> <font face=\"Arial\" size=\"+0.5\">Playing With Any Material Available Around</font>\n");
      out.write("</br>                                      \n");
      out.write("<input type=\"radio\" name=\"gameschildhood\" value=\"Creating characters in air and playing with them\"> <font face=\"Arial\" size=\"+0.5\">Creating Characters In Air And Playing With Them</font>                                     \n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"gameschildhood\" value=\"Teacher ?teacher\"> <font face=\"Arial\" size=\"+0.5\">Teacher-Teacher</font>                                       \n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"gameschildhood\" value=\"Imitating actors\"> <font face=\"Arial\" size=\"+0.5\">Imitating Actors</font>                               \n");
      out.write("</br>\n");
      out.write("<input type=\"radio\" name=\"gameschildhood\" value=\"Imitating stunt sequences from TV serials or movies\"> <font face=\"Arial\" size=\"+0.5\">Imitating Stunt Sequences From Tv Serials Or Movies</font>\n");
      out.write("</br>  \n");
      out.write("<input type=\"radio\" name=\"gameschildhood\" value=\"Playing with wheat dough/ sand/ mud/ clay\"> <font face=\"Arial\" size=\"+0.5\">Playing With Wheat Dough/Sand/Mud/Clay</font>\n");
      out.write("</br>\n");
      out.write("</br>\n");

  String name=(String)request.getAttribute("name");
  
      out.write("\n");
      out.write("  <input type=\"text\" name=\"name\" value=\"");
      out.print(name);
      out.write("\" style=\"visibility:hidden\">\n");
      out.write("  </br>\n");
      out.write("</br>\n");
      out.write("<input type=\"submit\" value=\"Save\">\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write("<input type=\"reset\" value=\"Reset\">\n");
      out.write("\n");
      out.write("        \n");
      out.write("                                      \n");
      out.write("                                      \n");
      out.write("                                      \n");
      out.write("                                      \n");
      out.write("                                          </div>\n");
      out.write("    <div id=\"footer\">&copy;2009 Green Day. All rights reserved. Based on a <a href=\"http://www.elemental-templates.com\" target=\"_blank\">free web template</a> by Elemental-Templates. Valid <a href=\"http://validator.w3.org/check?uri=referer\" target=\"_blank\">XHTML</a> &amp; <a href=\"http://jigsaw.w3.org/css-validator/check/referer\" target=\"_blank\">CSS</a>.</div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("  </form>\n");
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
