package com.is.inventorysystemjdbcweb.dao;

import com.is.inventorysystemjdbcweb.model.Supplier;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SupplierRepository{

    private static final String DB_NAME = "product_management";
    ConnectDB db = new ConnectDB(DB_NAME);

    /**
     * method that select all suppliers from t_supplier
     * @return list of suppliers
     * @throws SQLException
     */
    public List<Supplier> selectAllSuppliers( ) throws SQLException {
        List<Supplier> listSuppliers = new ArrayList<>();
        db.connect();
        String sql = "select * from t_supplier;";
        ResultSet rs = db.select(sql);
        while (db.next()){
            Integer id = rs.getInt("id");
            String name = rs.getString("name");
            String city = rs.getString("city");
            Supplier supplier = new Supplier(name, city);
            supplier.setId(id);
            listSuppliers.add(supplier);
        }
        rs.close();
        db.disconnect();
        return listSuppliers;
    }

    /**
     *  method that find a supplier by its id
     * @param id of the supplier
     * @return the supplier with id entered in param
     * @throws SQLException
     */
    public Supplier selectSupplierById( int id) throws SQLException {
        Supplier supplier = null;
        db.connect();
        String sql = "select name, city from t_supplier where id =" + id + ";";
        System.out.println(sql);
        ResultSet rs = db.select(sql);
        while (db.next()){
            String name = rs.getString("name");
            String city = rs.getString("city");
            supplier = new Supplier(id,name, city);
        }
        rs.close();
        db.disconnect();
        return supplier;
    }

    /**
     * method that update a supplier
     * @param id of supplier that we want to update
     * @param supplier the new product which will replace
     */
    public void updateSupplier(int id, Supplier supplier) {
        db.connect();
        String sql = "update t_supplier set " +
                "name =" + "'"+ supplier.getName() +"'" + ","+
                "city="+ "'"+supplier.getCity()+"'" +
                "where id ="+ id+ ";";
        System.out.println(sql);
        db.MAJ(sql);
        db.disconnect();
    }

    /**
     * method to insert supplier
     * @param supplier we want to insert
     */
    public void insertSupplier(Supplier supplier) {
        db.connect();
        String sql = "INSERT INTO t_supplier" + "  (name, city) VALUES " +"("+
                "'" + supplier.getName() + "'"
                + "," + "'" + supplier.getCity() + "'" + ");";
        System.out.println(sql);
        db.MAJ(sql);
        db.disconnect();
    }

    /**
     * method that delete supplier
     * @param id of supplier, we want to delete
     */
    public void deleteSupplier(int id) {
        db.connect();
        String sql = "delete from t_supplier where id =" + id + ";";
        System.out.println(sql);
        db.MAJ(sql);
        db.disconnect();
    }


}