package lesson15;

import java.util.Locale;
import java.util.Scanner;

public class LanguageTest {

    public static void main(String[] args) {
//        Language[] values = Language.values();
//
//        for (Language value : values) {
//            System.out.println(value);
//        }
//        System.out.println("Please choose language");
//        Scanner scanner = new Scanner(System.in);
//
//        String langStr = scanner.nextLine();
//        try {
//            if (langStr != null && !langStr.isEmpty()) {
//                Language language = Language.valueOf(langStr.toUpperCase());
//                System.out.println("you choose " + language + " country is " + language.getCountry());
//            } else {
//                System.out.println("language can't be empty");
//            }
//        } catch (IllegalArgumentException e) {
//            System.out.println("Wrong language");
//        }

        System.out.println(Language.HY.ordinal());
        System.out.println(Language.RU.ordinal());
        System.out.println(Language.EN.ordinal());
        System.out.println(Language.FR.ordinal());

        System.out.println(Language.HY.compareTo(Language.FR));
    }
}
