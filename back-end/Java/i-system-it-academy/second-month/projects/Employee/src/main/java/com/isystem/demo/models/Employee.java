package com.isystem.demo.models;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Getter @Setter @Generated @Entity

public class Employee {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;

    @Column(name = "name") private String name;

    @Column(name = "email",unique = true) private String email;

    @Column(name = "jobTitle") private String jobTitle;

    @Column(name = "phone", unique = true) private String phone;

    @Column(name = "imageUrl") private String imageUrl;
}
