package homework2;

public class Homework1 {

    public static void main(String[] args) {
        int x = 16;
        int y = 16;

        if (x > y) {
            System.out.println("x-ը մեծ է y ից");
        }

        if (x < y) {
            System.out.println("y-ը մեծ է x ից");
        }

        if (x == y) {
            System.out.println("x == y");
        }

        System.out.println("_______");

        for (int i = 1; i < 6; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("_______");

        int a = 5;
        int b = 7;

        System.out.println(a + b);

        System.out.println("_______");

        int n = 3;

        for (int i = 1; i < 11; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }

}
