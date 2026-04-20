package com.cookieservlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/CookieServlet")
public class CookieServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // Handle GET request (Display page)
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String userName = null;
        int count = 0;

        Cookie[] cookies = request.getCookies();

        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("user")) {
                    userName = c.getValue();
                }
                if (c.getName().equals("count")) {
                    count = Integer.parseInt(c.getValue());
                }
            }
        }

        out.println("<html><body>");

        if (userName != null) {
            count++;

            // Update count cookie
            Cookie countCookie = new Cookie("count", String.valueOf(count));
            countCookie.setMaxAge(60); // 1 minute
            response.addCookie(countCookie);

            out.println("<h2 style='color:blue;'>Welcome back, " + userName + "!</h2>");
            out.println("<h2 style='color:magenta;'>Visited " + count + " times</h2>");

            out.println("<form method='post'>");
            out.println("<input type='submit' value='Logout'>");
            out.println("</form>");
        } else {
            out.println("<h2 style='color:red;'>Welcome Guest! Please login</h2>");
            out.println("<form method='post'>");
            out.println("Enter name: <input type='text' name='userName'>");
            out.println("<input type='submit' value='Login'>");
            out.println("</form>");
        }

        out.println("</body></html>");
    }

    // Handle POST request (Login + Logout)
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String userName = request.getParameter("userName");

        if (userName != null && !userName.isEmpty()) {
            // LOGIN
            Cookie userCookie = new Cookie("user", userName);
            userCookie.setMaxAge(60);
            response.addCookie(userCookie);

            Cookie countCookie = new Cookie("count", "0");
            countCookie.setMaxAge(60);
            response.addCookie(countCookie);
        } else {
            // LOGOUT
            Cookie userCookie = new Cookie("user", "");
            userCookie.setMaxAge(0);
            response.addCookie(userCookie);

            Cookie countCookie = new Cookie("count", "");
            countCookie.setMaxAge(0);
            response.addCookie(countCookie);
        }

        response.sendRedirect("CookieServlet");
    }
}