<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Slablet</title>
<link href="global.css" rel="stylesheet" type="text/css" />
<link href="yellow.css" rel="stylesheet" type="text/css" />
</head>
<body>
    <form action="intake6a">
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
    </br>
   

<%  
String[] a=null;
String s1=(String)request.getAttribute("t1");

    %>
    <input type="radio" name="parentchild" value="<%=s1%>" > <font face="Arial" size="+0.5"><%=s1%></font>
</br>
<%

String s2=(String)request.getAttribute("t2");
 %>
    <input type="radio" name="parentchild" value="<%=s2%>"> <font face="Arial" size="+0.5"><%=s2%></font>
</br>
<%

String s3=(String)request.getAttribute("t3");
%>
    <input type="radio" name="parentchild" value="<%=s3%>"> <font face="Arial" size="+0.5"><%=s3%></font>
</br>
<%

String s4=(String)request.getAttribute("t4");
 %>
    <input type="radio" name="parentchild" value="<%=s4%>"> <font face="Arial" size="+0.5"><%=s4%></font>
</br>
</br>
</br>
</br>
<%
  String name=(String)request.getAttribute("name");
  %>
  <input type="text" name="name" value="<%=name%>" style="visibility:hidden" >
  </br>
<input type="submit" value="Apply">
</br>
</br> 
<input type="reset" value="Reset">
    </div>
    <div id="footer"></div>
  </div>
</div>
</form>
</body>
</html>
