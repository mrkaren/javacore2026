package studentportal.storage;

import studentportal.model.Course;
import studentportal.model.Student;

public interface IStudentStorage {

    void add(Student s);

    Student getByIndex(int index);

    void print();

    void search(String keyword);

    void searchByCourse(Course course);
}
