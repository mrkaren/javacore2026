package lesson10;

import java.util.Locale;

public class StringExample {

    public static void main(String[] args) {

        String name = "poxos";

        String name1 = "Poxos";

        String name2 = new String("poxos");



        System.out.println(name.equalsIgnoreCase(name1));
//        System.out.println(name.equals(name2));

    }

}
