package view;

import model.db.DateBase;
import model.impl.Student;
import model.impl.StudyGroup;
import model.impl.Teacher;

import java.util.List;
import java.util.Random;

public class StudyGroupView {


    public DateBase db;

    public void startView() {
        db = new DateBase();
        db.fillDB();
        createRandomStudyGroup();

    }

    public StudyGroupView() {
        this.db = new DateBase();
    }

    private Teacher getRandTeacher() {
        Random rand = new Random();
        int randomIndex = rand.nextInt(db.teachersDB.size());
        return db.teachersDB.get(randomIndex);
    }

    private StudyGroup createStudyGroup(Teacher teacher, List<Student> students) {
        return new StudyGroup(teacher, students);
    }

    private StudyGroup createRandomStudyGroup() {
        Teacher randomTeacher = getRandTeacher();
        List<Student> students = db.studentsDB;
        StudyGroup studyGroup = createStudyGroup(randomTeacher, students);
        System.out.println("Congratulations! You have a study group!");

        System.out.println(studyGroup);
        return studyGroup;
    }


}