package com.is.inventorysystemjdbcweb.model;

public class Product {

    //id, label, price, id_supplier
    private Integer id;
    private String label;
    private Double price;
    private Integer id_supplier;

    public Product() {
    }

    //Parameterized Constructor
    public Product(String label, Double price, Integer id_supplier) {
        this.label = label;
        this.price = price;
        this.id_supplier = id_supplier;
    }

    public Product(Integer id, String label, Double price, Integer id_supplier) {
        this.id = id;
        this.label = label;
        this.price = price;
        this.id_supplier = id_supplier;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getId_supplier() {
        return id_supplier;
    }

    public void setId_supplier(Integer id_supplier) {
        this.id_supplier = id_supplier;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", label='" + label + '\'' +
                ", price=" + price +
                ", id_supplier=" + id_supplier +
                '}';
    }
}
