package controller;

import model.impl.Student;
import service.StudentGroupService;

public class StudentGroupController {

    private StudentGroupService service;

    public void addUser(Student user){
        service.addUser(user);
    }
}
