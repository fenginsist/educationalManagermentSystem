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
public class StudentInfo {

    @Id  //这是一个主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //自增主键
    private int stuId;
    private String stuPassword;
    private String stuName;
    private String sex;
    private String stu_idCard;
    private Date birthday;
    private String stuDepartName;
    private String stuMajorName;
    private String stuLevel;
    private String stuTel;
    private String stuAddress;

}
