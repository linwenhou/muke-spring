package com.venvo.controller;

import com.venvo.controller.frontend.MainPageController;
import com.venvo.controller.superadmin.HeadLineOperationController;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/")
public class DispatcherServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String servletPath = req.getServletPath();
        System.out.println("request path::::" + servletPath);
        System.out.println("request method is:" + req.getMethod());

        if (req.getServletPath() == "/frontend/getMainPageInfo"
                && req.getMethod() == "GET") {
            new MainPageController().getMainPageInfo(req, resp);
        } else if (req.getServletPath() == "/superadmin/addheadline" && req.getMethod() == "POST") {
            new HeadLineOperationController().addHeadLine(req, resp);
        }
    }
}
