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
public class Addusers extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        try {
            String s1, s21 = null, s22 = null, s2 = null, s3 = null, s3a = null, s4 = null, s5 = null, s6 = null, s7 = null, s8 = null, s9 = null, s10 = null, s11 = null, s12 = null, s13 = null, s15 = null, s16 = null, s17other = null;

            PrintWriter P = res.getWriter();
            res.setContentType("Text/html");
            String name = req.getParameter("user");

            int i;

            int a1 = 0, a2 = 0, a3 = 0, a4 = 0, a5 = 0, a6 = 0;

            Statement stmt = null, stmt1 = null;
            int a = 0;
            Class.forName("com.mysql.jdbc.Driver");
//P.println("driver loaded");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bridge", "root", "root");
            stmt = con.createStatement();
            stmt1 = con.createStatement();
            P.println("connected and statement created");
            ResultSet rs = null;

            String q = "select * from registration where name='" + name + "';";
            rs = stmt.executeQuery(q);
            System.out.println(q);
            while (rs.next()) {
                s1 = rs.getString(1);
                s2 = rs.getString(2);
                s3 = rs.getString(3);
                s4 = rs.getString(4);
                s5 = rs.getString(5);
                s6 = rs.getString(6);
                s7 = rs.getString(7);
                s8 = rs.getString(8);
                s9 = rs.getString(9);
                s10 = rs.getString(10);
                s11 = rs.getString(11);
                s12 = rs.getString(12);

            }

            String q1 = "insert into psydetails values('" + name + "','" + s2 + "','" + s3 + "','" + s4 + "','" + s5 + "','" + s6 + "','" + s7 + "','" + s8 + "','" + s9 + "','" + s10 + "','" + s11 + "','" + s12 + "');";
            System.out.println("query......" + q1);
            a = stmt1.executeUpdate(q1);
            System.out.println("a=" + a);

            String q3 = "select Exp from regexperience where name='" + name + "';";
            rs = stmt.executeQuery(q3);
            while (rs.next()) {
                s11 = rs.getString(1);

                String q4 = "insert into psyexperience values('" + name + "','" + s11 + "');";
                System.out.println("query......" + q4);
                a1 = stmt1.executeUpdate(q4);
                System.out.println("a1=" + a1);

            }
            String q5 = "select Interest from reginterest where name='" + name + "';";
            rs = stmt.executeQuery(q5);
            while (rs.next()) {
                s21 = rs.getString(1);

                String q6 = "insert into psyinterest values('" + name + "','" + s21 + "');";
                System.out.println("query......" + q6);
                a2 = stmt1.executeUpdate(q6);
                System.out.println("a2=" + a2);
            }

            System.out.println("done");
            String q2 = "delete from registration where name='" + name + "'";
            System.out.println("query......" + q2);
            a4 = stmt.executeUpdate(q2);
            System.out.println("a4=" + a4);
            P.println("query executed");
            String q7 = "delete from regexperience where name='" + name + "'";
            System.out.println("query......" + q7);
            a5 = stmt.executeUpdate(q7);
            System.out.println("a5=" + a5);
            String q8 = "delete from reginterest where name='" + name + "'";
            System.out.println("query......" + q8);
            a6 = stmt.executeUpdate(q8);
            System.out.println("a6=" + a6);
            System.out.println("All done");

            boolean b = false;
            RequestDispatcher rd = null;
            if (a > 0 && a1 > 0 && a2 > 0 && a4 > 0 && a5 > 0 && a6 > 0) {
                b = true;
            }
            if (b) {
                req.setAttribute("name", name);
                rd = req.getRequestDispatcher("/Blank.jsp");
                rd.forward(req, res);
            } else {
                req.setAttribute("name", name);
                rd = req.getRequestDispatcher("/login.jsp");
                rd.forward(req, res);
            }

        } catch (Exception e) {
            System.out.println("error is" + e);

        }

    }

}
