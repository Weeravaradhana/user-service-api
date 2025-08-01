package com.dewstack.whilecart.user_service_api.service;

import com.dewstack.whilecart.user_service_api.dto.request.RequestSystemUserAvatarDto;
import org.springframework.web.multipart.MultipartFile;

import java.sql.SQLException;

public interface SystemUserAvatarService {
    void createSystemUserAvatar(RequestSystemUserAvatarDto dto, String email, MultipartFile file) throws SQLException;
}