package com.fullstack.ppmtool.services;
import org.springframework.stereotype.Service;
import com.fullstack.ppmtool.exceptions.ProjectIdException;
import org.springframework.beans.factory.annotation.Autowired;
import com.fullstack.ppmtool.domain.Project;
import com.fullstack.ppmtool.repositories.ProjectRepository;
@Service
public class ProjectService {
	@Autowired
	private ProjectRepository projectRepository;
	public Project saveOrUpdate(Project project) {
		try {
		project.setProjectIdentifier(project.getProjectIdentifier().toUpperCase());	
		return projectRepository.save(project);
		}// project object persisted on the database	
		catch(Exception e) {
			throw new ProjectIdException("Project " + project.getProjectIdentifier()+ "Already Exsists");
		}
	}
	public Project findProjectByIdentifier(String ProjectId) {
		Project project = projectRepository.findByProjectIdentifier(ProjectId);
		if(project==null) {
			throw new ProjectIdException("Project " + ProjectId.toUpperCase() + " does not exsists");
		}
		return project;
	}
	
	public Iterable<Project> findAll(){
		return projectRepository.findAll();
	}
	public void deleteProjectByIdentifier(String ProjectIdentifier) {
		Project project = projectRepository.findByProjectIdentifier(ProjectIdentifier);
		if(project==null) {
			throw new ProjectIdException("Project " + ProjectIdentifier.toUpperCase() + " cannot be found");
		}
		projectRepository.delete(project);
	}

}
