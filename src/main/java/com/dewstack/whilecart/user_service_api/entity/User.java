package com.dewstack.whilecart.user_service_api.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")
public class User {
    @Id
    @Column(name = "user_id",unique = true,nullable = false,length = 80)
    private String userId;
    @Column(name = "user_name",unique = true,nullable = false)
    private String userName;
    @Column(name = "first_name",nullable = false)
    private String firstName;
    @Column(name = "last_name",nullable = false)
    private String lastName;
    @Column(name = "last_name")
    private int otp;
    @OneToOne(mappedBy = "user")
    private UserAvatar userAvatar;
}
