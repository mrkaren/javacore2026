package lesson13;

import lesson12.A;
import lesson12.B;
import lesson9.Student;

public class Test {

    public static void main(String[] args) {
        B b = new B();

        Student student = new Student();

        String str = "poxos";

        Object[] objArray = new Object[5];

        objArray[0] = student;

        objArray[1] = b;

        objArray[2] = str;


        for (int i = 0; i < 3; i++) {
            if (objArray[i] instanceof Student s) {
                System.out.println(s.phone);
            }else if(objArray[i] instanceof B b1){
                b1.callMe();
            }


        }


    }
}
