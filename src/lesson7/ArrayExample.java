package lesson7;

public class ArrayExample {


    public static void main(String[] args) {
        int[] nums = {2, 7};

        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        int startIndex = 0;

        int endIndex = nums.length - 1;

        int tmp = nums[startIndex];

        nums[startIndex] = nums[endIndex];

        nums[endIndex] = tmp;

        for (int num : nums) {
            System.out.print(num + " ");
        }

    }


}
