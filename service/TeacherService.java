package service;


import model.db.DateBase;
import model.impl.Student;
import model.impl.Teacher;

import java.util.List;

public class TeacherService implements UserService<Teacher>{
    @Override
    public Teacher createUser(String name, String lastName, int groupId) {
        int id;
        int size = DateBase.teachersDB.size();
        id = size + 1;
        return new Teacher(id, name, lastName, groupId);
    }

    @Override
    public Teacher getById(int id) throws Exception {
        Teacher teacher = DateBase.teachersDB
                .stream()
                .filter(s -> s.getId() == id)
                .findFirst()
                .orElse(null);
        if (teacher == null) {
            throw new Exception("Teacher not found");
        }
        return teacher;
    }

    @Override
    public List<Teacher> getAllUsers() {
        return DateBase.teachersDB;
    }
}
