package org.reservation.mehrzadapi.controller;

import org.reservation.mehrzadapi.entity.Project;
import org.reservation.mehrzadapi.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;
import java.util.List;


@RestController
@RequestMapping("/api")
public class ProjectController {

    @Autowired
    public ProjectService projectService;

    @PostMapping("/projects")
    public ResponseEntity<String> addNewProject(@RequestBody Project entity) {
        //TODO: process POST request
        int result=projectService.addProject(entity);
        if(result==1){
            return new ResponseEntity<>(HttpStatus.CREATED);
        }
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("/projects")
    public ResponseEntity<Project> findProejctSBytitle(@RequestParam(name = "title") String title){
        List<Project> projects=projectService.findProjectByTitle(title);
        if(projects.size()>0){
            return new ResponseEntity<>(projects.get(0),HttpStatus.OK);
        }else{

            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


}
