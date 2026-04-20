package com.prime;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/prime")
public class PrimeServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            // Get input
            String numStr = request.getParameter("number");

            if (numStr == null || numStr.isEmpty()) {
                throw new NumberFormatException();
            }

            int number = Integer.parseInt(numStr);

            // Prime logic
            boolean isPrime = true;
            String steps = "Checking:<br>";

            if (number <= 1) {
                isPrime = false;
                steps += number + " is not prime (must be > 1)";
            } else {
                for (int i = 2; i <= number / 2; i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        steps += number + " is divisible by " + i;
                        break;
                    }
                }

                if (isPrime) {
                    steps += number + " is not divisible by any number except 1 and itself";
                }
            }

            // Output
            out.println("<html><body>");
            out.println("<h2 style='color:blue;'>Prime Number Result</h2>");
            out.println("<p>Number: " + number + "</p>");

            if (isPrime) {
                out.println("<p style='color:green;'>It is a Prime Number</p>");
            } else {
                out.println("<p style='color:red;'>It is NOT a Prime Number</p>");
            }

            out.println("<p>" + steps + "</p>");
            out.println("<a href='index.html'>Check Another Number</a>");
            out.println("</body></html>");

        } catch (NumberFormatException e) {
            displayError(out, "Please enter a valid number");
        }
    }

    // Handle GET (avoid 405 error)
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("index.html");
    }

    // Error method
    private void displayError(PrintWriter out, String msg) {
        out.println("<html><body>");
        out.println("<h2 style='color:red;'>Error</h2>");
        out.println("<p>" + msg + "</p>");
        out.println("<a href='index.html'>Try Again</a>");
        out.println("</body></html>");
    }
}