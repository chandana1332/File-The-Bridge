<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
        <title>FILE</title>
        <link href="global.css" rel="stylesheet" type="text/css" />
        <link href="yellow.css" rel="stylesheet" type="text/css" />
    </head>
    <body>
        <form action="intake1">
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
                        <table>
                            <tr>
                                <td>
                                    <center>
                                        <font face="Arial" size="+3">GENERAL DETAILS</font>
                                    </center>
                                    </br>
                                    </br>
                                    </br>
                                    </br>
                                    <font face="Arial" size="+1.5">NAME</font> <input type="text" name="Name">
                                        </br>
                                        </br>
                                        </br>
                                        <font face="Arial" size="+1.5">DATE OF BIRTH</font> <input type="date" name="Dob"></br>
                                            </br>   
                                            </br>
                                            <font face="Arial" size="+1.5">SEX</font> 
                                            </br><input type="radio" name="Sex" value="Male"> <font face="Arial" size="+0.5"> Male</font>
                                                </br>

                                                <input type="radio" name="Sex" value="Female">  <font face="Arial" size="+0.5">Female</font>
                                                    </br>
                                                    </br>

                                                    </br>
                                                    <font face="Arial" size="+1.5">AGE GROUP</font> 
                                                    </br><input type="radio" name="Agegroup" value="3-6"> <font face="Arial" size="+0.5"> Early childhood(3-6 yrs)</font>
                                                        </br>

                                                        <input type="radio" name="Agegroup" value="6-10">  <font face="Arial" size="+0.5">Childhood(6-10 yrs)</font>
                                                            </br>
                                                            <input type="radio" name="Agegroup" value="10-13">  <font face="Arial" size="+0.5">Early Adolscenece(10-13 yrs)</font>
                                                                </br>
                                                                <input type="radio" name="Agegroup" value="13-18">  <font face="Arial" size="+0.5">Adolscence(13-18 yrs)</font>
                                                                    </br>
                                                                    </br>
                                                                    </br>
                                                                    <font face="Arial" size="+1.5">ADDRESS</font> (Max 120 characters) </br>
                                                                    <textarea name="Address" rows="7" cols="20" onkeyup="if (this.value.length > 120) {
                                                                                alert('Character limit has been reached!');
                                                                                this.value = this.value.substr(0, 120);
                                                                            }" ></textarea>

                                                                    </br>
                                                                    </br>
                                                                    </br>
                                                                    <font face="Arial" size="+1.5">PHONE</font> 
                                                                    </br>
                                                                    </br>
                                                                    <div align="left">
                                                                        <table>
                                                                            <tr>    
                                                                                <td> <font face="Arial" size="+0.5">RESIDENCE</font></td>
                                                                                <td><input type="number" name="Residence" size="10"></td>
                                                                            </tr>
                                                                            <tr>
                                                                                <td> <font face="Arial" size="+0.5">OFFICE</font></td>
                                                                                <td><input type="number" name="Office" size="10"></td>
                                                                            </tr>
                                                                            <tr>
                                                                                <td> <font face="Arial" size="+0.5">MOBILE</font></td>
                                                                                <td><input type="number" name="Mobile" size="10"></td>
                                                                            </tr>
                                                                        </table>
                                                                        </br>
                                                                        </br>
                                                                        </br></br>
                                                                        <font face="Arial" size="+1.5">BOARD</font>
                                                                        </br>
                                                                        <input type="radio" name="Board" value="State"> <font face="Arial" size="+0.5">State</font>
                                                                            </br>
                                                                            <input type="radio" name="Board" value="CBSE"> <font face="Arial" size="+0.5">CBSE </font>
                                                                                </br>
                                                                                <input type="radio" name="Board" value="ICSE">  <font face="Arial" size="+0.5">ICSE</font>
                                                                                    </br>
                                                                                    <input type="radio" name="Board" value="Other">  <font face="Arial" size="+0.5">Other</font>
                                                                                        </br>           
                                                                                        </br>
                                                                                        </br>
                                                                                        <font face="Arial" size="+1.5">MEDIUM OF EDUCATION</font>
                                                                                        </br>
                                                                                        <input type="radio" name="Medium" value="Kannada">  <font face="Arial" size="+0.5">Kannada</font>
                                                                                            </br>                                      
                                                                                            <input type="radio" name="Medium" value="English">  <font face="Arial" size="+0.5">English</font>
                                                                                                </br>
                                                                                                <input type="radio" name="Medium" value="Hindi">  <font face="Arial" size="+0.5">Hindi</font>
                                                                                                    </br>
                                                                                                    <input type="radio" name="Medium" value="Urdu">  <font face="Arial" size="+0.5">Urdu</font>
                                                                                                        </br>           
                                                                                                        <input type="radio" name="Medium" value="Other">  <font face="Arial" size="+0.5">Other</font>
                                                                                                            </br></br>
                                                                                                            </br>
                                                                                                            </br>
                                                                                                            <font face="Arial" size="+1.5">INCOME OF PARENTS</font>
                                                                                                            </br>
                                                                                                            <input type="radio" name="Income" value="less than 2lakh">  <font face="Arial" size="+0.5">less than 2lakh</font>                                      
                                                                                                                </br>                                      
                                                                                                                <input type="radio" name="Income" value="2-5lakh">  <font face="Arial" size="+0.5">2-5lakh</font>                                     
                                                                                                                    </br>
                                                                                                                    <input type="radio" name="Income" value="5-8lakh">  <font face="Arial" size="+0.5">5-8lakh</font>                                      
                                                                                                                        </br>
                                                                                                                        <input type="radio" name="Income" value="More than 8lakh">  <font face="Arial" size="+0.5">More than 8lakh</font>                                   
                                                                                                                            </br></br>
                                                                                                                            </br>
                                                                                                                            </br>
                                                                                                                            <font face="Arial" size="+1.5">PAST ACADEMIC RECORD</font>
                                                                                                                            </br>
                                                                                                                            <div align="left">
                                                                                                                                <table>
                                                                                                                                    <tr>
                                                                                                                                        <th> <font face="Arial" size="+0.5">Subject</font></th>
                                                                                                                                        <th> <font face="Arial" size="+0.5">Marks or % in last sem</font></th>
                                                                                                                                    </tr>
                                                                                                                                    <tr>
                                                                                                                                        <td> <font face="Arial" size="+0.5">Maths</font></td>
                                                                                                                                        <td><input type="number" name="Maths"></td>
                                                                                                                                    </tr>
                                                                                                                                    <tr>
                                                                                                                                        <td> <font face="Arial" size="+0.5">Social</font></td>
                                                                                                                                        <td><input type="number" name="Social"></td>
                                                                                                                                    </tr>
                                                                                                                                    <tr>
                                                                                                                                        <td> <font face="Arial" size="+0.5">Science</font></td>
                                                                                                                                        <td><input type="number" name="Science"></td>
                                                                                                                                    </tr>
                                                                                                                                    <tr>
                                                                                                                                        <td> <font face="Arial" size="+0.5">First Language</font></td>
                                                                                                                                        <td><input type="text" name="First Language"></td>
                                                                                                                                    </tr>
                                                                                                                                    <tr>
                                                                                                                                        <td> <font face="Arial" size="+0.5">Second Language</font></td>
                                                                                                                                        <td><input type="text" name="Second Language"></td>
                                                                                                                                    </tr>
                                                                                                                                    <tr>
                                                                                                                                        <td> <font face="Arial" size="+0.5">Third Language</font></td>
                                                                                                                                        <td><input type="text" name="Third Language"></td>
                                                                                                                                    </tr>
                                                                                                                                </table>
                                                                                                                            </div>
                                                                                                                            </br>
                                                                                                                            </br>
                                                                                                                            </br>

                                                                                                                            <input type="submit" value="Save">
                                                                                                                                </br>
                                                                                                                                </br>
                                                                                                                                <input type="reset" value="Reset">

                                                                                                                                    </br>
                                                                                                                                    </br>

                                                                                                                                    </td>

                                                                                                                                    <td>
                                                                                                                                        NOTES
                                                                                                                                        <textarea rows="17" cols="17" name="notes"></textarea>
                                                                                                                                    </td>
                                                                                                                                    </tr>
                                                                                                                                    </table>

                                                                                                                                    </div>
                                                                                                                                    <div id="footer"></div>
                                                                                                                                    </div>
                                                                                                                                    </div>
                                                                                                                                    </form>
                                                                                                                                    </body>
                                                                                                                                    </html>
