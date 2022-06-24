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
import java.util.List;


@WebServlet(name = "AdsServlet", urlPatterns = "/ads")
public class AdsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Ad> allAds = DaoFactory.getAdsDao().getAllAds();
        request.setAttribute("allAds", allAds);
        request.getRequestDispatcher("/WEB-INF/all-ads.jsp").forward(request, response);
    }
}

