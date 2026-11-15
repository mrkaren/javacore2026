package studentportal;

public interface Commands {

    String EXIT = "0";
    String ADD_STUDENT = "1";
    String PRINT_ALL_STUDENTS = "2";
    String SEARCH_STUDENTS = "3";
    String SEARCH_STUDENTS_BY_COURSE = "4";

    String ADD_COURSE = "5";
    String PRINT_ALL_COURSES = "6";

    static void printCommands() {
        System.out.println("Please input " + EXIT + " for EXIT");
        System.out.println("Please input " + ADD_STUDENT + " for add Student");
        System.out.println("Please input " + PRINT_ALL_STUDENTS + " for print all Students");
        System.out.println("Please input " + SEARCH_STUDENTS + " for search Student");
        System.out.println("Please input " + SEARCH_STUDENTS_BY_COURSE + " for search Student by course");
        System.out.println("Please input " + ADD_COURSE + " for add Course");
        System.out.println("Please input " + PRINT_ALL_COURSES + " for PRINT_ALL_COURSES");
    }

}
