package com.dewstack.whilecart.user_service_api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "user-avatar")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserAvatar {
    @Id
    @Column(name = "avatar-id",unique = true,nullable = false,length = 80)
    private String avatarId;
    @Column(name = "file-name",unique = true,nullable = false)
    private String fileName;
    @Column(name = "resource-url",unique = true,nullable = false)
    private String resourceUrl;
    @Column(name = "hash",unique = true,nullable = false)
    private String hash;
    @Column(name = "directory",unique = true,nullable = false)
    private String directory;
    @OneToOne(mappedBy = "userAvatar")
    private User userId;
}
