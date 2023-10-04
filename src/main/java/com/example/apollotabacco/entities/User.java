package com.example.apollotabacco.entities;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Entity
@Table
@Data
@Valid
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    @NotEmpty
    private String name;
    @NotNull
    @NotEmpty
    private String secondName;
    @NotNull
    @NotEmpty
    private Role role;
    @Email(regexp = ".+@.+\\..+")
//    @Pattern(regexp=".+@.+\\..+", message="Please provide a valid email address")
    private String email;
    @NotNull
    @NotEmpty
    private String password;
    private String phoneNumber;

    public User(Long id, String name, String secondName, Role role, String email, String password, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.secondName = secondName;
        this.role = role;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    public User() {
    }
}
