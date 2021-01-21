package com.fullstack.ppmtool.web;
import com.fullstack.ppmtool.domain.Project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.fullstack.ppmtool.services.ProjectService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
@RestController
@RequestMapping("/api/project")
public class ProjectController {
	@Autowired
	private ProjectService projectService;
	@PostMapping("")
	public ResponseEntity<Project> createNewProject(@RequestBody Project project){
		Project project1 = projectService.saveOrUpdate(project);
		return new ResponseEntity<Project>(project1,HttpStatus.CREATED);
	}
	

}
