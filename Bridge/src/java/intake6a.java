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
public class intake6a extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        try {
            PrintWriter P = res.getWriter();
            RequestDispatcher rd = null;

            res.setContentType("Text/html");
            String s1 = req.getParameter("name");
            String s2 = req.getParameter("parentchild");

            Statement stmt1 = null;

            Class.forName("com.mysql.jdbc.Driver");
            P.println("driver loaded");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bridge", "root", "root");
            stmt1 = con.createStatement();
            P.println("connected and statement created");
            ResultSet rs = null;
            String q1 = "update familyhistory set PARENT_CHILD_RELATIONSHIP='" + s2 + "' where NAME='" + s1 + "';";
            P.println(q1);
            int z = stmt1.executeUpdate(q1);
            P.println("query executed");
            boolean b1 = false;

            if (z == 1) {
                b1 = true;
            }
            if (b1) {
                req.setAttribute("name", s1);
                rd = req.getRequestDispatcher("/intake7.jsp");
                rd.forward(req, res);
            } else {
                req.setAttribute("name", s1);
                rd = req.getRequestDispatcher("/intake6.jsp");
                rd.forward(req, res);
            }

        } catch (Exception e) {
            System.out.println("error is" + e);

        }

    }

}
