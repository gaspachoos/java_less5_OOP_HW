package controller;

import model.impl.Student;
import model.impl.StudyGroup;
import model.impl.Teacher;
import service.StudyGroupService;

import java.util.List;

public class StudyGroupController {

    StudyGroupService service = new StudyGroupService();


    public StudyGroup createStudyGroup(Teacher teacher, List<Student> students) {
        return service.createStudyGroup(teacher, students);
    }

}
