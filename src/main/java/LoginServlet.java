//package net.codejava.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "LoginServlet", urlPatterns = "/")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {

        // read form fields
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        System.out.println("username: " + username);
        System.out.println("password: " + password);

        // do some processing here...

        // get response writer
        PrintWriter writer = response.getWriter();

        // build HTML code
        String htmlResponse = "<html>";
        htmlResponse += "<h2>Your username is: " + username + "<br/>";
        htmlResponse += "Your password is: " + password + "</h2>";
        htmlResponse += "</html>";

        // return response
        writer.println(htmlResponse);
//        request.setAttribute("username", username);
//        request.setAttribute("password", password);
//        request.getRequestDispatcher("/login.jsp").forward(request, response);

    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String login = request.getParameter("login");
        // if the name is null, it means that "name" was not present in the query
        // string, and here we'll provide a default value
//        if (name == null) {
//            name = "World!";
//        } else if (name.equals("bgates")) {
//            response.sendRedirect("https://microsoft.com");
//            return;
//        }
        // pass the value of the name variable to the view, and send the request
        // forward to the hello.jsp file
        request.setAttribute("login", login);
        request.getRequestDispatcher("/login.jsp").forward(request, response);
    }
}