package studentportal;

import studentportal.model.Course;
import studentportal.model.Student;
import studentportal.storage.CourseStorage;
import studentportal.storage.StudentStorage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class StudentPortal implements Commands {

    private static Scanner scanner = new Scanner(System.in);
    private static StudentStorage studentStorage = new StudentStorage();
    private static CourseStorage courseStorage = new CourseStorage();

    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


    public static void main(String[] args) throws ParseException {
        boolean isRun = true;
        initData();

        while (isRun) {
            Commands.printCommands();

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
                case ADD_COURSE:
                    addCourse();
                    break;
                case PRINT_ALL_COURSES:
                    courseStorage.print();
                    break;
                default:
                    System.out.println("command not found!");

            }
        }
    }

    private static void initData() throws ParseException {
        Course php = new Course("php", "poxos teacher", 12.3, sdf.parse("16/11/2026"));
        Course js = new Course("js", "petros teacher", 12.3, sdf.parse("20/11/2026"));

        courseStorage.add(php, js);

        Student student1 = new Student("poxos student", "poxosyan", "098222222", php);
        Student student2 = new Student("petros student", "petrosyan", "0983333333", js);

        studentStorage.add(student1);
        studentStorage.add(student2);

    }

    private static void addCourse() {
        System.out.println("Please input course name,teacherName,price,startDate(dd/MM/yyyy)");

        String courseDataStr = scanner.nextLine();
        String[] courseDataArr = courseDataStr.split(",");

        Course course = new Course();
        course.setName(courseDataArr[0]);
        course.setTeacherName(courseDataArr[1]);
        double price;
        try {
            price = Double.parseDouble(courseDataArr[2]);
        } catch (NumberFormatException e) {
            price = 0;
        }
        course.setPrice(price);

        Date startDate;
        try {
            startDate = sdf.parse(courseDataArr[3]);
        } catch (ParseException e) {
            System.out.println("Date format is invalid. Start date will be null");
            startDate = null;
        }
        course.setStartDate(startDate);

        courseStorage.add(course);

        System.out.println("Course added!");

    }

    private static void searchStudentByCourse() {
        System.out.println("please choose course from list");
        courseStorage.print();

        String courseName = scanner.nextLine();
        Course course = courseStorage.getCourseByName(courseName);
        if (course == null) {
            System.out.println("please input valid course name");
            return;
        }

        studentStorage.searchByCourse(course);
    }

    private static void searchStudent() {
        System.out.println("Please input keyword");
        String keyword = scanner.nextLine();
        studentStorage.search(keyword);
    }

    private static void addStudent() {
        System.out.println("please choose course from list");
        courseStorage.print();

        String courseName = scanner.nextLine();
        Course course = courseStorage.getCourseByName(courseName);
        if (course == null) {
            System.out.println("please input valid course name");
            return;
        }

        System.out.println("Please input name,surname,phone");
        String studentDataStr = scanner.nextLine();
        String[] studentDataArr = studentDataStr.split(",");


        Student student = new Student(studentDataArr[0],
                studentDataArr[1],
                studentDataArr[2],
                course);

        studentStorage.add(student);
        System.out.println("Student added!!!");

    }
}
