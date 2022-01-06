package com.is.inventorysystemjdbcweb.controller;

import com.is.inventorysystemjdbcweb.model.Supplier;
import com.is.inventorysystemjdbcweb.service.SupplierService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "ListSupplierServlet" , value = "/list-supplier")
public class ListSupplierServlet extends HttpServlet {
    SupplierService supplierService;


    @Override
    public void init(){
        supplierService = new SupplierService();
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response){
        try {
            List<Supplier> supplierList = supplierService.getAllSuppliers();
            request.setAttribute("listSupplier", supplierList);
            request.getRequestDispatcher("/view/listSuppliers.jsp").forward(request, response);
        } catch (SQLException | IOException | ServletException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response){

    }
}
