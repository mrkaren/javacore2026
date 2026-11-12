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
        System.arraycopy(array, 0, tmp, 0, array.length);
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
