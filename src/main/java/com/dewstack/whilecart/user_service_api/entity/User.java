package com.dewstack.whilecart.user_service_api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "user")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @Column(name = "user-id",unique = true,nullable = false,length = 80)
    private String userId;
    @Column(name = "user-name",unique = true,nullable = false)
    private String userName;
    @Column(name = "first-name",nullable = false)
    private String firstName;
    @Column(name = "last-name",nullable = false)
    private String lastName;
    @Column(name = "last-name")
    private String otp;
}
