package com.leaps.servlet;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.Duration;



/**
 * Created by WagnerMestrinho on 1/16/17.
 */
@WebServlet(name = "Servlet", urlPatterns = "/graduate")
public class Servlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

/* Create a servlet that only to "GET" calls.
When called it should tell you how many days are left in your Iron Yard Graduation! (grad day March 31st)
 */

        LocalDate todaysDate = LocalDate.now();
        LocalDate graduationDay = LocalDate.of(2017, Month.MARCH, 31);

        int days = (int) Duration.between(todaysDate.atTime(0,0),graduationDay.atTime(0,0)).toDays();

        request.setAttribute("days", days);
// forward to Display jsp
        String nextJSP = "/daysLeft.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
        dispatcher.forward(request,response);

    }
}
