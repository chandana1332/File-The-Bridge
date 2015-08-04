<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
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
                    <%  String s1;
                    s1=(String)request.getParameter("user");
                    %>
                    <input type="text" name="name" value="<%=s1%>" style="visibility: hidden" />

                    <center><br/>

                        <br/>
                        <br/>
                        <a href="actdyscalculia.jsp?user=<%=s1%>"><font size="+2.5">ACTIVITY CHART</font></a><br/><br/>
                    </center>
                </div>
                <div id="footer"></div>
            </div>
        </div>
    </body>
</html>
