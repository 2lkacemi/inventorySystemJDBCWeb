package com.is.inventorysystemjdbcweb.model;

public class Supplier {
    //id, name, city

    private Integer id;
    private String name;
    private String city;

    public Supplier(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public Supplier() {
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
