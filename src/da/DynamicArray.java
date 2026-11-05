package da;

public class DynamicArray {

    private int[] array = new int[10];
    private int size = 0;

    public void add(int n) {
        if (size == array.length) {
            extend();
        }
        array[size++] = n;
    }

    private void extend() {
        int[] tmp = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i];
        }
        array = tmp;
    }

    public int getByIndex(int index) {
        if (index >= 0 && index < size) {
            return array[index];
        }
        return -1;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}
