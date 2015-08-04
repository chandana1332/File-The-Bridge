<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Slablet</title>
<link href="global.css" rel="stylesheet" type="text/css" />
<link href="yellow.css" rel="stylesheet" type="text/css" />
</head>
<body>
    <form action="intake4dyscalculia">
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
        <font face="Arial" size="+2.5">DYSCALCULIA</font>
                            </br>
                          </br>
                          (select all that apply)
    </br>
                          </br>

<input type="checkbox" name="dyscalculia" value="Problem in differentiating between sizes, shapes and quantities"> <font face="Arial" size="+0.5">Problem in differentiating between sizes, shapes and quantities</font>
</br>
</br>
<input type="checkbox" name="dyscalculia" value="Inability to do counting"> <font face="Arial" size="+0.5">Inability to do counting</font>
</br>
</br>
<input type="checkbox" name="dyscalculia" value="Inability to understand place value"> <font face="Arial" size="+0.5">Inability to understand place value</font>
</br>
</br>
<input type="checkbox" name="dyscalculia" value="Difficulty with fundamental operations of addition, substraction, multiplication and division"> <font face="Arial" size="+0.5">Difficulty with fundamental operations of addition, substraction, multiplication and division</font>
</br>
</br>
<input type="checkbox" name="dyscalculia" value="No concept of fractions"> <font face="Arial" size="+0.5">No concept of fractions</font>
</br>
</br>
<input type="checkbox" name="dyscalculia" value="Difficulty in telling time"> <font face="Arial" size="+0.5">Difficulty in telling time</font>
</br>
</br>
<input type="checkbox" name="dyscalculia" value="No problem solving skills"> <font face="Arial" size="+0.5">No problem solving skills</font>
</br>
</br>

<%
  String name=(String)request.getAttribute("name");
  %>
  <input type="text" name="name" value="<%=name%>" style="visibility:hidden">
  </br>
</br>
</br>

<input type="submit" value="Save">
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
