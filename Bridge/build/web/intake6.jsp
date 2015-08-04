<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Slablet</title>
<link href="global.css" rel="stylesheet" type="text/css" />
<link href="yellow.css" rel="stylesheet" type="text/css" />
</head>
<body>
    <form action="intake6">
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
    </br> <font face="Arial" size="+1.5">PARENT CHILD RELATIONSHIP</font>
</br>
</br>
                          </br>
                          (select all that apply)
    </br>
                          </br>

<input type="checkbox" name="sym" value="1"> <font face="Arial" size="+0.5">1.Love is expressed?</font>
</br>
</br>
<input type="checkbox" name="sym" value="3"> <font face="Arial" size="+0.5">2.Not aware of child needs?</font>
</br>
</br>
<input type="checkbox" name="sym" value="4"> <font face="Arial" size="+0.5">3.Fights between parents?</font>
</br>
</br>
<input type="checkbox" name="sym" value="1"> <font face="Arial" size="+0.5">4.New opportunities are created for learning?</font>
</br>
</br>
<input type="checkbox" name="sym" value="2"> <font face="Arial" size="+0.5">5.Scolding in public places using slang language?</font>
</br>
</br>
<input type="checkbox" name="sym" value="4"> <font face="Arial" size="+0.5">6.Physically punishing the child, where punishment is disproportionate to child?s mistakes?</font>
</br>
</br>
<input type="checkbox" name="sym" value="1"> <font face="Arial" size="+0.5">7.Childs basic needs are taken care of?</font>
</br>
</br>
<input type="checkbox" name="sym" value="3"> <font face="Arial" size="+0.5">8.Parent not available at home when child comes back from school?</font>
</br>
</br>
<input type="checkbox" name="sym" value="2"> <font face="Arial" size="+0.5">9.Using slang words?</font>
</br>
</br>
<input type="checkbox" name="sym" value="3"> <font face="Arial" size="+0.5">10.Not providing basic material for child growth?</font>
</br>
</br>
<input type="checkbox" name="sym" value="1"> <font face="Arial" size="+0.5">11.Allowed to explore various things for learning?</font>
</br>
</br>
<input type="checkbox" name="sym" value="2"> <font face="Arial" size="+0.5">12.Repeatedly passing comments on any task that child does?</font>
</br>
<%
  String name=(String)request.getAttribute("name");
  %>
  <input type="text" name="name" value="<%=name%>" style="visibility:hidden" >
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
