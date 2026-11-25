package lesson14;

public class ExceptionExample {

    public static void main(String[] args) {
        String numberStr = "123q";

        try {
            int i = Integer.parseInt(numberStr);
            int a = 7 / 0;
            System.out.println(i);
        } catch (NumberFormatException e) {
            System.out.println("Please input valid number");
        } catch (ArithmeticException e) {
            System.out.println("Invalid / operation");
        } catch (Exception e) {

        }

    }

}
