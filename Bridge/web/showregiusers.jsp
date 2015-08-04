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
           <tr>
                <th>NAME</th>
                <th>SEX</th>
                <th>QUALIFICATION</th>
            </tr>
            
              <%  String s1,s2,s3;
    Statement stmt=null;

            String name=request.getParameter("name");
           
                           
Class.forName("com.mysql.jdbc.Driver");
        Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bridge","root","root");
stmt=con.createStatement();
ResultSet rs=null;
String q="select NAME,SEX,QUALIFICATION from registration;";
                rs=stmt.executeQuery(q);
               while(rs.next())
                    {
                            s1=rs.getString(1);
                           s2=rs.getString(2);
                          s3=rs.getString(3);
                                                                                     
             %>  
               
    <tr>
        <td><%=s1%></td>
        <td><%=s2%></td> 
      <td><%=s3%></td>
       <td><a href="showdetails.jsp?user=<%=s1%>">SHOW DETAILS</a></td>
       <td><a href="Addusers?user=<%=s1%>">ADD</a></td>
      <td><a href="Deleteusers?user=<%=s1%>">DELETE</a></td>
    </tr>
            
    <%
       }
                             
               %>
               
               
               
                  </table> 
               
        
    </div>
    <div id="footer"></div>
  </div>
</div>
</body>
</html>
