package com.is.inventorysystemjdbcweb.controller;

import com.is.inventorysystemjdbcweb.model.Supplier;
import com.is.inventorysystemjdbcweb.service.SupplierService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;


@WebServlet(name = "AuthServlet", value = "/authentication-servlet")
public class AuthServlet extends HttpServlet {

    private SupplierService supplierService;


    public void init() {
        supplierService = new SupplierService();

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String n = request.getParameter("email");
        String p = request.getParameter("password");

        if((n.equals("admin@gmail.com") & (p.equals("admin")))){
            RequestDispatcher rd=request.getRequestDispatcher("/view/home.jsp");
            rd.forward(request,response);
        }
        else{
            RequestDispatcher rd=request.getRequestDispatcher("/index.jsp");
            rd.include(request,response);
        }
    }

    public void destroy() {
    }

}
