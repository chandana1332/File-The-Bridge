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
public class intake2 extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        try {
            PrintWriter P = res.getWriter();
            res.setContentType("Text/html");
            int i = 0, a1 = 0, a2 = 0, a3 = 0, a4 = 0, a5 = 0, size1 = 0, size2 = 0, size3 = 0, size4 = 0;
            String s21 = null, s22 = null, s23 = null, s24 = null, s25 = null, s26 = null, s27 = null;
            String s1 = req.getParameter("name");
            String[] s17 = req.getParameterValues("Informant");
            size1 = s17.length;
            P.println("Size of array...." + size1);
            if (size1 != 0) {
                for (i = 0; i < size1; i++) {
                    if (s17[i].equalsIgnoreCase("other")) {
                        s17[i] = req.getParameter("otherInformant");
                        P.println("value of chbx array...." + s17[i]);
                    }

                }

            } else {
                s17[i] = "qamar";
                P.println("else value...." + s17[i]);
            }
            String[] s18 = req.getParameterValues("Referred");
            size2 = s18.length;
            if (size2 != 0) {

                for (i = 0; i < size2; i++) {
                    if (s18[i].equalsIgnoreCase("Local Medical Consultant")) {
                        s18[i] = req.getParameter("NameofLocalConsultant");
                    }
                }
            }
            String[] s19 = req.getParameterValues("ReasonsReferred");
            size3 = s19.length;
            String[] s20 = req.getParameterValues("Otherprobs");
            size4 = s20.length;

            s21 = req.getParameter("Fathersname");
            s22 = req.getParameter("Foccupation");
            s23 = req.getParameter("Feducation");
            s24 = req.getParameter("Mothersname");
            s25 = req.getParameter("Moccupation");
            s26 = req.getParameter("Meducation");
            s27 = req.getParameter("Caretaker");
            Statement stmt1 = null;

            Class.forName("com.mysql.jdbc.Driver");
//P.println("driver loaded");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bridge", "root", "root");
            stmt1 = con.createStatement();
            P.println("connected and statement created");
            ResultSet rs = null;
            if (size1 != 0) {
                for (i = 0; i < size1; i++) {
                    String q1 = "insert into informant values('" + s1 + "','" + s17[i] + "');";
                    P.println(q1);
                    a1 = stmt1.executeUpdate(q1);
                }
            } else {
                String q1 = "insert into informant values('" + s1 + "','null');";
                P.println(q1);
                a1 = stmt1.executeUpdate(q1);
            }

            if (size2 > 0) {
                for (i = 0; i < size2; i++) {
                    String q2 = "insert into referred values('" + s1 + "','" + s18[i] + "');";
                    P.println(q2);
                    a2 = stmt1.executeUpdate(q2);
                }
            } else {
                String q1 = "insert into referred values('" + s1 + "','null');";
                P.println(q1);
                a1 = stmt1.executeUpdate(q1);
            }

            if (size3 > 0) {
                for (i = 0; i < size3; i++) {
                    String q3 = "insert into reasonsreferred values('" + s1 + "','" + s19[i] + "');";
                    P.println(q3);
                    a3 = stmt1.executeUpdate(q3);
                }
            } else {
                String q3 = "insert into reasonsreferred values('" + s1 + "','null');";
                P.println(q3);
                a3 = stmt1.executeUpdate(q3);
            }

            if (size4 > 0) {
                for (i = 0; i < size4; i++) {
                    String q4 = "insert into otherprobs values('" + s1 + "','" + s20[i] + "');";
                    P.println(q4);
                    a4 = stmt1.executeUpdate(q4);
                }
            } else {
                String q4 = "insert into otherprobs values('" + s1 + "','null');";
                P.println(q4);
                a4 = stmt1.executeUpdate(q4);
            }

            String q5 = "update generaldetails set FATHER_NAME='" + s21 + "',FATHER_OCCUPATION='" + s22 + "',FATHER_EDU='" + s23 + "',MOTHER_NAME='" + s24 + "',MOTHER_OCCUPATION='" + s25 + "',MOTHER_EDU='" + s26 + "',CARETAKER='" + s27 + "' where NAME='" + s1 + "';";
            P.println(q5);
            a5 = stmt1.executeUpdate(q5);

            P.println("query executed");

            boolean b = false;
            RequestDispatcher rd = null;
            if (a1 == 1 && a2 == 1 && a3 == 1 && a4 == 1 && a5 == 1) {
                b = true;
            }
            if (b) {
                req.setAttribute("name", s1);
                rd = req.getRequestDispatcher("/intake3.jsp");
                rd.forward(req, res);
            } else {
                req.setAttribute("name", s1);
                rd = req.getRequestDispatcher("/intake2.jsp");
                rd.forward(req, res);
            }

        } catch (Exception e) {
            System.out.println("error is" + e);

        }

    }

}
