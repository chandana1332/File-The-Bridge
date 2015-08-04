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
public class intake5 extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        try {
            String s1 = null, s2 = null;
            RequestDispatcher rd = null;
            PrintWriter P = res.getWriter();
            res.setContentType("Text/html");
            s1 = req.getParameter("name");
            s2 = req.getParameter("Parenting");
            int s3 = Integer.parseInt(req.getParameter("Parentingstyle1"));
            int s4 = Integer.parseInt(req.getParameter("Parentingstyle2"));
            int s5 = Integer.parseInt(req.getParameter("Parentingstyle3"));
            int s6 = Integer.parseInt(req.getParameter("Parentingstyle4"));

            String s7 = req.getParameter("Parentchildrelation");
            String SS = "nn";

            if (((s3 == 1) && (s4 == 1) && (s5 == 1) && (s6 == 1)) || ((s3 == 1) && (s4 == 1) && (s5 == 1)) || ((s3 == 1) && (s4 == 1) && (s6 == 1)) || ((s3 == 1) && (s5 == 1) && (s6 == 1)) || (s4 == 1) && (s5 == 1) && (s6 == 1)) {
                SS = "Permissive parents";
            } else if (((s3 == 2) && (s4 == 2) && (s5 == 2) && (s6 == 2)) || ((s3 == 2) && (s4 == 2) && (s5 == 2)) || ((s3 == 2) && (s4 == 2) && (s6 == 2)) || ((s3 == 2) && (s5 == 2) && (s6 == 2)) || (s4 == 2) && (s5 == 2) && (s6 == 2)) {
                SS = "Authoritarian parents";
            } else if (((s3 == 3) && (s4 == 3) && (s5 == 3) && (s6 == 3)) || ((s3 == 3) && (s4 == 3) && (s5 == 3)) || ((s3 == 3) && (s4 == 3) && (s6 == 3)) || ((s3 == 3) && (s5 == 3) && (s6 == 3)) || (s4 == 3) && (s5 == 3) && (s6 == 3)) {
                SS = "Democratic parents";
            } else if (((s3 == 1) && (s4 == 1)) || ((s4 == 1) && (s5 == 1)) || ((s5 == 1) && (s6 == 1)) || ((s6 == 1) && (s3 == 1)) || ((s4 == 1) && (s6 == 1)) || ((s3 == 1) && (s5 == 1))) {
                if (((s3 == 2) && (s4 == 2)) || ((s4 == 2) && (s5 == 2)) || ((s5 == 2) && (s6 == 2)) || ((s6 == 2) && (s3 == 2)) || ((s4 == 1) && (s6 == 1)) || ((s3 == 1) && (s5 == 1))) {
                    req.setAttribute("parenting", s2);
                    req.setAttribute("name", s1);
                    req.setAttribute("type1", "Permissive parents");
                    req.setAttribute("type2", "Authoritarian parents");
                    rd = req.getRequestDispatcher("/intake5a.jsp");
                    rd.forward(req, res);
                } else if (((s3 == 3) && (s4 == 3)) || ((s4 == 3) && (s5 == 3)) || ((s5 == 3) && (s6 == 3)) || ((s6 == 3) && (s3 == 3)) || ((s4 == 3) && (s6 == 3)) || ((s3 == 3) && (s5 == 3))) {
                    req.setAttribute("parenting", s2);
                    req.setAttribute("name", s1);
                    req.setAttribute("type1", "Permissive parents");
                    req.setAttribute("type2", "Democratic parents");
                    rd = req.getRequestDispatcher("/intake5a.jsp");
                    rd.forward(req, res);
                } else {
                    SS = "Permissive parents";
                }

            } else if (((s3 == 2) && (s4 == 2)) || ((s4 == 2) && (s5 == 2)) || ((s5 == 2) && (s6 == 2)) || ((s6 == 2) && (s3 == 2)) || ((s4 == 2) && (s6 == 2)) || ((s3 == 2) && (s5 == 2))) {
                if (((s3 == 3) && (s4 == 3)) || ((s4 == 3) && (s5 == 3)) || ((s5 == 3) && (s6 == 3)) || ((s6 == 3) && (s3 == 3)) || ((s4 == 3) && (s6 == 3)) || ((s3 == 3) && (s5 == 3))) {
                    req.setAttribute("parenting", s2);
                    req.setAttribute("name", s1);
                    req.setAttribute("type1", "Authoritarian parents");
                    req.setAttribute("type2", "Democratic parents");
                    rd = req.getRequestDispatcher("/intake5a.jsp");
                    rd.forward(req, res);
                } else {
                    SS = "Authoritarian parents";
                }
            } else if (((s3 == 3) && (s4 == 3)) || ((s4 == 3) && (s5 == 3)) || ((s5 == 3) && (s6 == 3)) || ((s6 == 3) && (s3 == 3)) || ((s4 == 3) && (s6 == 3)) || ((s3 == 3) && (s5 == 3))) {
                SS = "Democratic parents";
            }

            Statement stmt1 = null;

            Class.forName("com.mysql.jdbc.Driver");
            P.println("driver loaded");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bridge", "root", "root");
            stmt1 = con.createStatement();
            P.println("connected and statement created");
            ResultSet rs = null;
            String q1 = "insert into familyhistory values('" + s1 + "','" + s2 + "','" + SS + "','null','null');";
            P.println(q1);
            int a = stmt1.executeUpdate(q1);
            P.println("query executed");
            boolean b = false;

            if (a == 1) {
                b = true;
            }
            if (b) {
                req.setAttribute("name", s1);
                rd = req.getRequestDispatcher("/intake6.jsp");
                rd.forward(req, res);
            } else {
                req.setAttribute("name", s1);
                rd = req.getRequestDispatcher("/intake5.jsp");
                rd.forward(req, res);
            }

        } catch (Exception e) {
            System.out.println("error is" + e);

        }

    }

}
