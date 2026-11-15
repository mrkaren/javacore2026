package studentportal.storage;

import studentportal.model.Course;

public class CourseStorage {

    private Course[] array = new Course[10];
    private int size = 0;


    public void add(Course ... courses){
        for (Course c : courses) {
            add(c);
        }
    }

    public void add(Course c) {
        if (size == array.length) {
            extend();
        }
        array[size++] = c;
    }

    private void extend() {
        Course[] tmp = new Course[array.length + 10];
        System.arraycopy(array, 0, tmp, 0, array.length);
        array = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println();
    }

    public Course getCourseByName(String courseName) {
        for (int i = 0; i < size; i++) {
            if (array[i].getName().equalsIgnoreCase(courseName)) {
                return array[i];
            }
        }
        return null;
    }
}
