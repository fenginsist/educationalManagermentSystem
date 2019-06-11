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
public class TaskInfo {

    @Id  //这是一个主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //自增主键
    private int taskId;
    private String taskCourseName;
    private int taskTeacherId;
    private String taskYear;
    private String taskTeam;
    private String taskWay;
    private String taskDepart;

}
