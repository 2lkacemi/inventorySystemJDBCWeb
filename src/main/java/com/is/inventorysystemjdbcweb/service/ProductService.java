package com.is.inventorysystemjdbcweb.service;

import com.is.inventorysystemjdbcweb.dao.ProductRepository;
import com.is.inventorysystemjdbcweb.model.Product;

import java.sql.SQLException;
import java.util.List;

public class ProductService {

    ProductRepository productRepository = new ProductRepository();

    /**
     * method that add a product
     * @param product
     */
    public void addProduct(Product product) {
        productRepository.insertProduct(product);
    }

    /**
     * method that delete a product
     * @param id
     */
    public void deleteProduct(int id){
        productRepository.deleteProduct(id);
    }

    /**
     * method that update a product
     * @param id
     * @param product
     * @throws SQLException
     */
    public void updateProduct(int id, Product product) throws SQLException {
        productRepository.updateProduct(id, product);
    }

    /**
     *  method that list all products
     * @throws SQLException
     */
    public List<Product> getAllProducts() throws SQLException {
       return productRepository.selectAllProducts();
    }

    /**
     * method that get a product by id
     * @param id
     * @return
     * @throws SQLException
     */
    public Product getProduct(int id) throws SQLException {
        return productRepository.selectProductById(id);
    }

}
