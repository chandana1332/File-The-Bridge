<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Slablet</title>
<link href="global.css" rel="stylesheet" type="text/css" />
<link href="yellow.css" rel="stylesheet" type="text/css" />
</head>
<body>
    <form action="intake4dyslexia">
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
        <font face="Arial" size="+2.5">DYSLEXIA</font>
                            </br>
                          </br>
                          (select all that apply)
    </br>
                          </br>

<input type="checkbox" name="dyslexia" value="Slow rate of oral and silent reading"> <font face="Arial" size="+0.5">Slow rate of oral and silent reading</font>
</br>
</br>
<input type="checkbox" name="dyslexia" value="Inability to answer questions about what is read showing lack of comprehension"> <font face="Arial" size="+0.5">Inability to answer questions about what is read showing lack of comprehension</font>
</br>
</br>
<input type="checkbox" name="dyslexia" value="Inability to state the main topic of a simple paragraph or story"> <font face="Arial" size="+0.5">Inability to state the main topic of a simple paragraph or story</font>
</br>
</br>
<input type="checkbox" name="dyslexia" value="Lack of skill in using tools to locate information and such as index and table of the contents"> <font face="Arial" size="+0.5">Lack of skill in using tools to locate information and such as index and table of the contents</font>
</br>
</br>
<input type="checkbox" name="dyslexia" value="Inability to follow simple printed instructions"> <font face="Arial" size="+0.5">Inability to follow simple printed instructions</font>
</br>
</br>
<input type="checkbox" name="dyslexia" value="Reading word by word"> <font face="Arial" size="+0.5">Reading word by word</font>
</br>
</br>
<input type="checkbox" name="dyslexia" value="Lack of expression in oral reading"> <font face="Arial" size="+0.5">Lack of expression in oral reading</font>
</br>
</br>
<input type="checkbox" name="dyslexia" value="Excessive lip movement in silent reading"> <font face="Arial" size="+0.5">Excessive lip movement in silent reading</font>
</br>
</br>
<input type="checkbox" name="dyslexia" value="Vocalization in silent reading"> <font face="Arial" size="+0.5">Vocalization in silent reading</font>
</br>
</br>
<input type="checkbox" name="dyslexia" value="Lack of interest in reading"> <font face="Arial" size="+0.5">Lack of interest in reading</font>
</br>
</br>
<input type="checkbox" name="dyslexia" value=" Excessive physical activity while reading such as squirming"> <font face="Arial" size="+0.5"> Excessive physical activity while reading such as squirming</font>
</br>
</br>
<input type="checkbox" name="dyslexia" value="Mispronunciation of words"> <font face="Arial" size="+0.5">Mispronunciation of words </font>
</br>
</br>
<input type="checkbox" name="dyslexia" value="Omission of letters"> <font face="Arial" size="+0.5">Omission of letters</font>
</br>
</br>
<input type="checkbox" name="dyslexia" value="Substitution of words / letters"> <font face="Arial" size="+0.5">Substitution of words / letters</font>
</br>
</br>
<input type="checkbox" name="dyslexia" value="Insertion of words / letters"> <font face="Arial" size="+0.5">Insertion of words / letters</font>
</br>
</br>
<input type="checkbox" name="dyslexia" value="Reversal of whole words due to difficulty in sequential memory"> <font face="Arial" size="+0.5">Reversal of whole words due to difficulty in sequential memory </font>
</br>
</br>
<input type="checkbox" name="dyslexia" value="Repetition of words / groups when reading orally"> <font face="Arial" size="+0.5">Repetition of words / groups when reading orally</font>
</br>
</br>
<input type="checkbox" name="dyslexia" value="Excessive number of regressive eye movements"> <font face="Arial" size="+0.5">Excessive number of regressive eye movements</font>
</br>
</br>
<input type="checkbox" name="dyslexia" value="Excessive eye fixation"> <font face="Arial" size="+0.5">Excessive eye fixation</font>
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
