/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Deepak Bhatta Kaji
 */
public class LoginServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         String user = request.getParameter("txtUser");
        String pass = request.getParameter("txtPassword");
        if ("admin".equals(user) && "1234".equals(pass)) {
            response(response, "Login Success!");
        } else {
            response(response, "Invalid Login, Try Again!");
        }

    }

    private void response(HttpServletResponse response, String login_Success)
            throws IOException {
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>Home - DBK");
        out.println("</title></head>");
        out.println("<body>");
        out.println("<t1>" + login_Success + "</t1>");
        out.println("</body>");
        out.println("</html>");

    }

}
