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
public class intake7 extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        try {
            PrintWriter P = res.getWriter();
            RequestDispatcher rd = null;
            int size1 = 0;
            String[] prob = null;
            res.setContentType("Text/html");
            String s1 = req.getParameter("name");
            String s2 = req.getParameter("healthprob");
            if (s2.equalsIgnoreCase("Unhealthy")) {
                prob = req.getParameterValues("prob");
                size1 = prob.length;
            }
            String[] mental = req.getParameterValues("mentalill");
            String s3 = req.getParameter("criminality");
            String[] famstrength = req.getParameterValues("famstrength");

            int i = 0, a1 = 0, a2 = 0, a3 = 0, a4 = 0, a5 = 0;
            int size2 = mental.length;
            int size3 = famstrength.length;
            Statement stmt1 = null;

            Class.forName("com.mysql.jdbc.Driver");
            P.println("driver loaded");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bridge", "root", "root");
            stmt1 = con.createStatement();
            P.println("connected and statement created");
            ResultSet rs = null;
            if (s2.equalsIgnoreCase("Unhealthy")) {
                for (i = 0; i < size1; i++) {
                    String q1 = "insert into health values('" + s1 + "','" + s2 + "','" + prob[i] + "');";
                    P.println(q1);
                    a1 = stmt1.executeUpdate(q1);
                }
            } else {
                String q1 = "insert into health values('" + s1 + "','" + s2 + "','null');";
                P.println(q1);
                a1 = stmt1.executeUpdate(q1);

            }
            for (i = 0; i < size2; i++) {
                String q2 = "insert into mental values('" + s1 + "','" + mental[i] + "');";
                P.println(q2);
                a2 = stmt1.executeUpdate(q2);
            }
            String q3 = "update familyhistory set PARENTAL_CRIMINALITY='" + s3 + "' where NAME='" + s1 + "';";
            P.println(q3);
            a3 = stmt1.executeUpdate(q3);
            for (i = 0; i < size3; i++) {
                String q2 = "insert into familystrength values('" + s1 + "','" + famstrength[i] + "');";
                P.println(q2);
                a4 = stmt1.executeUpdate(q2);
            }
            P.println("query executed");
            boolean b1 = false;

            if (a1 == 1 && a2 == 1 && a3 == 1 && a4 == 1) {
                b1 = true;
            }
            if (b1) {
                req.setAttribute("name", s1);
                rd = req.getRequestDispatcher("/intake8.jsp");
                rd.forward(req, res);
            } else {
                req.setAttribute("name", s1);
                rd = req.getRequestDispatcher("/intake7.jsp");
                rd.forward(req, res);
            }

        } catch (Exception e) {
            System.out.println("error is" + e);

        }

    }

}
