<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Slablet</title>
<link href="global.css" rel="stylesheet" type="text/css" />
<link href="yellow.css" rel="stylesheet" type="text/css" />
</head>
<body>
    <form action="intake8">
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
        <center></br>
                          <font face="Arial" size="+2.5">ADHD REFLECTIVE QUESTIONS</font>
                          </center><br></br>
    </br>
      <font face="Arial" size="+1.5">Did I understand the child's condition to plan for an intervention program?</font> (Max 200 characters) </br></br>
    <textarea name="Q1" rows="7" cols="75" onkeyup="if (this.value.length >200) { alert('Character limit has been reached!'); this.value = this.value.substr(0,200); }" ></textarea>

</br>
</br>
 <font face="Arial" size="+1.5">Am I aware of the various challenges of the child due to the condition?</font> (Max 200 characters) </br></br>
    <textarea name="Q2" rows="7" cols="75" onkeyup="if (this.value.length >200) { alert('Character limit has been reached!'); this.value = this.value.substr(0,200); }" ></textarea>

</br>
</br>
 <font face="Arial" size="+1.5">Did I establish rapport with the child?</font> (Max 200 characters) </br></br>
    <textarea name="Q3" rows="7" cols="75" onkeyup="if (this.value.length >200) { alert('Character limit has been reached!'); this.value = this.value.substr(0,200); }" ></textarea>

</br>
</br>
 <font face="Arial" size="+1.5">Did I motivate the child for continuing to meet me?</font> (Max 200 characters) </br></br>
    <textarea name="Q4" rows="7" cols="75" onkeyup="if (this.value.length >200) { alert('Character limit has been reached!'); this.value = this.value.substr(0,200); }" ></textarea>

</br>
</br>
 <font face="Arial" size="+1.5">Did I psycho-educate the parents about the condition?</font> (Max 200 characters) </br></br>
    <textarea name="Q5" rows="7" cols="75" onkeyup="if (this.value.length >200) { alert('Character limit has been reached!'); this.value = this.value.substr(0,200); }" ></textarea>

</br>
</br>
</br>
 <font face="Arial" size="+1.5">Did I give options of intervention for the parents to consider?</font> (Max 200 characters) </br></br>
    <textarea name="Q6" rows="7" cols="75" onkeyup="if (this.value.length >200) { alert('Character limit has been reached!'); this.value = this.value.substr(0,200); }" ></textarea>

</br>
</br>
</br>
 <font face="Arial" size="+1.5"> Did I provide a comprehensive intervention that involves multi-stakeholder approach?</font></br> (Max 200 characters) </br></br>
    <textarea name="Q7" rows="7" cols="75" onkeyup="if (this.value.length >200) { alert('Character limit has been reached!'); this.value = this.value.substr(0,200); }" ></textarea>


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
