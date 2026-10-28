package lesson9;

public class Student {

    public String name;
    public String surname;
    public String phone;
    public String course;

    Student(String name, String surname, String phone,
            String course) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.course = course;
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
