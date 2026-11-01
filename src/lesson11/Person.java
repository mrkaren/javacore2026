package lesson11;

public class Person {


    public static final String NATIONALITY;

    static {
        NATIONALITY = "Armenian";
    }

    private String name;
    private String surname;
    private String phone;


    public Person(String name, String surname, String phone) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
    }

    public Person() {
    }

    public static void printNationality() {
        System.out.println(NATIONALITY);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
