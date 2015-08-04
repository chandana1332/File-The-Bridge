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
public class login extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        try {

            PrintWriter P = res.getWriter();
            res.setContentType("Text/html");
            String s1 = req.getParameter("user");
            String s2 = req.getParameter("pass");
            String s3 = req.getParameter("type");
            String p = "Psychologist";
            String m = "Mentor";
            Statement stmt1 = null;
            P.println(s1 + s2 + s3);
            Class.forName("com.mysql.jdbc.Driver");
//P.println("driver loaded");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bridge", "root", "root");
            stmt1 = con.createStatement();
            P.println("connected and statement created");
            ResultSet rs1 = null, rs2 = null;
            RequestDispatcher rd = null;
            if (s3.equalsIgnoreCase(p)) {
                String q = "select name from psychologist where NAME='" + s1 + "' and PASSWORD='" + s2 + "';";
                P.println("query......" + q);
                rs1 = stmt1.executeQuery(q);
                if (rs1.next()) {
                    req.setAttribute("username", s1);
                    rd = req.getRequestDispatcher("/Psy1.jsp");
                    rd.forward(req, res);

                } else {
                    rd = req.getRequestDispatcher("/login.jsp");
                    rd.forward(req, res);
                }
            } else if (s3.equalsIgnoreCase(m)) {
                String q = "select name from mentor where NAME='" + s1 + "' and PASSWORD='" + s2 + "';";
                P.println("query......" + q);
                rs2 = stmt1.executeQuery(q);
                if (rs2.next()) {
                    req.setAttribute("username", s1);
                    rd = req.getRequestDispatcher("/men1.jsp");
                    rd.forward(req, res);
                } else {
                    rd = req.getRequestDispatcher("/login.jsp");
                    rd.forward(req, res);
                }
            } else {
                rd = req.getRequestDispatcher("/login.jsp");
                rd.forward(req, res);
            }

            P.println("query executed");

        } catch (Exception e) {
            System.out.println("error is" + e);

        }

    }

}
