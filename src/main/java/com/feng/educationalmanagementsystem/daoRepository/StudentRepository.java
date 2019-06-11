package com.feng.educationalmanagementsystem.daoRepository;

import com.feng.educationalmanagementsystem.bean.StudentInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentInfo, Integer> {
}
