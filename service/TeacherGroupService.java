package service;

import model.db.DateBase;
import model.impl.Teacher;

public class TeacherGroupService implements UserGroupService<Teacher>{

    private DateBase dateBase;

    public TeacherGroupService(DateBase dateBase) {
        this.dateBase = dateBase;
    }

    @Override
    public void addUser(Teacher user) {
        dateBase.teachersDB.add(user);
        System.out.println("Teacher added to group successfully. ");
    }
}
