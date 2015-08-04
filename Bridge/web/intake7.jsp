<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Slablet</title>
<link href="global.css" rel="stylesheet" type="text/css" />
<link href="yellow.css" rel="stylesheet" type="text/css" />
</head>
<body>
    <form action="intake7">
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
       </br> <font face="Arial" size="+1.5">PARENTAL HEALTH PROBLEMS</font>
</br>
</br>
  
<input type="radio" name="healthprob" value="Healthy"> <font face="Arial" size="+0.5">Healthy</font>
</br>
<input type="radio" name="healthprob" value="Unhealthy"> <font face="Arial" size="+0.5">Unhealthy</font>
</br>
</br>
(If Unhealthy, Select all that apply)
</br>
<input type="checkbox" name="prob" value="Diabetes"> <font face="Arial" size="+0.5">Diabetes</font>
</br>
<input type="checkbox" name="prob" value="Blood Pressure"> <font face="Arial" size="+0.5">Blood Pressure</font>
</br>
<input type="checkbox" name="prob" value="Jaundice"> <font face="Arial" size="+0.5">Jaundice</font>
</br>
<input type="checkbox" name="prob" value="Alcoholism"> <font face="Arial" size="+0.5">Alcoholism</font>
</br>
<input type="checkbox" name="prob" value="Smoking"> <font face="Arial" size="+0.5">Smoking</font>
</br>
<input type="checkbox" name="prob" value="Paan/Gutka chewing"> <font face="Arial" size="+0.5">Paan/Gutka chewing</font>
</br>
</br>
  </br> <font face="Arial" size="+1.5">PARENTAL MENTAL ILLNESS</font>
</br>
</br>
<input type="checkbox" name="mentalill" value="Alcoholism"> <font face="Arial" size="+0.5">Alcoholism</font>
</br>
</br>
<input type="checkbox" name="mentalill" value="Depression"> <font face="Arial" size="+0.5">Depression</font>
</br>
</br>
<input type="checkbox" name="mentalill" value="Epilepsy"> <font face="Arial" size="+0.5">Epilepsy</font>
</br>
</br>
<input type="checkbox" name="mentalill" value="Mental Retardation"> <font face="Arial" size="+0.5">Mental Retardation</font>
</br>
</br>
</br>
 <font face="Arial" size="+1.5">PARENTAL CRIMINALITY</font> (Max 50 characters) </br>
</br>
    <textarea name="criminality" rows="7" cols="20" onkeyup="if (this.value.length >50) { alert('Character limit has been reached!'); this.value = this.value.substr(0,50); }" ></textarea>

</br>
</br>
</br> <font face="Arial" size="+1.5">FAMILY STRENGTHS</font>
</br>
</br>
<input type="checkbox" name="famstrength" value="One parent gainfully employed or having family business"> <font face="Arial" size="+0.5">One parent gainfully employed or having family business</font>
</br>
</br>
<input type="checkbox" name="famstrength" value="Caring family"> <font face="Arial" size="+0.5">Caring family</font>
</br>
</br>
<input type="checkbox" name="famstrength" value="Willing to support the child?s condition"> <font face="Arial" size="+0.5">Willing to support the child?s condition</font>
</br>
</br>
<input type="checkbox" name="famstrength" value="Caring siblings"> <font face="Arial" size="+0.5">Caring siblings</font>
</br>
</br>
<input type="checkbox" name="famstrength" value="Support from extended family for any challenge or crisis"> <font face="Arial" size="+0.5">Support from extended family for any challenge or crisis</font>
</br>
</br>
<input type="checkbox" name="famstrength" value="Acceptance of the child?s condition in the larger family"> <font face="Arial" size="+0.5">Acceptance of the child?s condition in the larger family</font>
</br>
</br>
<input type="checkbox" name="famstrength" value="Family bilingual or multilingual"> <font face="Arial" size="+0.5">Family bilingual or multilingual</font>
</br>
</br>
<input type="checkbox" name="famstrength" value="Family resourceful"> <font face="Arial" size="+0.5">Family resourceful</font>
</br>
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
