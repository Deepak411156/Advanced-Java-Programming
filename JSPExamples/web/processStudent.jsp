<%-- 
    Document   : processStudent
    Created on : Oct 26, 2024, 9:31:56 PM
    Author     : Deepak Bhatta Kaji
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Student Details</title>
    </head>
    <body>
        <h2>Student Details</h2>
        <%
            // Retrieving form data
            String name = request.getParameter("name");
            String rollNumber = request.getParameter("rollNumber");
            String email = request.getParameter("email");

            // Displaying the retrieved data
            if (name != null && rollNumber != null && email != null) {
        %>
        <p><strong>Name:</strong> <%= name %></p>
        <p><strong>Roll Number:</strong> <%= rollNumber %></p>
        <p><strong>Email:</strong> <%= email %></p>
        <%
            } else {
                out.println("<p>Error: Missing form data.</p>");
            }
        %>
    </body>
</html>
