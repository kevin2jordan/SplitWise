package com.lld.model.users;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class User {
    private String userId;
    private String userName;
    private String userEmail;
    private String phone;

}
