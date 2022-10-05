package com.isystem.demo;

public class Book {
    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setMakedYear(Integer makedYear) {
        this.makedYear = makedYear;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    private  Integer id;
    private String name;
    private String author;
    private Integer makedYear;
    private Double price;
    private Integer count;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getMakedYear() {
        return makedYear;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getCount() {
        return count;
    }
}
