package com.fullstack.ppmtool.web;
import com.fullstack.ppmtool.domain.Project;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.fullstack.ppmtool.services.MapErrorValidationService;
import com.fullstack.ppmtool.services.ProjectService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
@RestController
@RequestMapping("/api/project")
public class ProjectController {
	@Autowired
	private ProjectService projectService;
	@Autowired
	private MapErrorValidationService mapErrorService;
	@PostMapping("")
	public ResponseEntity<?> createNewProject(@Valid @RequestBody Project project, BindingResult result){
		ResponseEntity<?> errorMap =  mapErrorService.errorMapValidation(result);
		if(errorMap!=null) {
			return errorMap;
		}
		Project project1 = projectService.saveOrUpdate(project);
		return new ResponseEntity<Project>(project1,HttpStatus.CREATED);
		
	}
	

}
