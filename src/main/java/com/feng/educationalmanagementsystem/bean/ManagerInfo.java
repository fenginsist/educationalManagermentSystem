package com.feng.educationalmanagementsystem.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Table
@Entity
public class ManagerInfo {

    @Id  //这是一个主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //自增主键
    private int managerId;
    private String manPassword;
    private String managerName;
    private String sex;
    private String manager_idCard;
    private Date birthday;
    private String manPosition;
    private String manTel;
    private String manAddress;
}
