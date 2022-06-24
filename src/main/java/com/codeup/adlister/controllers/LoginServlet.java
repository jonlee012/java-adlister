package com.codeup.adlister.controllers;
import java.util.HashMap;
import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.User;
import com.codeup.adlister.util.Password;
import org.mindrot.jbcrypt.BCrypt;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        if (request.getSession().getAttribute("user") != null) {
            response.sendRedirect("/profile");
            return;
        }
        request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User user = DaoFactory.getUsersDao().getUserByUsername(username);

        HashMap<String, String> errors = new HashMap<>();
        if (user == null) {
            errors.put("exist", "Username is incorrect or does not exist");
            request.setAttribute("errors", errors);
            request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        }

        boolean validAttempt = BCrypt.checkpw(password, user.getPassword());
        if (validAttempt) {
            request.getSession().setAttribute("user", user);
            response.sendRedirect("/profile");
        } else {
            request.setAttribute("username", username);
            request.getRequestDispatcher("WEB-INF/login.jsp").forward(request, response);
        }
    }
}