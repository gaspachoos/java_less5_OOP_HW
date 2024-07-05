package service;

import model.db.DateBase;
import model.impl.Student;

import java.util.List;

public class StudentService implements UserService<Student> {


    @Override
    public Student createUser(String name, String lastName, int groupId) {
        int id;
        int size = DateBase.studentsDB.size();
        id = size + 1;
        return new Student(id, name, lastName, groupId);
    }

    @Override
    public Student getById(int id) throws Exception {
        Student student = DateBase.studentsDB
                .stream()
                .filter(s -> s.getId() == id)
                .findFirst()
                .orElse(null);
    if (student == null) {
        throw new Exception("Student not found");
    }
    return student;
    }

    public List<Student> getAllUsers(){
        return DateBase.studentsDB;
    }
}
