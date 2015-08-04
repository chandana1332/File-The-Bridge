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
public class Registration extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        try {
            String s11a = null, s2 = null, s3 = null, s3a = null, s4 = null, s5 = null, s6 = null, s7 = null, s8 = null, s9 = null, s10 = null, s12 = null, s13 = null, s15 = null, s16 = null, s17other = null;

            PrintWriter P = res.getWriter();
            res.setContentType("Text/html");
            String s1 = req.getParameter("Name");
            s2 = req.getParameter("Sex");
            s3 = req.getParameter("Qualification");
            s4 = req.getParameter("AOS");
            s5 = req.getParameter("Address");
            s6 = req.getParameter("Mobile");
            s7 = req.getParameter("Email");
            s8 = req.getParameter("Why_Psychology");
            s9 = req.getParameter("WANT_TO_DO_AS_Psy");
            s10 = req.getParameter("Intervention");
            String[] s11 = req.getParameterValues("Exp");
            s11a = req.getParameter("Address");
            String[] s14 = req.getParameterValues("Interest");
            s12 = req.getParameter("Training");
            s13 = req.getParameter("Further_Training");

            int i;
            int size1 = s11.length;
            int size2 = s14.length;
            int a1 = 0, a2 = 0;

            Statement stmt1 = null;

            Class.forName("com.mysql.jdbc.Driver");
//P.println("driver loaded");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bridge", "root", "root");
            stmt1 = con.createStatement();
            P.println("connected and statement created");
            ResultSet rs = null;
            String q = "insert into registration values('" + s1 + "','" + s2 + "','" + s3 + "','" + s4 + "','" + s5 + "','" + s6 + "','" + s7 + "','" + s8 + "','" + s9 + "','" + s10 + "','" + s11a + "','" + s12 + "','" + s13 + "');";
            P.println("query......" + q);
            int a = stmt1.executeUpdate(q);
            for (i = 0; i < size1; i++) {
                String q1 = "insert into regexperience values('" + s1 + "','" + s11[i] + "')";
                a1 = stmt1.executeUpdate(q1);
            }

            for (i = 0; i < size2; i++) {
                String q2 = "insert into reginterest values('" + s1 + "','" + s14[i] + "')";
                a2 = stmt1.executeUpdate(q2);
            }

            P.println("query executed");

            boolean b = false;
            RequestDispatcher rd = null;
            if (a == 1 && a1 == 1 && a2 == 1) {
                b = true;
            }
            if (b) {
                req.setAttribute("name", s1);
                rd = req.getRequestDispatcher("/Blank.jsp");
                rd.forward(req, res);
            } else {
                req.setAttribute("name", s1);
                rd = req.getRequestDispatcher("/registration.jsp");
                rd.forward(req, res);
            }

        } catch (Exception e) {
            System.out.println("error is" + e);

        }

    }

}
