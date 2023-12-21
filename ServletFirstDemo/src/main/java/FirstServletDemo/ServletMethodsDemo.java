package FirstServletDemo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ServletMethodsDemo extends HttpServlet {
    
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String gender = req.getParameter("gender");

        out.println("<html>");
        out.println("<head><title>Form Data</title></head>");
        out.println("<body>");
        out.println("<h2>Form Data Received:</h2>");
        out.println("<p>Name: " + name + "</p>");
        out.println("<p>Email: " + email + "</p>");
        out.println("<p>Gender: " + gender + "</p>");
        out.println("</body>");
        out.println("</html>");
    }
}