package com.bugtracker.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bugtracker.entity.BugEntity;
import com.bugtracker.repository.ProjectRepository;

@Service
public class ProjectService {
	
	 public List<BugEntity> getBugsForProject(Integer project_id) {
	        return ProjectRepository.findByProjectId(project_id);
	    }

}
