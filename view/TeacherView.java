package view;

import controller.TeacherController;
import model.db.DateBase;
import model.impl.Student;
import model.impl.Teacher;

import java.util.List;
import java.util.Scanner;

public class TeacherView {

    private TeacherController controller = new TeacherController();

    public void start() throws Exception {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("If you want to create an account, press 1: ");
            System.out.println("If you want to find a teacher by ID, press 2: ");
            System.out.println("If you want to see the list of teachers, press 3: ");
            System.out.println("if you want to log out, press 4: ");

            switch (scanner.nextInt()) {
                case 1 -> createUser();
                case 2 -> getById();
                case 3 -> getAllUsers();
                case 4 -> System.exit(0);
                default -> System.out.println("Invalid input");

            }
        }

    }
    private Teacher createUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student name: ");
        String name = scanner.nextLine();
        System.out.println("Enter student last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Enter student group Id: ");
        int groupId = scanner.nextInt();
        Teacher teacher = controller.createUser(name, lastName, groupId);
        System.out.println(teacher);
        DateBase.teachersDB.add(teacher);
        return teacher;
    }


    private Teacher getById() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student id: ");
        int id = scanner.nextInt();
        Teacher teacher = controller.getById(id);
        System.out.println(teacher);
        return teacher;
    }

    private List<Teacher> getAllUsers() {
        List<Teacher> teacher = controller.getAllUsers();
        System.out.println(teacher);
        return teacher;

    }

}