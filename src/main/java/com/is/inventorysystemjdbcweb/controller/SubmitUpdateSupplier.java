package com.is.inventorysystemjdbcweb.controller;

import com.is.inventorysystemjdbcweb.model.Product;
import com.is.inventorysystemjdbcweb.model.Supplier;
import com.is.inventorysystemjdbcweb.service.ProductService;
import com.is.inventorysystemjdbcweb.service.SupplierService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "SubmitUpdateSupplier", value = "/submit-update-supplier")
public class SubmitUpdateSupplier extends HttpServlet {

    private SupplierService supplierService ;

    @Override
    public void init(){
        supplierService = new SupplierService();
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("name");
        String city = request.getParameter("city");
        Supplier supplier = new Supplier(name,city);

        System.out.println(supplier);
        supplierService.updateSupplier(Integer.parseInt(request.getParameter("id")), supplier);
        response.sendRedirect(request.getContextPath()+"/list-supplier");
    }


}
