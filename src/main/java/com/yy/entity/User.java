package com.yy.entity;

import lombok.Data;

@Data
public class User {

    private Long id;
    private String name;
    private String phone;
    private String cardno;
    private int sex;
    private int status;
}
