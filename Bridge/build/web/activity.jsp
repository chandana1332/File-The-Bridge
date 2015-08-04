<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
         <form action="activity">

<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Green Day</title>
<link href="global.css" rel="stylesheet" type="text/css" />
<link href="yellow.css" rel="stylesheet" type="text/css" />
 <script>
function myFunction1()
{
 document.getElementById("B1").style.visibility="visible";
}
function myFunction2()
{
 document.getElementById("B2").style.visibility="visible";
}
function myFunction3()
{
 document.getElementById("B3").style.visibility="visible";
}
function myFunction4()
{
 document.getElementById("B4").style.visibility="visible";
}

</script>
</head>
<body>
   
    
<div id="body">
  <div id="top_bg">
    <div id="header">Green Day</div>
    <div id="menu">
      <ul>
         <li><a href="index.html">HOME</a></li>
        <li><a href="login.jsp">LOGIN</a></li>
        <li><a href="Registration.jsp">REGISTRATION</a></li>
          <li><a href="about.jsp">ABOUT</a></li>
       
      </ul>
    </div>
    <div id="content_single">
     
<input type="button" onclick="myFunction1()" value="FRAME DRAWING">

<div id="B1" style="visibility: hidden">
    <br/>
    <table>
        <tr>
            <td>DURATION</td>
            <td> <input type="text" name="A1" /></td>
        </tr>
        <tr>
            <td>DESIGN CODE</td>
            <td><input type="text" name="A2" /></td>
        </tr>
        <tr>
            <td>NUMBER OF DESIGNS DONE IN 10 MINUTES</td>
            <td> <input type="text" name="A3" /></td>
        </tr>
    </table>
    <br />
</div>
    
     
<input type="button" onclick="myFunction2()" value="LINE CANCELLATION">

<div id="B2" style="visibility: hidden">
   <br/>
    <table>
        <tr>
            <td>DURATION</td>
            <td> <input type="text" name="B1" /></td>
        </tr>
        <tr>
            <td>NUMBER OF LINES CANCELLED</td>
            <td> <input type="text" name="B2" /></td>
        </tr>
    </table>
    <br />
  
</div>
    
     
<input type="button" onclick="myFunction3()" value="COLORING">

<div id="B3" style="visibility: hidden">
    <br/>
    <table>
        <tr>
            <td>DURATION</td>
            <td> <input type="text" name="C1" /></td>
        </tr>
        <tr>
            <td>DESIGN CODE</td>
            <td><input type="text" name="C2" /></td>
        </tr>
        <tr>
            <td>WHITE SPACES/OUT OF BOUNDARY COLORING</td>
            <td> <input type="text" name="C3" /></td>
        </tr>
        <tr>
            <td>NUMBER OF COLORS USED</td>
            <td><input type="text" name="C4" /></td>
        </tr>
        <tr>
            <td>AESTHETIC RATING BY CHILD</td>
            <td> <input type="text" name="C5" /></td>
        </tr>
    </table>
    <br />
    
    
</div>
    
       
<input type="button" onclick="myFunction4()" value="SORTING">
<div id="B4" style="visibility: hidden">
    <br/>

     <table>
        <tr>
            <td>DURATION</td>
            <td> <input type="text" name="D1" /></td>
        </tr>
        <tr>
            <td>PULSE CODE</td>
            <td><input type="text" name="D2" /></td>
        </tr>
        <tr>
            <td>NUMBER SORTED CORRECTLY</td>
            <td> <input type="text" name="D3" /></td>
        </tr>
       
    </table>
    <br/>
</div>

                            
                                          <%  
   String name=(String)request.getParameter("user");
   %>
    <input type="text" name="name" value="<%=name%>" style="visibility: hidden" />
    <center>   <input type="submit" value="Save"/></center>

    </div>
    <div id="footer"></div>
  </div>
</div>
    </form>
</body>
</html>
