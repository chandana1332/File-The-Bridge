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
public class intake6 extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        try {
            PrintWriter P = res.getWriter();

            String type = null;
            String t1 = null, t2 = null, t3 = null, t4 = null;
            int i = 0, a = 0, b = 0, c = 0, d = 0;
            RequestDispatcher rd = null;

            res.setContentType("Text/html");
            String name = req.getParameter("name");
            String[] sym = req.getParameterValues("sym");

            int ssize = sym.length;
            P.println(ssize);
            for (i = 0; i < ssize; i++) {
                if (sym[i].equalsIgnoreCase("1")) {
                    a++;
                }
            }

            for (i = 0; i < ssize; i++) {
                if (sym[i].equalsIgnoreCase("2")) {
                    b++;
                }
            }
            for (i = 0; i < ssize; i++) {
                if (sym[i].equalsIgnoreCase("3")) {
                    c++;
                }
            }

            for (i = 0; i < ssize; i++) {
                if (sym[i].equalsIgnoreCase("4")) {
                    d++;
                }
            }
            P.println(a);
            P.println(b);
            P.println(c);
            P.println(d);

            if (a >= 2) {
                t1 = "Conducive relationship";
                type = t1;

            }
            if (b >= 2) {
                t2 = "Verbal abuse";
                type = t2;

            }
            if (c >= 2) {
                t3 = "Neglect";
                type = t3;
            }
            if (d >= 1) {
                t4 = "Domestic violence";
                type = t4;

            }

            if (((a >= 2) && (b >= 2)) || ((a >= 2) && (c >= 2)) || ((a >= 2) && (d >= 1)) || ((b >= 2) && (c >= 2)) || ((b >= 2) && (d >= 1)) || ((c >= 2) && (d >= 1))) {
                req.setAttribute("t1", t1);
                req.setAttribute("t2", t2);
                req.setAttribute("t3", t3);
                req.setAttribute("t4", t4);
                req.setAttribute("name", name);
                P.println("d");
                rd = req.getRequestDispatcher("/intake6a.jsp");
                rd.forward(req, res);
            }

            Statement stmt1 = null;

            Class.forName("com.mysql.jdbc.Driver");
            P.println("driver loaded");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bridge", "root", "root");
            stmt1 = con.createStatement();
            P.println("connected and statement created");
            ResultSet rs = null;
            String q1 = "update familyhistory set PARENT_CHILD_RELATIONSHIP='" + type + "' where NAME='" + name + "';";
            P.println(q1);
            int z = stmt1.executeUpdate(q1);
            P.println("query executed");
            boolean b1 = false;

            if (z == 1) {
                b1 = true;
            }
            if (b1) {
                req.setAttribute("name", name);
                rd = req.getRequestDispatcher("/intake7.jsp");
                rd.forward(req, res);
            } else {
                req.setAttribute("name", name);
                rd = req.getRequestDispatcher("/intake6.jsp");
                rd.forward(req, res);
            }

        } catch (Exception e) {
            System.out.println("error is" + e);

        }

    }

}
