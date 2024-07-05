package controller;


import model.impl.Teacher;
import service.TeacherService;
import service.UserService;

import java.util.List;

public class TeacherController implements UserService<Teacher> {

    private TeacherService teacherService = new TeacherService();


    @Override
    public Teacher createUser(String name, String lastName, int groupId) {
        return teacherService.createUser(name, lastName, groupId);
    }

    @Override
    public Teacher getById(int id) throws Exception {
        Teacher teacher = null;
        try {
            teacher = teacherService.getById(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return teacher;
    }


    @Override
    public List<Teacher> getAllUsers() {
        return teacherService.getAllUsers();
    }
}
