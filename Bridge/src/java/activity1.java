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
public class activity1 extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        try {
            String s17 = null, s18 = null, s19 = null, s20 = null, s21 = null, s2 = null, s3 = null, s3a = null, s4 = null, s5 = null, s6 = null, s7 = null, s8 = null, s9 = null, s10 = null, s11 = null, s12 = null, s13 = null, s14 = null, s15 = null, s16 = null, s17other = null;
            String s1 = null, session = null;
            PrintWriter P = res.getWriter();
            res.setContentType("Text/html");
            String name = req.getParameter("name");
            String s[] = new String[80];
            String m[] = new String[80];
            String t[] = new String[80];
            String r[] = new String[80];
            Statement stmt = null;
            String zero = "0";
            String eleven = "10";
            String tt = "20";
            int a = 0;
            int succ = 0;
            int i = 0, j = 0, w = 0, p = 0, l = 0, z = 0, k = 0;
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bridge", "root", "root");
            stmt = con.createStatement();
            P.println("connected and statement created");
            ResultSet rs = null;
            String val[] = new String[100];
            String n[] = new String[100];
            String q = "select DISTINCT ACTIVITY from acti where NAME='" + name + "';";
            rs = stmt.executeQuery(q);
            System.out.println(q);
            while (rs.next()) {
                s[i] = rs.getString(1);
                System.out.println(s[i]);

                i++;
            }

            for (w = 0; w < i; w++) {
                j = 0;

                String q1 = "select PARAMETERS,NUMBER_OF_TIMES from acti where activity='" + s[w] + "';";
                rs = stmt.executeQuery(q1);
                System.out.println(q1);

                while (rs.next()) {
                    m[j] = rs.getString(1);
                    n[j] = rs.getString(2);

                    System.out.println(m[j]);

                    j++;
                }
                for (k = 0; k < j; k++) {

                    val[k] = req.getParameter(s[w] + '_' + m[k]);
                    System.out.println(val[k]);

                }
                for (k = 0; k < j; k++) {
                    if (n[k].equalsIgnoreCase(zero)) {
                        System.out.println("zero");
                        String q2 = "update acti set VAL1='" + val[k] + "',RECENT_VAL='" + val[k] + "',NUMBER_OF_TIMES=NUMBER_OF_TIMES+1 where NAME='" + name + "' and ACTIVITY='" + s[w] + "' and PARAMETERS='" + m[k] + "'";
                        System.out.println(q2);
                        succ = stmt.executeUpdate(q2);

                    } else if (n[k].equalsIgnoreCase(eleven)) {
                        String q2 = "update acti set VAL11='" + val[k] + "',RECENT_VAL='" + val[k] + "',NUMBER_OF_TIMES=NUMBER_OF_TIMES+1 where NAME='" + name + "' and ACTIVITY='" + s[w] + "' and PARAMETERS='" + m[k] + "'";
                        System.out.println(q2);
                        succ = stmt.executeUpdate(q2);

                    } else if (n[k].equalsIgnoreCase(tt)) {
                        String q2 = "update acti set VAL21='" + val[k] + "',RECENT_VAL='" + val[k] + "',NUMBER_OF_TIMES=NUMBER_OF_TIMES+1 where NAME='" + name + "' and ACTIVITY='" + s[w] + "' and PARAMETERS='" + m[k] + "'";
                        System.out.println(q2);
                        succ = stmt.executeUpdate(q2);

                    } else {
                        String q2 = "update acti set RECENT_VAL='" + val[k] + "',NUMBER_OF_TIMES=NUMBER_OF_TIMES+1 where NAME='" + name + "' and ACTIVITY='" + s[w] + "' and PARAMETERS='" + m[k] + "'";
                        System.out.println(q2);
                        succ = stmt.executeUpdate(q2);

                    }
                }
            }
            boolean b = false;
            RequestDispatcher rd = null;
            if (succ == 1) {
                b = true;
            }
            if (b) {
                req.setAttribute("name", name);
                rd = req.getRequestDispatcher("/updated.jsp");
                rd.forward(req, res);
            } else {
                req.setAttribute("name", s1);
                rd = req.getRequestDispatcher("/login.jsp");
                rd.forward(req, res);
            }

        } catch (Exception e) {
            System.out.println("error is" + e);

        }

    }

}
