package com.example.demo.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "public_users")
@Data
public class PublicUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 255, nullable = false)
    private String name;

    @Column(length = 255, nullable = false)
    private String password;

    @Column(length = 255, nullable = false)
    private String username;

    @ManyToOne
    @JoinColumn(name = "role_id", nullable = false)
    private PublicRole role;
}
