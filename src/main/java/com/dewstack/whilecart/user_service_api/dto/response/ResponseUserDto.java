package com.dewstack.whilecart.user_service_api.dto.response;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ResponseUserDto {
    private String userName;
    private String firstName;
    private String lastName;
    private ResponseUserAvatarDto avatar;
}
