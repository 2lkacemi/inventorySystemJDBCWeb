package com.is.inventorysystemjdbcweb.dao;

import java.sql.*;

public class ConnectDB {

    Connection conn ;
    Statement st ;
    ResultSet rs ;
    String url ;


    public ConnectDB(String db) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            url = "jdbc:mysql://localhost:3306/"+db+"?serverTimezone=America/New_York";
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
    public void connect(){
        try {
            conn=DriverManager.getConnection(url,"root","123456");
            st = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ResultSet select(String sql){
        try {
            rs = st.executeQuery(sql);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return rs;
    }
    public int MAJ(String sql){
        int nb=0;
        try {
            nb = st.executeUpdate(sql);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return nb;
    }
    public Boolean next(){
        try {
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false ;
        }
    }
    public void disconnect(){

        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
