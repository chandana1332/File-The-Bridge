/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 *
 * @author CHANDANA
 */
public class intake4adhd extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        try {
            PrintWriter P = res.getWriter();
            res.setContentType("Text/html");
            Statement stmt1 = null;
            String s1 = req.getParameter("name");
            String[] adhd = req.getParameterValues("adhd");
            String y = "YES";
            String n = "NO";
            int ssize = adhd.length;
            P.println(ssize);
            RequestDispatcher rd = null;
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bridge", "root", "root");
            stmt1 = con.createStatement();
            P.println("A");
            if (ssize >= 12) {
                P.println("YES");
                int i, a = 0, a1 = 0;

                P.println("connected and statement created");
                ResultSet rs = null;
                for (i = 0; i < ssize; i++) {
                    String q = "insert into adhdsymptoms values('" + s1 + "','" + adhd[i] + "')";
                    P.println(q);
                    a = stmt1.executeUpdate(q);
                }
                String q1 = "update generaldetails set ADHD='" + y + "' where NAME='" + s1 + "';";
                a1 = stmt1.executeUpdate(q1);
                boolean b = false;

                if (a == 1 && a1 == 1) {
                    b = true;
                }
                if (b) {
                    req.setAttribute("name", s1);
                    rd = req.getRequestDispatcher("/intake5.jsp");
                    rd.forward(req, res);
                } else {
                    req.setAttribute("name", s1);
                    rd = req.getRequestDispatcher("/intake4adhd.jsp");
                    rd.forward(req, res);
                }

            } else {
                P.println("NO");

                String q2 = "update generaldetails set ADHD='" + n + "' where NAME='" + s1 + "';";
                P.println(q2);
                int a2 = stmt1.executeUpdate(q2);
                P.println("B");
                boolean b = false;

                if (a2 == 1) {
                    b = true;
                }
                if (b) {
                    req.setAttribute("name", s1);
                    rd = req.getRequestDispatcher("/intake4dyslexia.jsp");
                    rd.forward(req, res);
                } else {
                    req.setAttribute("name", s1);
                    rd = req.getRequestDispatcher("/intake4adhd.jsp");
                    rd.forward(req, res);
                }
            }

        } catch (Exception e) {
            System.out.println("error is" + e);

        }

    }

}
