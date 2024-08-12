package org.reservation.mehrzadapi.service;
import java.util.List;

import org.reservation.mehrzadapi.entity.Project;
import org.reservation.mehrzadapi.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService  {
    @Autowired
    private ProjectRepository projectRepository;
    List<Project> projects=null;
    
    public List<Project> findProjectByTitle(String title){
        try {
             projects=projectRepository.findByTitle(title);
             System.out.println("data added successfully");
            
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return projects;
    }    


    public int addProject(Project project){
        int success=0;
        try{
            System.out.println(projectRepository.save(project).toString());
            success=1;
        }catch(Exception e){

        }
        return success;
    }

}

