package com.dewstack.whilecart.user_service_api.entity;

import jakarta.persistence.*;
import lombok.*;
import org.bouncycastle.asn1.dvcs.Data;
import org.bouncycastle.util.test.FixedSecureRandom;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")
@Builder
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
    @Column(name = "active_state", columnDefinition = "TINYINT", nullable = false)
    private Boolean activeState;
    @Column(name = "is_account_non_expired", columnDefinition = "TINYINT", nullable = false)
    private Boolean isAccountNonExpired;

    @Column(name = "is_email_verified", columnDefinition = "TINYINT", nullable = false)
    private Boolean isEmailVerified;

    @Column(name = "is_account_non_locked", columnDefinition = "TINYINT", nullable = false)
    private Boolean isAccountNonLocked;

    @Column(name = "is_enabled", columnDefinition = "TINYINT", nullable = false)
    private Boolean isEnabled;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_date", nullable = false, columnDefinition = "DATETIME")
    private Date createdDate;

    @OneToOne(mappedBy = "user")
    private UserAvatar userAvatar;
    @OneToOne(mappedBy = "systemUser", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    private Otp otp;

}
