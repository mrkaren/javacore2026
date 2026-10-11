package lesson3;

public class ArrayExample {

    public static void main(String[] args) {

        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print(numbers[i] + " ");
        }

        numbers[0] = 22;
        numbers[3] = 88;
        numbers[1] = 77;
        numbers[2] = 99;


        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print(numbers[i] + " ");
        }



    }
}
