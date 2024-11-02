/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author Deepak Bhatta Kaji
 */
public class Servlet1 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");

        // Retrieving user input from the request parameter
        String name = request.getParameter("txtCollegeName");

        // Create and add a cookie before writing any response output
        if (name != null && !name.isEmpty()) {
            // URL-encode the cookie value to ensure special characters are handled
            String encodedName = URLEncoder.encode(name, StandardCharsets.UTF_8.toString());
            Cookie c = new Cookie("user_name", encodedName);
            c.setPath("/"); // Make cookie available to the entire application
            c.setMaxAge(60 * 60 * 24); // Set cookie expiration to 1 day
            response.addCookie(c);
        }

        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Servlet1</title>");
            out.println("</head>");
            out.println("<body>");

            if (name != null && !name.isEmpty()) {
                out.println("<h1>Hello, welcome to " + name + "!</h1>");
                out.println(
                        "<h1><a href =\"Servlet2\">Go to Servlet2</a></h1>");
            } else {
                out.println("<h1>College name not provided.</h1>");
                out.println(
                        "<h1><a href =\"Cookies/CookieExample.html\">Go to Home</a></h1>");
            }

            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

}
