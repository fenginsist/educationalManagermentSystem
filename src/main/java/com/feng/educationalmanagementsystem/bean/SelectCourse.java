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
public class SelectCourse {

    @Id  //这是一个主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //自增主键
    private int selectId;
    private int stuId;
    private String courseName;
    private String depart;
    private int teacherId;

}
