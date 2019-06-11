package com.feng.educationalmanagementsystem.daoRepository;

import com.feng.educationalmanagementsystem.bean.TaskInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskInfoRepository extends JpaRepository<TaskInfo, Integer> {
}
