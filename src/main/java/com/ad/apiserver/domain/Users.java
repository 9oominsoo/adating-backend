package com.ad.apiserver.domain;

import lombok.*;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude="userPwd")
@Entity
@Table
public class Users {
    @Id
    @Column(name = "USERID")
    private int userId;

    @Column(name = "USERNAME")
    private String userName;

    @Column(name = "USEREMAIL")
    private String userEmail;

    @Column(name = "USERPWD")
    private String userPwd;

    @Column(name = "USERADDRESS")
    private String userAddress;

    @Column(name = "SOCIALTYPE")
    private String socialType;

    @Column(name = "CREATEDDATE")
    private String createdDate;

    @Column(name = "UPDATEDDATE")
    private String updatedDate;

    @Builder
    public Users(int userId, String userName, String userEmail,
                                 String userPwd, String createdDate) {
        this.userId = userId;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPwd = userPwd;
        this.createdDate = createdDate;
    }
}
