package com.is.inventorysystemjdbcweb.controller;

import com.is.inventorysystemjdbcweb.model.Product;
import com.is.inventorysystemjdbcweb.service.ProductService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "SubmitProductServlet", value ="/product-servlet")
public class SubmitProductServlet extends HttpServlet {

    private ProductService productService;

    @Override
    public void init(){
       productService = new ProductService();
    }
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

    }
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Product product = new Product();
        String label = (request.getParameter("label"));
        Double price = Double.valueOf(request.getParameter("price"));
        Integer id_supplier = Integer.valueOf(request.getParameter("id_supplier"));

        product.setPrice(price);
        product.setLabel(label);
        product.setId_supplier(id_supplier);

        System.out.println(product);
        productService.addProduct(product);

        response.sendRedirect(request.getContextPath() + "/view/confirmation.jsp");
    }

    public void destroy() {
    }
}
