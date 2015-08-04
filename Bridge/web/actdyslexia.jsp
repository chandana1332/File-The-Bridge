<%-- 
Document   : act
Created on : Mar 14, 2014, 6:39:23 PM
Author     : sony
--%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@page contentType="text/html" pageEncoding="UTF-8"
import="java.io.*"
import="java.sql.*"%>
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
        <title>Green Day</title>
        <link href="global.css" rel="stylesheet" type="text/css" />
        <link href="yellow.css" rel="stylesheet" type="text/css" />
    </head>
    <body>
        <form action="activity1dyslexia"/>
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


                    <%  String s1,s2,s3,s4,s5,s6,s7,s8;
                    Statement stmt=null;
                    boolean flag=false;
                    String name=request.getParameter("user");
                    int i=0,j=0,k=0,w=0;
                    String s[]=new String[80];
                    String m[]=new String[80];  
                    String v[]=new String[80];                         
                    String val[]=new String[80];                         

                    Class.forName("com.mysql.jdbc.Driver");
                    Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bridge","root","root");
                    stmt=con.createStatement();
                    ResultSet rs=null,rs1=null;
                    String q="select DISTINCT ACTIVITY from actidyslexia where NAME='"+name+"';";
                    rs=stmt.executeQuery(q);
                    System.out.println(q);
                    while(rs.next())
                    {
                    s[i]=rs.getString(1);
                    System.out.println(s[i]);

                    i++;
                    }

                    for(w=0;w<i;w++)
                        {
                        String q1="select PARAMETERS,RECENT_VAL from actidyslexia where activity='"+s[w]+"';";
                        rs=stmt.executeQuery(q1);
                        System.out.println(q1);

                        while(rs.next())
                        {
                        m[j]=rs.getString(1); 
                        val[j]=rs.getString(2);
                        System.out.println(m[j]);

                        j++;
                        } 

                        %>
                        <%=s[w]%>
                        <br/>
                        <%
                        for(k=0;k<j;k++)
                            {                                                                                                                               

                            %>


                            <br/><%=m[k]%> 
                            <input type="text" name="<%=s[w]%>_<%=m[k]%>" value="<%=val[k]%>"/>
                            <br/>


                            <%System.out.println(s[w]+"_"+m[k]);
                            }j=0;}%>
                            <input type="text" name="name"value="<%=name%>" />
                            <br/>
                            <input type="submit" value="SAVE"/>
                            <br/>

                            <a href="addactdyslexia.jsp?user=<%=name%>">ADD ACTIVITY</a>

                            <div id="footer"></div>
                            </div>
                            </div>
                            </form>
                            </body>
                            </html>







