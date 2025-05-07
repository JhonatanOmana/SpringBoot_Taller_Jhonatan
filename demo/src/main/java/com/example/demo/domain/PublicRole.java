package com.example.demo.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "public_role")
@Data
public class PublicRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 255, nullable = false)
    private String name;
}