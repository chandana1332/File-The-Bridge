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
public class adhdselect extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        try {
            String s2 = null;
            PrintWriter P = res.getWriter();
            res.setContentType("Text/html");

            String s1 = req.getParameter("user");

            String y = "YES";
            Statement stmt1 = null;
            P.println(s1);
            Class.forName("com.mysql.jdbc.Driver");
//P.println("driver loaded");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bridge", "root", "root");
            stmt1 = con.createStatement();
            P.println("connected and statement created");
            ResultSet rs = null;
            RequestDispatcher rd = null;

            String q = "select ADHD from generaldetails where NAME='" + s1 + "';";
            P.println("query......" + q);
            rs = stmt1.executeQuery(q);
            P.println("query executed");
            while (rs.next()) {
                s2 = rs.getString(1);
            }
            P.println(s2);
            if (y.equalsIgnoreCase(s2)) {
                P.println(y);
                req.setAttribute("name", s1);
                rd = req.getRequestDispatcher("/adhdselect.jsp");
                rd.forward(req, res);
            } else {
                P.println("n");
                req.setAttribute("name", s1);
                rd = req.getRequestDispatcher("/blank.jsp");
                rd.forward(req, res);

            }

        } catch (Exception e) {
            System.out.println("error is" + e);

        }

    }

}
