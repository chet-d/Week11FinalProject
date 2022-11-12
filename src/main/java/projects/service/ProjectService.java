package projects.service;

import java.util.List;
import java.util.NoSuchElementException;

import projects.entity.Project;

public class ProjectService {
	
	private ProjectDao projectDao = new ProjectDao();

	public Project addProject(Project project) {
		
		return projectDao.insertProject(project);
	}

	public List<Project> fetchAllProjects() {
		// TODO Auto-generated method stub
		return projectDao.fetchAllProjects(); 
	}

	
	public Project fetchProjectByID(Integer projectId) {
		return projectDao.fetchProjectByID(projectId).orElseThrow(()-> new NoSuchElementException("Project with project ID="+projectId+" does not exist"));
	}
}
