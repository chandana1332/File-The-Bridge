
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Slablet</title>
<link href="global.css" rel="stylesheet" type="text/css" />
<link href="yellow.css" rel="stylesheet" type="text/css" />
</head>
<body>
    <form action="intake5">
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
                          </br>
                          </br>
                          </br>
<font face="Arial" size="+1.5">PARENTING</font>
</br>
</br>

<input type="radio" name="Parenting" value="Single Parenting">  <font face="Arial" size="+0.5">Single Parenting</font>
</br>                                      
<input type="radio" name="Parenting" value="Both parents working">  <font face="Arial" size="+0.5">Both parents working</font>                                      
</br>
<input type="radio" name="Parenting" value="Mother working and father unemployed">  <font face="Arial" size="+0.5">Mother working and father unemployed</font>                                      
</br>
<input type="radio" name="Parenting" value="Father employed and mother a housewife">  <font face="Arial" size="+0.5">Father employed and mother a housewife</font>                                    
</br></br>
<font face="Arial" size="+1.5">PARENTING STYLE</font>
</br>
</br>
</br>
(Pick any one of three)
</br>
<input type="radio" name="Parentingstyle1" value="1">  <font face="Arial" size="+0.5">Allow the child to do what it wants to do</font>
</br>                                      
<input type="radio" name="Parentingstyle1" value="2">  <font face="Arial" size="+0.5">Does not allow the child to do what it wants to do</font>                                      
</br>
<input type="radio" name="Parentingstyle1" value="3">  <font face="Arial" size="+0.5">Allow the child to do what it wants to do, but makes it aware about the consequences</font>                                      
</br>
</br>
</br>
</br>
(Pick any one of three)
</br>
<input type="radio" name="Parentingstyle2" value="1">  <font face="Arial" size="+0.5">No restrictions on any task done by the child</font>                               
</br>
<input type="radio" name="Parentingstyle2" value="3">  <font face="Arial" size="+0.5">Restrictions on any task done by the child depending on the risk  or harm involved</font>                                      
</br>
<input type="radio" name="Parentingstyle2" value="2">  <font face="Arial" size="+0.5">Multiple  restrictions on any task done by the child</font>   
</br>
</br>
</br>
</br>
(Pick any one of three)
</br>                                      
<input type="radio" name="Parentingstyle3" value="2">  <font face="Arial" size="+0.5">Providing things later when asked  by the child</font>                                      
</br>
<input type="radio" name="Parentingstyle3" value="3">  <font face="Arial" size="+0.5">Providing things based on the need and ability to negotiate</font> 
</br>
<input type="radio" name="Parentingstyle3" value="1">  <font face="Arial" size="+0.5">Providing things as soon as demanded by the child</font>
</br>
</br>
</br>
</br>
(Pick any one of three)
</br>                                     
<input type="radio" name="Parentingstyle4" value="2">  <font face="Arial" size="+0.5">Strict rules at home for eating, sleeping</font>                                      
</br>
<input type="radio" name="Parentingstyle4" value="1">  <font face="Arial" size="+0.5">No rules at home for eating, sleeping</font>
</br> 
<input type="radio" name="Parentingstyle4" value="3">  <font face="Arial" size="+0.5">Rules at home for eating, sleeping followed by all</font>                                      
</br>
</br>
</br>


<%
  String name=(String)request.getAttribute("name");
  %>
  <input type="text" name="name" value="<%=name%>" style="visibility:hidden">
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
