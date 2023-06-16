package com.bugtracker.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bugtracker.entity.BugEntity;
import com.bugtracker.entity.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer>{
	
	static List<BugEntity> findByProjectId(Integer project_id) {
		// TODO Auto-generated method stub
		return null;
	}

}
