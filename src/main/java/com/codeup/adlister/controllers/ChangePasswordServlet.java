package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.Ad;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import static java.lang.Long.parseLong;
import com.codeup.adlister.models.User;
import com.codeup.adlister.util.Password;
import org.mindrot.jbcrypt.BCrypt;

import java.util.HashMap;
import java.util.List;

@WebServlet(name = "ChangePasswordServlet", urlPatterns = "/profile/password")
public class ChangePasswordServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String oldPassword = request.getParameter("old-password");
        String newPassword = request.getParameter("new-password");
        String hash = Password.hash(newPassword);
        String confirmNewPassword = request.getParameter("confirm-new-password");
        User user = (User)request.getSession().getAttribute("user");

        HashMap<String, String> errors = new HashMap<>();
        if (!newPassword.equals(confirmNewPassword)) {
            errors.put("confirm", "Passwords do not match");
        }

        if (!BCrypt.checkpw(oldPassword, user.getPassword())){
            errors.put("password", "Current password is incorrect");
        }

        if(newPassword.isEmpty()){
            errors.put("mustHave", "Password cannot be empty");
        }

        request.setAttribute("errors", errors);

        if (!newPassword.equals(confirmNewPassword)|| !BCrypt.checkpw(oldPassword, user.getPassword()) || newPassword.isEmpty()) {
            request.getRequestDispatcher("/WEB-INF/changePassword.jsp").forward(request, response);
            return;
        }
        user.setPassword(hash);
        DaoFactory.getUsersDao().updatePassword(user);
        response.sendRedirect("/profile");
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("/WEB-INF/changePassword.jsp").forward(request, response);
    }
}
