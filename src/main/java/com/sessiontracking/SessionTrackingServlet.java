package com.sessiontracking;

import java.io.*;
import java.util.Date;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/SessionTracker")
public class SessionTrackingServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Create or get session
        HttpSession session = request.getSession(true);

        // ✅ Set session expiry (1 minute)
        session.setMaxInactiveInterval(60);

        // Session details
        Date createTime = new Date(session.getCreationTime());
        Date lastAccessTime = new Date(session.getLastAccessedTime());
        String sessionId = session.getId();

        // Visit count logic
        Integer visitCount = (Integer) session.getAttribute("visitCount");

        if (visitCount == null) {
            visitCount = 1;
        } else {
            visitCount++;
        }

        session.setAttribute("visitCount", visitCount);

        // Response
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>Session Tracking Information</h2>");

        out.println("<p><b>Session ID:</b> " + sessionId + "</p>");
        out.println("<p><b>Creation Time:</b> " + createTime + "</p>");
        out.println("<p><b>Last Access Time:</b> " + lastAccessTime + "</p>");
        out.println("<p><b>Visit Count:</b> " + visitCount + "</p>");

        out.println("<p><i>Session will expire in 1 minute of inactivity.</i></p>");

        out.println("<a href='SessionTracker'>Refresh Page</a>");
        out.println("</body></html>");
    }
}