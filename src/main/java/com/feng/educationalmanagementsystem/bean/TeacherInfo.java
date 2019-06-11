package com.feng.educationalmanagementsystem.bean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table
@Entity
public class TeacherInfo {

    @Id  //这是一个主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //自增主键
    private int teacherId;
    private String teaPassword;
    private String teacherName;
    private String sex;
    private String teacher_idCard;
    private String birthday;
    private String teachDepartName;
    private String teachMajorName;
    private String teachDegree;
    private String teachPosition;
    private String teachTel;
    private String teachAddress;
}
