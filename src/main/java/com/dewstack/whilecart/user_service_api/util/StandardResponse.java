package com.dewstack.whilecart.user_service_api.util;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class StandardResponse {
    private int code;
    private String message;
    private Object data;



}