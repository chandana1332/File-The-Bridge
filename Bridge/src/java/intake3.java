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
public class intake3 extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        try {
            PrintWriter P = res.getWriter();
            res.setContentType("Text/html");
            String s1 = null, s2 = null, s3 = null, s4 = null, s5 = null, s6 = null, s7 = null, s8 = null, s9 = null, s10 = null, s11 = null, s12 = null;
            s1 = req.getParameter("name");
            s2 = req.getParameter("typeofdelivery");
            s3 = req.getParameter("BirthAsphyxia");
            s4 = req.getParameter("Ageholdneck");
            s5 = req.getParameter("agesitsupport");
            s6 = req.getParameter("agewalksupport");
            s7 = req.getParameter("agefirstwords");
            s8 = req.getParameter("growth");
            s9 = req.getParameter("Neuroticsymptoms");
            s10 = req.getParameter("illnesschildhood");
            s11 = req.getParameter("effectdevelopment");
            s12 = req.getParameter("gameschildhood");
            String age = null, g1 = "3-6", g2 = "6-10";

            String s1a = null;
            Statement stmt1 = null;
            ResultSet rs = null;
            Class.forName("com.mysql.jdbc.Driver");
//P.println("driver loaded");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bridge", "root", "root");
            stmt1 = con.createStatement();
            P.println("connected and statement created");

            String q1 = "update generaldetails set TYPEOFDELIVARY='" + s2 + "',BIRTH_ASPHYXIA='" + s3 + "',AGE_THE_CHILD_HELD_NECK='" + s4 + "',AGE_THE_CHILD_SAT_WITH_SUPPORT='" + s5 + "',AGE_THE_CHILD_WALKED_WITH_SUPPORT='" + s6 + "',AGE_THE_CHILD_UTTERED_FIRST_WORDS='" + s7 + "',GROWTH='" + s8 + "',NEUROTIC_SYMPTOMS='" + s9 + "',ANY_PHYSICAL_ILLNESS_DURING_CHILDHOOD='" + s10 + "',ANY_EFFECT_OF_ILLNESS_ON_DEVELOPMENT='" + s11 + "',TYPE_OF_SPONTANEOUS_GAMES_DURING_CHILDHOOD='" + s12 + "' where NAME='" + s1 + "';";
            P.println(q1);
            int a = stmt1.executeUpdate(q1);

            P.println("query executed");

            boolean b = false;
            RequestDispatcher rd = null;
            if (a == 1) {
                b = true;
            }
            if (b) {
                String q2 = "select AGEGROUP from generaldetails where NAME='" + s1 + "';";
                rs = stmt1.executeQuery(q2);
                System.out.println(q2);

                while (rs.next()) {
                    age = rs.getString(1);
                }
                if (age.equalsIgnoreCase(g1) || age.equalsIgnoreCase(g2)) {
                    req.setAttribute("name", s1);
                    rd = req.getRequestDispatcher("/intake4adhd.jsp");
                    rd.forward(req, res);

                } else {
                    req.setAttribute("name", s1);
                    rd = req.getRequestDispatcher("/intake5.jsp");
                    rd.forward(req, res);
                }

            } else {
                req.setAttribute("name", s1);
                rd = req.getRequestDispatcher("/intake3.jsp");
                rd.forward(req, res);
            }

        } catch (Exception e) {
            System.out.println("error is" + e);

        }

    }

}
