package com.is.inventorysystemjdbcweb.controller;

import com.is.inventorysystemjdbcweb.model.Product;
import com.is.inventorysystemjdbcweb.service.ProductService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "SubmitUpdateProduct", value = "/submit-update-product")
public class SubmitUpdateProduct extends HttpServlet {

    private ProductService productService;

    @Override
    public void init(){
        productService = new ProductService();
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String label = (request.getParameter("label"));
        Double price = Double.valueOf(request.getParameter("price"));
        Integer id_supplier = Integer.valueOf(request.getParameter("id_supplier"));
        Product product = new Product(label, price, id_supplier);
        System.out.println("SsubmitUpdateProductServlet"+product);
        System.out.println(Integer.parseInt(request.getParameter("id")));

        try {
            productService.updateProduct(Integer.parseInt(request.getParameter("id")), product);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        response.sendRedirect(request.getContextPath()+"/list-product");
    }

    public void destroy() {
    }

}
