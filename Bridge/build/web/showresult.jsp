<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Green Day</title>
<link href="global.css" rel="stylesheet" type="text/css" />
<link href="yellow.css" rel="stylesheet" type="text/css" />
</head>
      <%@page contentType="text/html" pageEncoding="UTF-8"
        import="java.io.*"
        import="java.sql.*"%>
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
                     <center>
                                                <font size="+2.0">SUGGESTIONS</font>
                                                <br/>
                                                <br/>
                                                <br/>

    
        <table cellpadding="5" cellspacing="5" border="1">
            <tr>
                <th>NAME</th>
                <th>DOB</th>
                <th>SEX</th>
                <th>AGE GROUP</th>
                <th>ADHD</th>
                <th>DYSLEXIA</th>
                <th>DYSGRAPHIA</th>
                <th>DYSCALCULIA</th>
                           </tr>
              <%  String s1,s2,s3,s4,s5,s6,s7,s8;
    Statement stmt=null;
    boolean flag=false;
    int i=1;
       s1=request.getParameter("name");
Class.forName("com.mysql.jdbc.Driver");
//P.println("driver loaded");
        Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bridge","root","root");
stmt=con.createStatement();
ResultSet rs=null;
String q="select NAME,DOB,SEX,AGEGROUP ,ADHD,DYSLEXIA,DYSGRAPHIA,DYSCALCULIA from generaldetails where NAME LIKE '"+s1+"%';";
                rs=stmt.executeQuery(q);
               while(rs.next())
                    {
                   flag=true;
                            s1=rs.getString(1);
                              s2=rs.getString(2);
                                s3=rs.getString(3);
                                  s4=rs.getString(4);
                                    s5=rs.getString(5);
                                     s6=rs.getString(6);
                                  s7=rs.getString(7);
                                    s8=rs.getString(8);
                                                                                                                                       
             %>  
               
    <tr>
        <td><%=s1%></td>
         <td><%=s2%></td>
          <td><%=s3%></td>
           <td><%=s4%></td>
              <td><%=s5%> <a href="adhdselect?user=<%=s1%>">SELECT</a></td>
               <td><%=s6%> <a href="dyslexiaselect?user=<%=s1%>">SELECT</a></td>
           <td><%=s7%> <a href="dysgraphiaselect?user=<%=s1%>">SELECT</a></td>
              <td><%=s8%> <a href="dyscalculiaselect?user=<%=s1%>">SELECT</a></td>
   
     
    </tr>
            
    <%
       }
                             
               %>
               
               
               
                  </table>
                                            </center>
               
    </div>
    <div id="footer"></div>
  </div>
</div>
</body>
</html>
