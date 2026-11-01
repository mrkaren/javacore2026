package lesson9;

public class StackTest {

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(5);

        stack.push(8);

        stack.push(3);

        System.out.println(stack.getTos());

        stack.pop();

    }

}
