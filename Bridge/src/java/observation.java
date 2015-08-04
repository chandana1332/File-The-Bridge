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
public class observation extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        try {
            String s17 = null, s18 = null, s19 = null, s20 = null, s21 = null, s2 = null, s3 = null, s3a = null, s4 = null, s5 = null, s6 = null, s7 = null, s8 = null, s9 = null, s10 = null, s11 = null, s12 = null, s13 = null, s14 = null, s15 = null, s16 = null, s17other = null;
            String a1 = null, a2 = null, a3 = null, a4 = null, a5 = null, a6 = null, a7 = null, a8 = null, a9 = null, a10 = null, a11 = null, a12 = null, a13 = null, a14 = null, a15 = null, a16 = null, a17 = null, a18 = null, a19 = null, a20 = null, a21 = null;
            PrintWriter P = res.getWriter();
            res.setContentType("Text/html");
            String s1 = req.getParameter("name");
            s2 = req.getParameter("B1");
            s3 = req.getParameter("T1");
            s4 = req.getParameter("B2");
            s5 = req.getParameter("T2");
            s6 = req.getParameter("B3");
            s7 = req.getParameter("T3");
            s8 = req.getParameter("B4");
            s9 = req.getParameter("T4");
            s10 = req.getParameter("B5");
            s11 = req.getParameter("T5");
            s12 = req.getParameter("B6");
            s13 = req.getParameter("T6");
            s14 = req.getParameter("B7");
            s15 = req.getParameter("T7");
            s16 = req.getParameter("B8");
            s17 = req.getParameter("T8");
            s18 = req.getParameter("B9");
            s19 = req.getParameter("T9");
            s20 = req.getParameter("B10");
            s21 = req.getParameter("T10");

            Statement stmt1 = null;
            int a = 0;
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bridge", "root", "root");
            stmt1 = con.createStatement();
            P.println("connected and statement created");
            ResultSet rs = null;
            String s = "select * from observation where NAME='" + s1 + "';";
            rs = stmt1.executeQuery(s);
            while (rs.next()) {
                a1 = rs.getString(1);
                a2 = rs.getString(2);
                a3 = rs.getString(3);
                a4 = rs.getString(4);
                a5 = rs.getString(5);
                a6 = rs.getString(6);
                a7 = rs.getString(7);
                a8 = rs.getString(8);
                a9 = rs.getString(9);
                a10 = rs.getString(10);
                a11 = rs.getString(11);
                a12 = rs.getString(12);
                a13 = rs.getString(13);
                a14 = rs.getString(14);
                a15 = rs.getString(15);
                a16 = rs.getString(16);
                a17 = rs.getString(17);
                a18 = rs.getString(18);
                a19 = rs.getString(19);
                a20 = rs.getString(20);
                a21 = rs.getString(21);

            }

            if (s2 == null) {
                s2 = a2;
            }
            if (s3 == "") {
                s3 = a3;
            }
            if (s4 == null) {
                s4 = a4;
            }
            if (s5 == "") {
                s5 = a5;
            }
            if (s6 == null) {
                s6 = a6;
            }
            if (s7 == "") {
                s7 = a7;
            }
            if (s8 == null) {
                s8 = a8;
            }
            if (s9 == "") {
                s9 = a9;
            }
            if (s10 == null) {
                s10 = a10;
            }
            if (s11 == "") {
                s11 = a11;
            }
            if (s12 == null) {
                s12 = a12;
            }
            if (s13 == "") {
                s13 = a13;
            }
            if (s14 == null) {
                s14 = a14;
            }
            if (s15 == "") {
                s15 = a15;
            }
            if (s16 == null) {
                s16 = a16;
            }
            if (s17 == "") {
                s17 = a17;
            }
            if (s18 == null) {
                s18 = a18;
            }
            if (s19 == "") {
                s19 = a19;
            }
            if (s20 == null) {
                s20 = a20;
            }
            if (s21 == "") {
                s21 = a21;
            }

            String q = "select NAME from observation where NAME='" + s1 + "';";
            P.println("query......" + q);

            rs = stmt1.executeQuery(q);
            P.println("SS");
            if (rs.next()) {
                P.println("A");

                String q2 = "update observation set B1='" + s2 + "',T1='" + s3 + "',B2='" + s4 + "',T2='" + s5 + "',B3='" + s6 + "',T3='" + s7 + "',B4='" + s8 + "',T4='" + s9 + "',B5='" + s10 + "',T5='" + s11 + "',B6='" + s12 + "',T6='" + s13 + "',B7='" + s14 + "',T7='" + s15 + "',B8='" + s16 + "',T8='" + s17 + "',B9='" + s18 + "',T9='" + s19 + "',B10='" + s20 + "',T10='" + s21 + "' where NAME='" + s1 + "';";
                P.println("query......" + q2);
                a = stmt1.executeUpdate(q2);

                P.println("query executed");
            } else {
                String q1 = "insert into observation values('" + s1 + "','" + s2 + "','" + s3 + "','" + s4 + "','" + s5 + "','" + s6 + "','" + s7 + "','" + s8 + "','" + s9 + "','" + s10 + "','" + s11 + "','" + s12 + "','" + s13 + "','" + s14 + "','" + s15 + "','" + s16 + "','" + s17 + "','" + s18 + "','" + s19 + "','" + s20 + "','" + s21 + "');";
                P.println("query......" + q1);
                a = stmt1.executeUpdate(q1);
            }
            boolean b = false;
            RequestDispatcher rd = null;
            if (a == 1) {
                b = true;
            }
            if (b) {
                req.setAttribute("name", s1);
                rd = req.getRequestDispatcher("/select.jsp");
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
