package com.is.inventorysystemjdbcweb.controller;

import com.is.inventorysystemjdbcweb.model.Product;
import com.is.inventorysystemjdbcweb.model.Supplier;
import com.is.inventorysystemjdbcweb.service.ProductService;
import com.is.inventorysystemjdbcweb.service.SupplierService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "UpdateSupplierServlet", value = "/update-supplier")
public class UpdateSupplierServlet extends HttpServlet {
    SupplierService supplierService;


    @Override
    public void init() {
        supplierService = new SupplierService();
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        try {
            Supplier supplierSelected = supplierService.getSupplier(Integer.parseInt(request.getParameter("id")));
            request.setAttribute("supplierSelected", supplierSelected);

            request.getRequestDispatcher("/view/updateSupplier.jsp").forward(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
