package lesson7;

public class WhileExample {


    public static void main(String[] args) {

        boolean done = true;
        int a = 0;
        while (done) {
            System.out.println("hi");
            if (a == 10) {
                done = false;
            }
            a++;
        }

    }

}
