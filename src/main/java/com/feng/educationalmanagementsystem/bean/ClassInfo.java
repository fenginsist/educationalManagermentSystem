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
public class ClassInfo {

    @Id  //这是一个主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //自增主键
    private int classId;
    private int stuId;
    private String className;
    private Date classDate;
    private String classPlace;
    private int teacherId;

}
