<%-- 
    Document   : act
    Created on : Mar 14, 2014, 6:39:23 PM
    Author     : sony
--%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@page contentType="text/html" pageEncoding="UTF-8"
        import="java.io.*"
        import="java.sql.*"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Green Day</title>
<link href="global.css" rel="stylesheet" type="text/css" />
<link href="yellow.css" rel="stylesheet" type="text/css" />
</head>
<body>
                <form action="activitydyscalculia">

<div id="body">
  <div id="top_bg">
    <div id="header">FILE</div>
    <div id="menu">
       <ul>
        <li><a href="login.jsp">LOGIN</a></li>
        <li><a href="intake1.jsp">INTAKE</a></li>
        <li><a href="Registration.jsp">REGISTRATION</a></li>
          <li><a href="about.jsp">ABOUT</a></li>
       
      </ul>
    </div>
    <div id="content_single">
       <input type="text" name="n"/>NAME
        <br/>
        <br/>PARAMETERS NAMES:
        <input type="text" name="P1"/>
        <br/>
        <br/>
        <input type="text" name="P2"/>
        <br/>
        <br/>
        <input type="text" name="P3"/>
        <br/>
        <br/>
        <input type="text" name="P4"/>
        <br/>
        <br/>
         <input type="text" name="P5"/>
        <br/>
        <br/>
        <input type="text" name="P6"/>
        <br/>
        <br/>
                 <%  String name=request.getParameter("user");
           
      System.out.println(name);
   %>
       <input type="text" name="name" value="<%=name%>"  />
        <input type="submit" value="SAVE"/>
 
    <div id="footer"></div>
  </div>
</div>
</div>            </form>    
</body>
</html>
