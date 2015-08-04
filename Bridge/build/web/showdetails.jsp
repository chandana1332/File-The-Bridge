<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <%@page contentType="text/html" pageEncoding="UTF-8"
        import="java.io.*"
        import="java.sql.*"%>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Green Day</title>
<link href="global.css" rel="stylesheet" type="text/css" />
<link href="yellow.css" rel="stylesheet" type="text/css" />
</head>
<body>
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
        <table cellpadding="5" cellspacing="5" border="1">
            
            
              <%  String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14;
    Statement stmt=null;

            String name=request.getParameter("user");
           
          String a=request.getParameter("a");                 
Class.forName("com.mysql.jdbc.Driver");
//P.println("driver loaded");
        Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bridge","root","root");
stmt=con.createStatement();
ResultSet rs=null;
String q="select * from registration where name='"+name+"';";
                rs=stmt.executeQuery(q);
               while(rs.next())
                    {
                            s1=rs.getString(1);
                           s2=rs.getString(2);
                          s3=rs.getString(3);
                          s4=rs.getString(4);
                           s5=rs.getString(5);
                          s6=rs.getString(6);
                          s7=rs.getString(7);
                           s8=rs.getString(8);
                          s9=rs.getString(9);
                          s10=rs.getString(10);
                           s11=rs.getString(11);
                          s12=rs.getString(12);
                         
                                                                                     
             %>  
               
    <tr>
        <td>NAME</td>
        <td><%=s1%></td>
          </tr>
          
              <tr>
        <td>SEX</td>
        <td><%=s2%></td>
          </tr>
              
          <tr>
        <td>QUALIFICATION</td>
        <td><%=s3%></td>
          </tr>
              <tr>
        <td>AREA OF SPECIALISATION</td>
        <td><%=s4%></td>
          </tr>    <tr>
        <td>ADDRESS</td>
        <td><%=s5%></td>
          </tr>
              <tr>
        <td>PHONE</td>
        <td><%=s6%></td>
          </tr>    <tr>
        <td>EMAIL</td>
        <td><%=s7%></td>
          </tr>    <tr>
        <td>WHY I CHOOSE PSYCHOLOGY?</td>
        <td><%=s8%></td>
          </tr>    <tr>
        <td>WHAT IS IT THAT I WANT TO DO AS A PSYCHOLOGIST?</td>
        <td><%=s9%></td>
          </tr>    <tr>
        <td>MY PHILOSOPHY OF INTEVENTION</td>
        <td><%=s10%></td>
          </tr>
          
              <tr>
        <td>TRAINING AND WORKSHOPS ATTENDED</td>
        <td><%=s11%></td>
          </tr>
              <tr>
        <td>ANY FURTHER TRAINING NEEDED:</td>
        <td><%=s12%></td>
          </tr>
          <tr>
              <%
               }
                
          String q1="select Exp from regexperience where name='"+name+"';";
                rs=stmt.executeQuery(q1);
               while(rs.next())
                    {
                            s11=rs.getString(1);
              %>
              
        <td>EXPERIENCE</td>
        <td><%=s11%></td>
          </tr>
          
        <%}
                
          String q2="select Interest from reginterest where name='"+name+"';";
                rs=stmt.executeQuery(q2);
               while(rs.next())
                    {
                            s14=rs.getString(1);
              %>
              <tr>
        <td>AREA OF INTEREST TO WORK</td>
        <td><%=s14%></td>
          </tr>
          
          
            
    <%
       }
                             
               %>
               
               
               
                  </table>  
               <center>
               <br/>
               <br/>
               <a href="Addusers?user=<%=name%>"><font size="+1.5">ADD</font></a>
               <br/>
               <br/>
               
               <a href="Deleteusers?user=<%=name%>"><font size="+1.5">DELETE</font></a>
               </center>
    </div>
    <div id="footer"></div>
  </div>
</div>
</body>
</html>
