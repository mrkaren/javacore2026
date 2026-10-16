package lesson5;

public class TernarExample {

    public static void main(String[] args) {
        int a = 10;
        int b = a > 100 ? -1 : 1;


        if (a > 100) {
            b = -1;
        } else {
            b = 1;
        }

    }
}
