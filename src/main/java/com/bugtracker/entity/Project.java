package com.bugtracker.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Project {
	
	@OneToMany(mappedBy = "project")
    private List<BugEntity> bugs;
	
	@Getter
	@Setter
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private int project_id;
	private String project_name;
	private String project_description;
	private String assigned_to;
	private String assigned_by;
	private String status;
	private Date created_date;

}
