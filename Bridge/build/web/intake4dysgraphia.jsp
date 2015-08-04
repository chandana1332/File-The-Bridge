<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Slablet</title>
<link href="global.css" rel="stylesheet" type="text/css" />
<link href="yellow.css" rel="stylesheet" type="text/css" />
</head>
<body>
    <form action="intake4dysgraphia">
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
        <font face="Arial" size="+2.5">DYSGRAPHIA</font>
                            </br>
                          </br>
                          (select all that apply)
    </br>
                          </br>

<input type="checkbox" name="dysgraphia" value="Death grip on the pencil"> <font face="Arial" size="+0.5">Death grip on the pencil</font>
</br>
</br>
<input type="checkbox" name="dysgraphia" value="Incorrect pencil grip"> <font face="Arial" size="+0.5">Incorrect pencil grip</font>
</br>
</br>
<input type="checkbox" name="dysgraphia" value="Awkward positioning of the body, bending too close "> <font face="Arial" size="+0.5">Awkward positioning of the body, bending too close </font>
</br>
</br>
<input type="checkbox" name="dysgraphia" value="the paper"> <font face="Arial" size="+0.5">the paper</font>
</br>
</br>
<input type="checkbox" name="dysgraphia" value="Symptoms of premature muscle fatigue"> <font face="Arial" size="+0.5">Symptoms of premature muscle fatigue</font>
</br>
</br>
<input type="checkbox" name="dysgraphia" value="Avoidance of writing tasks"> <font face="Arial" size="+0.5">Avoidance of writing tasks</font>
</br>
</br>
<input type="checkbox" name="dysgraphia" value="Sparse written output inappropriate to a childs age, reading ability, verbal ability"> <font face="Arial" size="+0.5">Sparse written output inappropriate to a child's age, reading ability, verbal ability</font>
</br>
</br>
<input type="checkbox" name="dysgraphia" value="Numerous eye fixations from far to near point during a copying task"> <font face="Arial" size="+0.5">Numerous eye fixations from far to near point during a copying task</font>
</br>
</br>
<input type="checkbox" name="dysgraphia" value="Excessive number of erasures"> <font face="Arial" size="+0.5">Excessive number of erasures</font>
</br>
</br>
<input type="checkbox" name="dysgraphia" value="Frequent referral to an alphabet chart to check the formation of letters"> <font face="Arial" size="+0.5">Frequent referral to an alphabet chart to check the formation of letters</font>
</br>
</br>
<input type="checkbox" name="dysgraphia" value="Confusions in directional orientation such as mirror writing and reversals"> <font face="Arial" size="+0.5">Confusions in directional orientation such as mirror writing and reversals</font>
</br>
</br>
<input type="checkbox" name="dysgraphia" value="Poor use of space as observed inc crawling or cramped writing, inadequate space between letters and words, inappropriate letter size relationships, and inability to stay within head and base lines"> <font face="Arial" size="+0.5">Poor use of space as observed inc crawling or cramped writing, inadequate space between letters and words, inappropriate letter size relationships, and inability to stay within head and base lines</font>
</br>
</br>
<input type="checkbox" name="dysgraphia" value="Poor letter connections and illegible letters"> <font face="Arial" size="+0.5">Poor letter connections and illegible letters</font>
</br>
</br>
<input type="checkbox" name="dysgraphia" value="Inaccuracies such as omissions, perseverations, lack of punctuation, line skipping"> <font face="Arial" size="+0.5">Inaccuracies such as omissions, perseverations, lack of punctuation, line skipping</font>
</br>
</br>
<input type="checkbox" name="dysgraphia" value="Slow motor speed"> <font face="Arial" size="+0.5">Slow motor speed</font>
</br>
</br>
<input type="checkbox" name="dysgraphia" value="Hesitation and difficulty in generating letters in a noncopying writing task, particularly capital letters"> <font face="Arial" size="+0.5">Hesitation and difficulty in generating letters in a noncopying writing task, particularly capital letters</font>
</br>
</br>
<input type="checkbox" name="dysgraphia" value="Difficulty in keeping up with dictation tasks due to a breakdown in the integration process"> <font face="Arial" size="+0.5">Difficulty in keeping up with dictation tasks due to a breakdown in the integration process</font>
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
