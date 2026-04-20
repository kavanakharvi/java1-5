package com.cookie;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/CookieServlet")
public class CookieServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("username");

        // Default visit count
        int count = 1;

        // Read existing cookies
        Cookie[] cookies = request.getCookies();

        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("count")) {
                    count = Integer.parseInt(c.getValue()) + 1;
                }
            }
        }

        // Create cookies
        Cookie nameCookie = new Cookie("user", name);
        nameCookie.setMaxAge(60); // 60 sec expiry

        Cookie countCookie = new Cookie("count", String.valueOf(count));
        countCookie.setMaxAge(60);

        // Add cookies to response
        response.addCookie(nameCookie);
        response.addCookie(countCookie);

        // HTML Output
        out.println("<html><body>");

        out.println("<h2 style='color:blue;'>Welcome back " + name + "!</h2>");
        out.println("<h3>You have visited this page " + count + " times</h3>");

        // Display cookie details (Name + Value)
        out.println("<h3>Active Cookie List:</h3>");

        Cookie[] allCookies = request.getCookies();

        if (allCookies != null) {
            for (Cookie c : allCookies) {
                out.println("<p>");
                out.println("<b>Name:</b> " + c.getName() + "<br>");
                out.println("<b>Value:</b> " + c.getValue());
                out.println("</p><hr>");
            }
        } else {
            out.println("<p>No cookies found</p>");
        }

        out.println("<p style='color:red;'>Cookies will expire in 60 seconds</p>");
        out.println("<a href='index.html'>Go Back</a>");

        out.println("</body></html>");
    }

    // Handle GET request (avoid 405 error)
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.sendRedirect("index.html");
    }
}