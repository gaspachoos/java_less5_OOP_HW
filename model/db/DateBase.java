package model.db;

import model.impl.Student;
import model.impl.Teacher;

import java.util.ArrayList;
import java.util.List;

public class DateBase {

    public static final List<Student> studentsDB = new ArrayList<>();

    public static final List<Teacher> teachersDB = new ArrayList<>();

    public static void fillDB(){
        Teacher teacher = new Teacher(1,"Бенуа","Мальденброт",1);
        teachersDB.add(teacher);

        Student student1 = new Student(1,"Mark","Zuckerberg",1);
        Student student2 = new Student(2,"Pavel","Durov",1);
        studentsDB.add(student1);
        studentsDB.add(student2);
    }
}
