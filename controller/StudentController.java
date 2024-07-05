package controller;

import model.impl.Student;
import service.StudentService;
import service.UserService;

import java.util.List;

public class StudentController implements UserService<Student> {

    private StudentService studentService = new StudentService();

    public Student createUser(String name, String lastName, int groupId) {
        return studentService.createUser(name, lastName, groupId);
    }

    public Student getById(int id) {
        Student student = null;
        try {
            student = studentService.getById(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return student;
    }

    public List<Student> getAllUsers() {
        return studentService.getAllUsers();
    }


}