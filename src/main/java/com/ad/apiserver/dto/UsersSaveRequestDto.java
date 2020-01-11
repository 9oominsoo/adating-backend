package com.ad.apiserver.dto;

import com.ad.apiserver.domain.Users;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UsersSaveRequestDto {

    private int userId;
    private String userEmail;
    private String userName;
    private String userPwd;
    private String createdDate;

    public Users toEntity(){
        return Users.builder()
                .userId(userId)
                .userEmail(userEmail)
                .userName(userName)
                .userPwd(userPwd)
                .createdDate(createdDate)
                .build();
    }
}
