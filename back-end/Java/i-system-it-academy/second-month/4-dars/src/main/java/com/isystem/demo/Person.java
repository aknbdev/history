package com.isystem.demo;

public class Person {
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getSurname() {
        return surname;
    }

    private Integer id;
    private String name;
    private Integer age;
    private String surname;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
