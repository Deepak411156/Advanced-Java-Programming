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
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author Deepak Bhatta Kaji
 */
public class Servlet2 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Servlet2</title>");
            out.println("</head>");
            out.println("<body>");

            String encodedName = getCookieValue(request, "user_name");
            String userName = null;
            if (encodedName != null) {
                userName = URLDecoder.decode(encodedName, StandardCharsets.UTF_8);
            }
            if (userName != null) {
                out.println("<h1>Hello, welcome back " + userName + "!</h1>");
                out.println("<h2>Thank you for visiting again!</h2>");
            } else {
                out.println("<h1>You are a new user, please go to the homepage and submit your college name.</h1>");
                out.println(
                        "<h1><a href =\"Cookies/CookieExample.html\">Go to Home</a></h1>");

            }

            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    private String getCookieValue(HttpServletRequest request, String user_name) {

        Cookie[] cookies;
        cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (user_name.equals(cookie.getName())) {
                    return cookie.getValue();
                }
            }
        }
        return null; // Return null if cookie is not found
    }

}
