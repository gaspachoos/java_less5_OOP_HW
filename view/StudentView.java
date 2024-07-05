package view;

import controller.StudentController;
import model.db.DateBase;
import model.impl.Student;

import java.util.List;
import java.util.Scanner;

public class StudentView {

    private StudentController controller = new StudentController();

    public void start(){
        DateBase.fillDB();
        Scanner scanner = new Scanner(System.in);
        while(true){

            System.out.println("If you want to create an account, press 1: ");
            System.out.println("If you want to find a student by ID, press 2: ");
            System.out.println("If you want to see the list of students, press 3: ");
            System.out.println("if you want to log out, press 4: ");

            switch (scanner.nextInt()){
                case 1 -> createUser();
                case 2 -> getById();
                case 3 -> getAllUsers();
                case 4 -> System.exit(0);
                default -> System.out.println("Invalid input");

            }
        }

    }

    private Student createUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student name: ");
        String name = scanner.nextLine();
        System.out.println("Enter student last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Enter student group Id: ");
        int groupId = scanner.nextInt();
        Student student = controller.createUser(name, lastName, groupId);
        System.out.println(student);
        DateBase.studentsDB.add(student);
        return student;
    }

    private Student getById() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student id: ");
        int id = scanner.nextInt();
        Student student = controller.getById(id);
        System.out.println(student);
        return student;
    }

    private List<Student> getAllUsers() {
        List<Student> students = controller.getAllUsers();
        System.out.println(students);
        return students;

    }

}
