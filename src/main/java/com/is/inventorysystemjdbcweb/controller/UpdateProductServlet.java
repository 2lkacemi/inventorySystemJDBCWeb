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

@WebServlet(name = "UpdateProductServlet", value = "/update-product")
public class UpdateProductServlet extends HttpServlet {

    ProductService productService;
    SupplierService supplierService;


    @Override
    public void init() {
        productService = new ProductService();
        supplierService = new SupplierService();
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//        request.setAttribute("idProductSelected", Integer.valueOf(request.getParameter("id")));
        try {
            Product productSelected = productService.getProduct(Integer.parseInt(request.getParameter("id")));
            request.setAttribute("productSelected", productSelected);

            System.out.println("updateProductServlet"+productSelected);

            List<Supplier> supplierList = supplierService.getAllSuppliers();
            request.setAttribute("listSupplier", supplierList);

            request.getRequestDispatcher("/view/updateProduct.jsp").forward(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
