package com.dewstack.whilecart.user_service_api.dto.request;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class RequestUserDto {
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
}
