package com.is.inventorysystemjdbcweb.controller;

import com.is.inventorysystemjdbcweb.model.Product;
import com.is.inventorysystemjdbcweb.service.ProductService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "ListProductServlet",  value = "/list-product")
public class ListProductServlet extends HttpServlet {

    private ProductService productService;


    @Override
    public void init(){
        productService = new ProductService();
    }


    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response){
        try {
            List<Product> productList = productService.getAllProducts();
            request.setAttribute("listProduct" ,productList);

            request.getRequestDispatcher("/view/listProducts.jsp").forward(request,response);
        } catch (SQLException | ServletException | IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("listProducts.jsp").forward(request,response);

    }


}
