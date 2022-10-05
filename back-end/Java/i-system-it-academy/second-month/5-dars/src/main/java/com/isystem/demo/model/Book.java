package com.isystem.demo.model;

public class Book {

    private Integer id;
    private String name;
    private String author;
    private Integer year;
    private String major;
    private Integer level;
//    private static int index = 1;
//
//    public Book(){
//        this.id = index++;
//    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getYear() {
        return year;
    }

    public String getMajor() {
        return major;
    }

    public Integer getLevel() {
        return level;
    }
}
