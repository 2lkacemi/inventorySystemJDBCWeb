package com.is.inventorysystemjdbcweb.dao;

import com.is.inventorysystemjdbcweb.model.Product;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

    private static final String DB_NAME = "product_management";
    ConnectDB db = new ConnectDB(DB_NAME);

    /**
     * method that select all products from t_product
     * @return list of products
     * @throws SQLException
     */
    public List<Product> selectAllProducts( ) throws SQLException {
        List<Product> listProducts = new ArrayList<>();
        db.connect();
        String sql = "select * from t_product;";
        ResultSet rs = db.select(sql);
        while (db.next()){
            String label = rs.getString("label");
            Double price = rs.getDouble("price");
            Integer id_supplier = rs.getInt("id_supplier");
            Product product = new Product(label, price, id_supplier);
            listProducts.add(product);
        }
        rs.close();
        db.disconnect();
        return listProducts;
    }

    /**
     *  method that find a product by its id
     * @param id of the product
     * @return the product with id entered in param
     * @throws SQLException
     */
    public Product selectProductById( int id) throws SQLException {
        Product product = null;
        db.connect();
        String sql = "select label, price, id_supplier from t_product where id =" + id + ";";
        System.out.println(sql);
        ResultSet rs = db.select(sql);
        while (db.next()){
            String label = rs.getString("label");
            Double price = rs.getDouble("price");
            Integer id_supplier = rs.getInt("id_supplier");
            product = new Product(label, price, id_supplier);
        }
        rs.close();
        db.disconnect();
        return product;
    }

    /**
     * method that update a product
     * @param id of product that we want to update
     * @param product the new product which will replace
     */
    public void updateProduct(int id, Product product) {
        db.connect();
        String sql = "update t_product set " +
                "label =" + "'"+ product.getLabel() +"'" + ","+
                "price="+product.getPrice()+"," +
                "id_supplier="+product.getId_supplier() +
                " where id ="+ id+ ";";
        System.out.println(sql);
        db.MAJ(sql);
        db.disconnect();
    }

    /**
     * method that delete product
     * @param id of product, we want to delete
     */
    public void deleteProduct(int id) {
        db.connect();
        String sql = "delete from t_product where id =" + id + ";";
        System.out.println(sql);
        db.MAJ(sql);
        db.disconnect();
    }

    /**
     * method to insert product
     * @param product we want to insert
     */
    public void insertProduct(Product product) {
        db.connect();
        String sql = "INSERT INTO t_product" + "  (label, price, id_supplier) VALUES " +"("+
                 "'" + product.getLabel() + "'"+ "," +
                "'"+ product.getPrice() + "'"+ "," +
                "'"+ product.getId_supplier()+ "'" + ");";
        System.out.println(sql);
        db.MAJ(sql);
    }

    /**
     * method that return all product of a supplier
     * @param id of the supplier
     * @return list
     * @throws SQLException
     */
    public List<Product> selectProductsBySupplierId(int id) throws SQLException {
        List<Product> listProducts = new ArrayList<>();
        db.connect();
        String sql = "select * from t_product where id_supplier= "+id;
        ResultSet rs = db.select(sql);
        while (db.next()){
            String label = rs.getString("label");
            Double price = rs.getDouble("price");
            Integer id_supplier = rs.getInt("id_supplier");
            Product product = new Product(label, price, id_supplier);
            listProducts.add(product);
        }
        rs.close();
        db.disconnect();
        return listProducts;



    }
}
