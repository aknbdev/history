package com.isystem.demo.model;
import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name="vehicles")

public class Vehicles implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "merchant_id", nullable = false)
    private Integer merchant_id;

    @Column(name = "brand_id", nullable = false)
    private Integer brand_id;

    @Column(name = "model_id", nullable = false)
    private Integer model_id;

    @Column(name = "body_type_id", nullable = false)
    private Integer body_type_id;

    @Column(name = "name", length = 145)
    private String name;

    @Column(name = "year", nullable = false)
    private Integer year;

    @Column(name = "color", length = 145)
    private String color;

    @Column(name = "number_sits", nullable = false)
    private Integer number_sits;

    @Column(name = "is_new", columnDefinition = "TINYINT(2)")
    private Boolean is_new;

    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "condition_duration_type")
    private Integer condition_duration_type;

    @Column(name = "condition_duration")
    private Integer condition_duration;

    @Column(name = "condition_price", nullable = false)
    private Double condition_price;

    @Column(name = "status", columnDefinition = "TINYINT(2)")
    private Boolean status = true;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getMerchant_id() {
        return merchant_id;
    }

    public void setMerchant_id(Integer merchant_id) {
        this.merchant_id = merchant_id;
    }

    public Integer getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(Integer brand_id) {
        this.brand_id = brand_id;
    }

    public Integer getModel_id() {
        return model_id;
    }

    public void setModel_id(Integer model_id) {
        this.model_id = model_id;
    }

    public Integer getBody_type_id() {
        return body_type_id;
    }

    public void setBody_type_id(Integer body_type_id) {
        this.body_type_id = body_type_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getNumber_sits() {
        return number_sits;
    }

    public void setNumber_sits(Integer number_sits) {
        this.number_sits = number_sits;
    }

    public Boolean getIs_new() {
        return is_new;
    }

    public void setIs_new(Boolean is_new) {
        this.is_new = is_new;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getCondition_duration_type() {
        return condition_duration_type;
    }

    public void setCondition_duration_type(Integer condition_duration_type) {
        this.condition_duration_type = condition_duration_type;
    }

    public Integer getCondition_duration() {
        return condition_duration;
    }

    public void setCondition_duration(Integer condition_duration) {
        this.condition_duration = condition_duration;
    }

    public Double getCondition_price() {
        return condition_price;
    }

    public void setCondition_price(Double condition_price) {
        this.condition_price = condition_price;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
