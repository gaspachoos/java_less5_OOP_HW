package service;

import model.impl.Student;
import model.impl.StudyGroup;
import model.impl.Teacher;

import java.util.List;

public class StudyGroupService {


    public StudyGroup createStudyGroup(Teacher teacher, List<Student> students) {
        return new StudyGroup(teacher, students);
    }

}
