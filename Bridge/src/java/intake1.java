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
public class intake1 extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        try {
            String s2 = null, s3 = null, s3a = null, s4 = null, s5 = null, s6 = null, s7 = null, s8 = null, s9 = null, s10 = null, s11 = null, s12 = null, s13 = null, s14 = null, s15 = null, s16 = null, s17other = null;

            PrintWriter P = res.getWriter();
            res.setContentType("Text/html");
            String s1 = req.getParameter("Name");
            s2 = req.getParameter("Dob");
            s3 = req.getParameter("Sex");
            s3a = req.getParameter("Agegroup");
            s4 = req.getParameter("Address");
            s5 = req.getParameter("Residence");
            s6 = req.getParameter("Office");
            s7 = req.getParameter("Mobile");
            s8 = req.getParameter("Board");
            s9 = req.getParameter("Medium");
            s10 = req.getParameter("Income");
            s11 = req.getParameter("Maths");
            s12 = req.getParameter("Social");
            s13 = req.getParameter("Science");
            s14 = req.getParameter("First Language");
            s15 = req.getParameter("Second Language");
            s16 = req.getParameter("Third Language");

            Statement stmt1 = null;

            Class.forName("com.mysql.jdbc.Driver");
//P.println("driver loaded");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bridge", "root", "root");
            stmt1 = con.createStatement();
            P.println("connected and statement created");
            ResultSet rs = null;
            String q = "insert into generaldetails values('" + s1 + "','" + s2 + "','" + s3 + "','" + s3a + "','" + s4 + "','" + s5 + "','" + s6 + "','" + s7 + "','" + s8 + "','" + s9 + "','" + s10 + "','" + s11 + "','" + s12 + "','" + s13 + "','" + s14 + "','" + s15 + "','" + s16 + "','null','null','null','null','null','null','null','null','null','null','null','null','null','null','null','null','null','null','null','null','null','null');";
            P.println("query......" + q);
            int a = stmt1.executeUpdate(q);

            P.println("query executed");

            boolean b = false;
            RequestDispatcher rd = null;
            if (a == 1) {
                b = true;
            }
            if (b) {
                req.setAttribute("name", s1);
                rd = req.getRequestDispatcher("/intake2.jsp");
                rd.forward(req, res);
            } else {
                req.setAttribute("name", s1);
                rd = req.getRequestDispatcher("/intake1.jsp");
                rd.forward(req, res);
            }

        } catch (Exception e) {
            System.out.println("error is" + e);

        }

    }

}
