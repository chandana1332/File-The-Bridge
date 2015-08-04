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
import javax.servlet.http.HttpSession;

/**
 *
 * @author CHANDANA
 */
public class activitydysgraphia extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        try {
            String s17 = null, s18 = null, s19 = null, s20 = null, s21 = null, s2 = null, s3 = null, s3a = null, s4 = null, s5 = null, s6 = null, s7 = null, s8 = null, s9 = null, s10 = null, s11 = null, s12 = null, s13 = null, s14 = null, s15 = null, s16 = null, s17other = null;

            PrintWriter P = res.getWriter();
            res.setContentType("Text/html");
            String s1 = req.getParameter("name");
            s2 = req.getParameter("n");
            s3 = req.getParameter("P1");
            s4 = req.getParameter("P2");
            s5 = req.getParameter("P3");
            s6 = req.getParameter("P4");
            s7 = req.getParameter("P5");
            s8 = req.getParameter("P6");

            Statement stmt1 = null;
            int a = 0, a1 = 1, a2 = 1, a3 = 1, a4 = 1, a5 = 1, a6 = 1, a7 = 1, a8 = 1, a11 = 1, a12 = 1, a13 = 1, a14 = 1, a15 = 1, a16 = 1;
            int a21 = 1, a22 = 1, a23 = 1, a24 = 1, a25 = 1, a26 = 1, a31 = 1, a32 = 1, a33 = 1, a34 = 1, a35 = 1, a36 = 1;
            int t1 = 0, t2 = 0, t3 = 0, t4 = 0, t5 = 0, t6 = 0;
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bridge", "root", "root");
            stmt1 = con.createStatement();
            P.println("connected and statement created");
            ResultSet rs = null;
            if (!s8.isEmpty()) {
                String s0 = s2 + '_' + s3;
                String s01 = s2 + '_' + s4;
                String s02 = s2 + '_' + s5;
                String s03 = s2 + '_' + s6;
                String s04 = s2 + '_' + s7;
                String s05 = s2 + '_' + s8;
                String q = "insert into actidysgraphia values('" + s1 + "','" + s2 + "','" + s0 + "','0','0','0','0','0');";
                String q1 = "insert into actidysgraphia values('" + s1 + "','" + s2 + "','" + s01 + "','0','0','0','0','0');";
                String q2 = "insert into actidysgraphia values('" + s1 + "','" + s2 + "','" + s02 + "','0','0','0','0','0');";
                String q3 = "insert into actidysgraphia values('" + s1 + "','" + s2 + "','" + s03 + "','0','0','0','0','0');";
                String q4 = "insert into actidysgraphia values('" + s1 + "','" + s2 + "','" + s04 + "','0','0','0','0','0');";
                String q5 = "insert into actidysgraphia values('" + s1 + "','" + s2 + "','" + s05 + "','0','0','0','0','0');";

                a6 = stmt1.executeUpdate(q);
                a6 = stmt1.executeUpdate(q1);
                a16 = stmt1.executeUpdate(q2);
                a26 = stmt1.executeUpdate(q3);
                a36 = stmt1.executeUpdate(q4);
                a36 = stmt1.executeUpdate(q5);
            } else if (!s7.isEmpty()) {
                String s0 = s2 + '_' + s3;
                String s01 = s2 + '_' + s4;
                String s02 = s2 + '_' + s5;
                String s03 = s2 + '_' + s6;
                String s04 = s2 + '_' + s7;
                String q = "insert into actidysgraphia values('" + s1 + "','" + s2 + "','" + s0 + "','0','0','0','0','0');";
                String q1 = "insert into actidysgraphia values('" + s1 + "','" + s2 + "','" + s01 + "','0','0','0','0','0');";
                String q2 = "insert into actidysgraphia values('" + s1 + "','" + s2 + "','" + s02 + "','0','0','0','0','0');";
                String q3 = "insert into actidysgraphia values('" + s1 + "','" + s2 + "','" + s03 + "','0','0','0','0','0');";
                String q4 = "insert into actidysgraphia values('" + s1 + "','" + s2 + "','" + s04 + "','0','0','0','0','0');";

                a5 = stmt1.executeUpdate(q);
                a5 = stmt1.executeUpdate(q1);
                a15 = stmt1.executeUpdate(q2);
                a25 = stmt1.executeUpdate(q3);
                a35 = stmt1.executeUpdate(q4);
            } else if (!s6.isEmpty()) {
                String s0 = s2 + '_' + s3;
                String s01 = s2 + '_' + s4;
                String s02 = s2 + '_' + s5;
                String s03 = s2 + '_' + s6;
                String q = "insert into actidyslexia values('" + s1 + "','" + s2 + "','" + s0 + "','0','0','0','0','0');";
                String q1 = "insert into actidyslexia values('" + s1 + "','" + s2 + "','" + s01 + "','0','0','0','0','0');";
                String q2 = "insert into actidyslexia values('" + s1 + "','" + s2 + "','" + s02 + "','0','0','0','0','0');";
                String q3 = "insert into actidyslexia values('" + s1 + "','" + s2 + "','" + s03 + "','0','0','0','0','0');";

                a4 = stmt1.executeUpdate(q);
                a4 = stmt1.executeUpdate(q1);
                a14 = stmt1.executeUpdate(q2);
                a24 = stmt1.executeUpdate(q3);

            } else if (!s5.isEmpty()) {
                String s0 = s2 + '_' + s3;
                String s01 = s2 + '_' + s4;
                String s02 = s2 + '_' + s5;
                String q = "insert into actidysgraphia values('" + s1 + "','" + s2 + "','" + s0 + "','0','0','0','0','0');";
                String q1 = "insert into actidysgraphia values('" + s1 + "','" + s2 + "','" + s01 + "','0','0','0','0','0');";
                String q2 = "insert into actidysgraphia values('" + s1 + "','" + s2 + "','" + s02 + "','0','0','0','0','0');";

                a3 = stmt1.executeUpdate(q);
                a3 = stmt1.executeUpdate(q1);
                a13 = stmt1.executeUpdate(q2);

                t3 = a + a3 + a13;
            } else if (!s4.isEmpty()) {
                String s0 = s2 + '_' + s3;
                String s01 = s2 + '_' + s4;
                String q = "insert into actidysgraphia values('" + s1 + "','" + s2 + "','" + s0 + "','0','0','0','0','0');";
                String q1 = "insert into actidysgraphia values('" + s1 + "','" + s2 + "','" + s01 + "','0','0','0','0','0');";

                a2 = stmt1.executeUpdate(q);
                a2 = stmt1.executeUpdate(q1);

            } else if (!s3.isEmpty()) {
                String s0 = s2 + '_' + s3;
                String q = "insert into actidysgraphia values('" + s1 + "','" + s2 + "','" + s0 + "','0','0','0','0','0');";

                a1 = stmt1.executeUpdate(q);

                System.out.println(a + "'" + a1 + "'" + a11);
                t1 = a + a1 + a11 + a21 + a31;
                System.out.print(t1);
            }

            System.out.println(t1 + "'" + t2 + "'" + t3 + "'" + t4 + "'" + t5 + "'" + t6);

            boolean b = false;
            RequestDispatcher rd = null;
            if (true) {
                b = true;
            }
            if (b) {
                req.setAttribute("name", s1);
                rd = req.getRequestDispatcher("/addeddysgraphia.jsp");
                rd.forward(req, res);
            } else {
                rd = req.getRequestDispatcher("/login.jsp");
                rd.forward(req, res);
            }

        } catch (Exception e) {
            System.out.println("error is" + e);

        }

    }

}
