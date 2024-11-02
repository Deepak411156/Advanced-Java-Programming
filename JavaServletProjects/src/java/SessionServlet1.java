/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Deepak Bhatta Kaji
 */
public class SessionServlet1 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SessionServlet1</title>");
            out.println("</head>");
            out.println("<body>");

            /*Fetching the contents of the userName field from the form*/
            String name = request.getParameter("txtUserName");

            if (name != null && !name.isEmpty()) {
                out.print("<h1>Welcome " + name + "<h1><br/>"); // Display username

                // Create a new session and set the "uname" attribute
                HttpSession session = request.getSession();
                session.setAttribute("uname", name);

                // Link to the second servlet
                out.print("<h3><a href='SessionServlet2'>Visit SessionServlet2</a></h3>");
            } else {
                out.println("<h3>Please enter your username from the form to create a session.</h3>");
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
