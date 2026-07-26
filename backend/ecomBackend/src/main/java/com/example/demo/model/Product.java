package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer stockQuantity;
        private String name;
    @Column(length = 2000)
        private String description;
        private String brand;
        private BigDecimal price;
        private String category;

        private Date releaseDate;
        private Boolean productAvailable;



        private String imagename;
        private String imageType;
        @Lob
        private byte[] imageData;




}
