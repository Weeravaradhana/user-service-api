package com.dewstack.whilecart.user_service_api.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "user-avatar")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserAvatar {
    @Id
    @Column(name = "avatar-id",unique = true,nullable = false,length = 80)
    private String avatarId;
    @Embedded
    private FileResource fileResource;
    @OneToOne
    @JoinColumn(name = "user_id",nullable = false,unique = true)
    private User user;
}
