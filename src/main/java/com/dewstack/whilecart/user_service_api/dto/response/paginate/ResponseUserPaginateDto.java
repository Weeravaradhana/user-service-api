package com.dewstack.whilecart.user_service_api.dto.response.paginate;

import com.dewstack.whilecart.user_service_api.dto.response.ResponseUserDto;

import java.util.List;

public class ResponseUserPaginateDto {
    private long count;
    private List<ResponseUserDto> ordersDetails;
}
