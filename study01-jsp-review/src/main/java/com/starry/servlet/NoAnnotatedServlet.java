package com.starry.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class NoAnnotatedServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("no annotated...");
        response.getWriter().write("no annotated visit success!");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
