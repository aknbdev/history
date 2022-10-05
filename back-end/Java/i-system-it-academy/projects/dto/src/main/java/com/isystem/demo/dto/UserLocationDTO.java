package com.isystem.demo.dto;
import lombok.Data;

@Data
public class UserLocationDTO {
    private Long userId;
    private String email;
    private String place;
    private double longitude;
    private double latitude;
}
