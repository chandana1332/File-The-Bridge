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
public class Deleteusers extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        try {

            PrintWriter P = res.getWriter();
            res.setContentType("Text/html");
            String name = req.getParameter("user");

            Statement stmt = null, stmt1 = null;
            int a1 = 0, a2 = 0, a3 = 0;
            Class.forName("com.mysql.jdbc.Driver");
//P.println("driver loaded");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bridge", "root", "root");
            stmt = con.createStatement();

            P.println("connected and statement created");
            ResultSet rs = null;
            String q2 = "delete from registration where name='" + name + "'";
            System.out.println("query......" + q2);
            a1 = stmt.executeUpdate(q2);
            System.out.println("a1=" + a1);
            P.println("query executed");
            String q7 = "delete from regexperience where name='" + name + "'";
            System.out.println("query......" + q7);
            a2 = stmt.executeUpdate(q7);
            System.out.println("a2=" + a2);
            String q8 = "delete from reginterest where name='" + name + "'";
            System.out.println("query......" + q8);
            a3 = stmt.executeUpdate(q8);
            System.out.println("a3=" + a3);
            System.out.println("All done");

            boolean b = false;
            RequestDispatcher rd = null;
            if (a1 > 0 && a2 > 0 && a3 > 0) {
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
