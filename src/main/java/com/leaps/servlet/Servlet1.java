package com.leaps.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by WagnerMestrinho on 1/17/17.
 */
@WebServlet(name = "Servlet1", urlPatterns = "/leapy")
public class Servlet1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int leapYear = Integer.parseInt(request.getParameter("year"));
        String msg = String.format("The year %d is not a leap year", leapYear);

        if (leapYear%100 == 0) {

            if(leapYear%400==0) {
                msg = String.format("The year %d is a leap year", leapYear);}
        }else if(leapYear%4 == 0) {
                    msg = String.format("The year %d is a leap year", leapYear);
        }

        request.setAttribute("year", msg);
        // forward to Display jsp
        String nextJSP = "/leapyear.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
        dispatcher.forward(request, response);
    }




    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }




}
