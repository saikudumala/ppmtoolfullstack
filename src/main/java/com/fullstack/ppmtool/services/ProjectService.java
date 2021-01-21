package com.fullstack.ppmtool.services;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.fullstack.ppmtool.domain.Project;
import com.fullstack.ppmtool.repositories.ProjectRepository;
@Service
public class ProjectService {
	@Autowired
	private ProjectRepository projectRepository;
	public Project saveOrUpdate(Project project) {
		return projectRepository.save(project);// project object persisted on the database	
	}

}
