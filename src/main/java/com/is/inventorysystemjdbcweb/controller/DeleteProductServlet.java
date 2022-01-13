package com.is.inventorysystemjdbcweb.controller;

import com.is.inventorysystemjdbcweb.service.ProductService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "DeleteProductServlet", value = "/delete-product")
public class DeleteProductServlet extends HttpServlet {


    ProductService productService;
    @Override
    public void init(){
        productService = new ProductService();
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        productService.deleteProduct(Integer.parseInt(request.getParameter("id")));
        request.getRequestDispatcher("/list-product").forward(request,response);
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) {}

}
