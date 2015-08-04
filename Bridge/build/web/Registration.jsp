<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Green Day</title>
<link href="global.css" rel="stylesheet" type="text/css" />
<link href="yellow.css" rel="stylesheet" type="text/css" />
</head>
<body>
    <form action="Registration">
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
        <br/>
        <br/>
     		 <center>
                          <font face="Arial" size="+3">REGISTRATION</font>
                          </center>
                                             </br>
                                        </br>
                                        </br>
                                        
                                    

    <table>
        <tr>    
            <td> <font face="Arial" size="+1.5">NAME</font><br/><br/></td>
            <td><input type="text" name="Name"/><br/><br/></td>
        </tr>
       
         <tr>
            <td> <font face="Arial" size="+1.5">SEX</font></td>
            <td><input type="radio" name="Sex" value="Male"> <font face="Arial" size="+0.5"> Male</font></td>
         </tr>
        <tr>
            <td></td><td><input type="radio" name="Sex" value="Female"> <font face="Arial" size="+0.5"> Female</font></td>
         </tr>
        <tr>
            <td> <font face="Arial" size="+1.5">QUALIFICATION</font><br/><br/></td>
            <td><input type="text" name="Qualification"><br/><br/></td>
        </tr>
        <tr>
            <td> <font face="Arial" size="+1.5">AREA OF SPECIALIZATION</font><br/><br/></td>
            <td><input type="text" name="AOS" /><br/><br/></td>
            </tr>
          <tr>
            <td> <font face="Arial" size="+1.5">ADDRESS</font><br/>(Max 120 characters)<br/><br/></td>
            <td><textarea name="Address" rows="7" cols="20" onkeyup="if (this.value.length >120) { alert('Character limit has been reached!'); this.value = this.value.substr(0,120); }" ></textarea>
<br/><br/></td>
            </tr>
         <tr>
            <td> <font face="Arial" size="+1.5">CONTACT DETAILS</font></td>
            <td> <font face="Arial" size="+0.5">PHONE   </font><input type="text" name="Mobile"></td>
         </tr>
        <tr>
            <td></td><td><font face="Arial" size="+0.5">EMAIL   </font><input type="text" name="Email"> </td>
         </tr>
        <tr>
         <tr>
            <td> <font face="Arial" size="+1.5">WHY I CHOSE PSYCHOLOGY?</font><br/>(Max 200 characters)<br/><br/></td>
            <td><textarea name="Why_Psychology" rows="10" cols="30" onkeyup="if (this.value.length >200) { alert('Character limit has been reached!'); this.value = this.value.substr(0,120); }" ></textarea>
<br/><br/></td>
            </tr>
         <tr>
            <td> <font face="Arial" size="+1.5">WHAT IS IT THAT I WANT TO DO AS A PSYCHOLOGIST?</font><br/>(Max 200 characters)<br/><br/></td>
            <td><textarea name="WANT_TO_DO_AS_Psy" rows="10" cols="30" onkeyup="if (this.value.length >200) { alert('Character limit has been reached!'); this.value = this.value.substr(0,120); }" ></textarea>
<br/><br/></td>
            </tr>
           <tr>
            <td> <font face="Arial" size="+1.5">MY PHILOSOPHY OF INTERVENTION</font><br/>(Max 200 characters)<br/><br/></td>
            <td><textarea name="Intervention" rows="10" cols="30" onkeyup="if (this.value.length >200) { alert('Character limit has been reached!'); this.value = this.value.substr(0,120); }" ></textarea>
<br/><br/></td>
            </tr>
        <tr>
            <td> <font face="Arial" size="+1.5">EXPERIENCE</font></td>
            <td><input type="checkbox" name="Exp" value="Self-brief of work"> <font face="Arial" size="+0.5">Self-brief of work</font></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="checkbox" name="Exp" value="Projects"> <font face="Arial" size="+0.5">Projects</font></td>
        </tr>
        <tr>
            <td>
            </td>
<td><input type="checkbox" name="Exp" value="Assignments done"> <font face="Arial" size="+0.5">Assignments done</font></td>
         </tr>
             <tr>
            <td> <font face="Arial" size="+1.5">Elaborate your Experience( Work done)</font><br/>(Max 200 characters)<br/><br/></td>
            <td><textarea name="Workdone" rows="10" cols="30" onkeyup="if (this.value.length >200) { alert('Character limit has been reached!'); this.value = this.value.substr(0,120); }" ></textarea>
<br/><br/></td>
            </tr>
           
        <tr>
            <td> <font face="Arial" size="+1.5">TRAINING AND WORKSHOPS ATTENDED</font><br/>(Max 200 characters)<br/><br/></td>
            <td><textarea name="Training" rows="10" cols="30" onkeyup="if (this.value.length >200) { alert('Character limit has been reached!'); this.value = this.value.substr(0,120); }" ></textarea>
<br/><br/></td>
            </tr>
        <tr>
            <td> <font face="Arial" size="+1.5">MENTION IF NEED FOR FURTHER TRAINING</font><br/>(Max 200 characters)<br/><br/></td>
            <td><textarea name="Further_Training" rows="10" cols="30" onkeyup="if (this.value.length >200) { alert('Character limit has been reached!'); this.value = this.value.substr(0,120); }" ></textarea>
<br/><br/></td>
            </tr>
         <tr>
            <td> <font face="Arial" size="+1.5">AREAS OF INTEREST TO WORK</font></td>
            <td><input type="checkbox" name="Interest" value="Child"> <font face="Arial" size="+0.5">Child</font></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="checkbox" name="Interest" value="Adolescent"> <font face="Arial" size="+0.5">Adolescent</font></td>
        </tr>
        <tr>
            <td>
            </td>
<td><input type="checkbox" name="Interest" value="Adult"> <font face="Arial" size="+0.5">Adult</font></td>
         </tr>
        <tr>
            <td>
            </td>
<td><input type="checkbox" name="Interest" value="Marital"> <font face="Arial" size="+0.5">Marital</font></td>
         </tr>
        <tr>
            <td>
            </td>
<td><input type="checkbox" name="Interest" value="Disability"> <font face="Arial" size="+0.5">Disability</font></td>
         </tr>
        <tr>
            <td>
            </td>
<td><input type="checkbox" name="Interest" value="De-addiction"> <font face="Arial" size="+0.5">De-addiction</font></td>
         </tr>
 <tr>
            <td>
            </td>
<td><input type="checkbox" name="Interest" value="Other"> <font face="Arial" size="+0.5">If any other, specify</font><input type="text" name="Other1"></td>
         </tr>
                
    </table>
                                        <center>
</br>
                                        <input type="submit" value="REGISTER">
</br>
<input type="reset" value="RESET">
    </center>
</br>
    
    </div>
    <div id="footer"></div>
  </div>
</div>
</form>
</body>
</html>
