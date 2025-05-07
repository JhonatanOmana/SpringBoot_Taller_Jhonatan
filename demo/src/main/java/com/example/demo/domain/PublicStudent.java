package com.example.demo.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "public_students")
@Data
public class PublicStudent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer age;

    // @ManyToOne
    // @JoinColumn(name = "school_id")
    // private PublicSchool school;

    @Column(length = 30, nullable = false)
    private String cellphone;

    @Column(length = 80, nullable = false)
    private String email;

    @Column(length = 50, nullable = false)
    private String firstname;

    @Column(length = 50, nullable = false)
    private String lastname;
}