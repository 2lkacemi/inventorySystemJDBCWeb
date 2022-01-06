package com.is.inventorysystemjdbcweb.controller;

import com.is.inventorysystemjdbcweb.model.Supplier;
import com.is.inventorysystemjdbcweb.service.SupplierService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "SubmitSupplierServlet", value ="/supplier-servlet")
public class SubmitSupplierServlet extends HttpServlet {

    private SupplierService supplierService;

    @Override
    public void init(){
        supplierService = new SupplierService();
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        Supplier supplier = new Supplier();
        String name = request.getParameter("name");
        String city = request.getParameter("city");

        supplier.setName(name);
        supplier.setCity(city);

        System.out.println(supplier);
        supplierService.addSupplier(supplier);

        response.sendRedirect(request.getContextPath() + "/view/confirmation.jsp");

    }
}
