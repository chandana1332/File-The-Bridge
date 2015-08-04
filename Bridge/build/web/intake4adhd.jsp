<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Slablet</title>
<link href="global.css" rel="stylesheet" type="text/css" />
<link href="yellow.css" rel="stylesheet" type="text/css" />
</head>
<body>
    <form action="intake4adhd">
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
        <font face="Arial" size="+2.5">ADHD</font>
                            </br>
                          </br>
                          (select all that apply)
    </br>
                          </br>

<input type="checkbox" name="adhd" value="Doesnt stay seated"> <font face="Arial" size="+0.5">Doesn't stay seated </font>
</br>
</br>
<input type="checkbox" name="adhd" value="Runs or climbs excessively"> <font face="Arial" size="+0.5">Runs or climbs excessively</font>
</br>
</br>
<input type="checkbox" name="adhd" value="Often interrupts or intrudes on others"> <font face="Arial" size="+0.5">Often interrupts or intrudes on others</font>
</br>
</br>
<input type="checkbox" name="adhd" value="Often fails to give close attention to details or makes mistakes in schoolwork"> <font face="Arial" size="+0.5">Often fails to give close attention to details or makes mistakes in schoolwork</font>
</br>
</br>
<input type="checkbox" name="adhd" value="Difficulty sustaining attention in tasks"> <font face="Arial" size="+0.5">Difficulty sustaining attention in tasks</font>
</br>
</br>
<input type="checkbox" name="adhd" value="Seems not to listen"> <font face="Arial" size="+0.5">Seems not to listen</font>
</br>
</br>
<input type="checkbox" name="adhd" value="Fails to follow instructions or finish work"> <font face="Arial" size="+0.5">Fails to follow instructions or finish work</font>
</br>
</br>
<input type="checkbox" name="adhd" value="Unorganized"> <font face="Arial" size="+0.5">Unorganized</font>
</br>
</br>
<input type="checkbox" name="adhd" value="Difficulties with schoolwork or homework"> <font face="Arial" size="+0.5">Difficulties with schoolwork or homework</font>
</br>
</br>
<input type="checkbox" name="adhd" value="Loses things like school assignments, books, tools, etc"> <font face="Arial" size="+0.5">Loses things like school assignments, books, tools, etc</font>
</br>
</br>
<input type="checkbox" name="adhd" value="Easily distracted"> <font face="Arial" size="+0.5">Easily distracted</font>
</br>
</br>
<input type="checkbox" name="adhd" value="Forgetful about daily activities"> <font face="Arial" size="+0.5">Forgetful about daily activities</font>
</br>
</br>
<input type="checkbox" name="adhd" value="Fidgety in a squirmy sense"> <font face="Arial" size="+0.5">Fidgety in a squirmy sense</font>
</br>
</br>
<input type="checkbox" name="adhd" value="Feelings of restlessness in older children"> <font face="Arial" size="+0.5">Feelings of restlessness in older children</font>
</br>
</br>
<input type="checkbox" name="adhd" value="Difficulty playing quietly"> <font face="Arial" size="+0.5">Difficulty playing quietly</font>
</br>
</br>
<input type="checkbox" name="adhd" value="Often ON THE GO or acts if DRIVEN BY MOTOR"> <font face="Arial" size="+0.5">Often "on the go" or acts if "driven by a motor"</font>
</br>
</br>
<input type="checkbox" name="adhd" value="Often talks excessively"> <font face="Arial" size="+0.5">Often talks excessively</font>
</br>
</br>
<input type="checkbox" name="adhd" value="Blurts out answers to questions"> <font face="Arial" size="+0.5">Blurts out answers to questions</font>
</br>
</br>
<input type="checkbox" name="adhd" value="Difficulty waiting in lines or waiting turns"> <font face="Arial" size="+0.5">Difficulty waiting in lines or waiting turns</font>
</br>
</br>
<input type="checkbox" name="adhd" value="Often easily distracted by extraneous stimuli"> <font face="Arial" size="+0.5">Often easily distracted by extraneous stimuli</font>
</br>
</br>
<input type="checkbox" name="adhd" value="Often difficulty following through on instructions from others"> <font face="Arial" size="+0.5">Often difficulty following through on instructions from others</font>
</br>
</br>
<input type="checkbox" name="adhd" value="Difficulty sustaining attention"> <font face="Arial" size="+0.5">Difficulty sustaining attention </font>
</br>
</br>
<input type="checkbox" name="adhd" value="Often does not seem to listen to what is being said"> <font face="Arial" size="+0.5">Often does not seem to listen to what is being said </font>
</br>
</br>
<input type="checkbox" name="adhd" value="Tendency to lose things necessary for tasks or activities"> <font face="Arial" size="+0.5">Tendency to lose things necessary for tasks or activities </font>
</br>
</br>
<input type="checkbox" name="adhd" value="Difficulty organizing goal-directed activities"> <font face="Arial" size="+0.5">Difficulty organizing goal-directed activities </font>
</br>
</br>
<input type="checkbox" name="adhd" value="Often shifts from one uncompleted activity to another"> <font face="Arial" size="+0.5">Often shifts from one uncompleted activity to another </font>
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
