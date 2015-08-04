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
public class intake8 extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        try {
            PrintWriter P = res.getWriter();
            RequestDispatcher rd = null;
            String s2 = null, s3 = null, s4 = null, s5 = null, s6 = null, s7 = null, s8 = null;
            res.setContentType("Text/html");
            String s1 = req.getParameter("name");
            s2 = req.getParameter("Q1");
            s3 = req.getParameter("Q2");
            s4 = req.getParameter("Q3");
            s5 = req.getParameter("Q4");
            s6 = req.getParameter("Q5");
            s7 = req.getParameter("Q6");
            s8 = req.getParameter("Q7");

            Statement stmt1 = null;

            Class.forName("com.mysql.jdbc.Driver");
            P.println("driver loaded");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bridge", "root", "root");
            stmt1 = con.createStatement();
            P.println("connected and statement created");
            ResultSet rs = null;
            String q1 = "insert into psyquestions values('" + s1 + "','" + s2 + "','" + s3 + "','" + s4 + "','" + s5 + "','" + s6 + "','" + s7 + "','" + s8 + "');";
            P.println(q1);
            int z = stmt1.executeUpdate(q1);
            P.println("query executed");
            boolean b1 = false;

            if (z == 1) {
                b1 = true;
            }
            if (b1) {
                req.setAttribute("name", s1);
                rd = req.getRequestDispatcher("/Blank.jsp");
                rd.forward(req, res);
            } else {
                req.setAttribute("name", s1);
                rd = req.getRequestDispatcher("/intake8.jsp");
                rd.forward(req, res);
            }

        } catch (Exception e) {
            System.out.println("error is" + e);

        }

    }

}
