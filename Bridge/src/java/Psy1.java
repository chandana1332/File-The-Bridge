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
public class Psy1 extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        try {

            PrintWriter P = res.getWriter();
            res.setContentType("Text/html");
            String username = req.getParameter("username");
            String s1 = req.getParameter("name");
            boolean flag = false;

            Statement stmt1 = null;
            P.println(s1);
            Class.forName("com.mysql.jdbc.Driver");
//P.println("driver loaded");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bridge", "root", "root");
            stmt1 = con.createStatement();
            P.println("connected and statement created");
            ResultSet rs1 = null, rs2 = null;
            RequestDispatcher rd = null;

            String q = "select name from generaldetails where NAME LIKE '" + s1 + "%';";
            P.println("query......" + q);
            rs1 = stmt1.executeQuery(q);

            P.println("query executed");

            if (rs1.next()) {
                flag = true;

                req.setAttribute("name", s1);
                rd = req.getRequestDispatcher("/showresult.jsp");
                rd.forward(req, res);
            }
            if (!flag) {
                req.setAttribute("name", s1);
                rd = req.getRequestDispatcher("/Psy1.jsp");
                rd.forward(req, res);

            }

        } catch (Exception e) {
            System.out.println("error is" + e);

        }

    }

}
