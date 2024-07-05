import service.StudyGroupService;
import view.StudentView;
import view.StudyGroupView;
import view.TeacherView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Want to create a student or teacher?");
        System.out.println("Student - press 1");
        System.out.println("Teacher - press 2");
        System.out.println("If you have an account and would like to join the study group - press 3");
        Scanner scanner = new Scanner(System.in);

        switch (scanner.nextInt()) {
            case 1 -> new StudentView().start();
            case 2 -> new TeacherView().start();
            case 3 -> new StudyGroupView().startView();

            default -> System.out.println("Please enter a valid option");

        }


    }
}
