package service;

import model.db.DateBase;
import model.impl.Student;

public class StudentGroupService implements UserGroupService<Student> {

    private DateBase dateBase;

    public StudentGroupService(DateBase dateBase) {
        this.dateBase = dateBase;
    }


    @Override
    public void addUser(Student user) {
        dateBase.studentsDB.add(user);
        System.out.println("Student added to group successfully. ");
    }
}
