package studentportal;

import studentportal.model.Student;
import studentportal.storage.StudentStorage;

import java.util.Scanner;

public class StudentPortal {

    private static Scanner scanner = new Scanner(System.in);
    private static StudentStorage studentStorage = new StudentStorage();

    private static final String EXIT = "0";
    private static final String ADD_STUDENT = "1";
    private static final String PRINT_ALL_STUDENTS = "2";
    private static final String SEARCH_STUDENTS = "3";
    private static final String SEARCH_STUDENTS_BY_COURSE = "4";

    public static void main(String[] args) {
        boolean isRun = true;

        while (isRun) {
            printCommands();

            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_STUDENT:
                    addStudent();
                    break;
                case PRINT_ALL_STUDENTS:
                    studentStorage.print();
                    break;
                case SEARCH_STUDENTS:
                    searchStudent();
                    break;
                case SEARCH_STUDENTS_BY_COURSE:
                    searchStudentByCourse();
                    break;
                default:
                    System.out.println("command not found!");

            }
        }
    }

    private static void printCommands() {
        System.out.println("Please input " + EXIT + " for EXIT");
        System.out.println("Please input " + ADD_STUDENT + " for add Student");
        System.out.println("Please input " + PRINT_ALL_STUDENTS + " for print all Students");
        System.out.println("Please input " + SEARCH_STUDENTS + " for search Student");
        System.out.println("Please input " + SEARCH_STUDENTS_BY_COURSE + " for search Student by course");
    }

    private static void searchStudentByCourse() {
        System.out.println("Please input course");
        String course = scanner.nextLine();
        studentStorage.searchByCourse(course);
    }

    private static void searchStudent() {
        System.out.println("Please input keyword");
        String keyword = scanner.nextLine();
        studentStorage.search(keyword);
    }

    private static void addStudent() {
        System.out.println("Please input name,surname,phone,course");
        String studentDataStr = scanner.nextLine();
        String[] studentDataArr = studentDataStr.split(",");

        Student student = new Student(studentDataArr[0],
                studentDataArr[1],
                studentDataArr[2],
                studentDataArr[3]);

        studentStorage.add(student);
        System.out.println("Student added!!!");

    }

}
