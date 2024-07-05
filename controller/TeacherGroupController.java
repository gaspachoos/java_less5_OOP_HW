package controller;

import model.impl.Teacher;
import service.TeacherGroupService;

public class TeacherGroupController {

    private TeacherGroupService service;

    public void addUser(Teacher user){
        service.addUser(user);
    }

}
