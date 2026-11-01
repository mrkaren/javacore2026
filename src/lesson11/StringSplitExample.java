package lesson11;

import java.util.Scanner;

public class StringSplitExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input student's name surnames splited by ,");

        String nameSurnames = scanner.nextLine();

        String[] nameSurnameArray = nameSurnames.split(",");

        for (String nameSurname: nameSurnameArray) {
            String[] s = nameSurname.split(" ");
            System.out.println("name = " + s[0] + " surname = " + s[1]);
        }

    }
}
