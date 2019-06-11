package com.feng.educationalmanagementsystem.daoRepository;

import com.feng.educationalmanagementsystem.bean.GradeInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GradeRepository extends JpaRepository<GradeInfo, Integer> {
}
