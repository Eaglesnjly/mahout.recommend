package com.springmvc.demo.model;

import lombok.Data;

import java.util.Date;

@Data
public class User extends BaseEntity  {

    private String userName;

    private String userId;

    private String password;

    private String nick;

    private Date birthday;

    private String mail;

    private String mobile;

    private String major;

    private String descript;

    private String remark1;

    private String address;

    private Integer age;

}