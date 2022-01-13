package com.is.inventorysystemjdbcweb.controller;

import com.is.inventorysystemjdbcweb.service.SupplierService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DeleteSupplierServlet", value = "/delete-supplier")
public class DeleteSupplierServlet extends HttpServlet {
    SupplierService supplierService ;

    @Override
    public void init(){
        supplierService = new SupplierService();
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        supplierService.deleteSupplier(Integer.parseInt(request.getParameter("id")));
        request.getRequestDispatcher("/list-supplier").forward(request,response);

    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) {

    }
}
