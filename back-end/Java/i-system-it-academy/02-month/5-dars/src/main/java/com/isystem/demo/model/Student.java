package com.isystem.demo.model;

public class Student {
    private Integer id;
    private String name;
    private String email;
    private Integer age;
    private Integer level;
    private String major;
    //    private static int index = 1;
//
//    public Student(){
//        this.id = index++;
//    }
    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getLevel() {
        return level;
    }

    public String getMajor() {
        return major;
    }
}
