package lesson9;

import java.util.Objects;

public class Student {

    public String name;
    public String surname;
    public String phone;
    public String course;

    public Student(String name, String surname, String phone,
                   String course) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.course = course;
    }

    public Student() {

    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        Student st = (Student) obj;

        if (name != null && !name.equals(st.name)) {
            return false;
        }
        if (surname != null && !surname.equals(st.surname)) {
            return false;
        }
        if (phone != null && !phone.equals(st.phone)) {
            return false;
        }
        if (course != null && !course.equals(st.course)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(name);
        result = 31 * result + Objects.hashCode(surname);
        result = 31 * result + Objects.hashCode(phone);
        result = 31 * result + Objects.hashCode(course);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone='" + phone + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
}
