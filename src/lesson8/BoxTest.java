package lesson8;

public class BoxTest {

    public static void main(String[] args) {

        Box myBox = new Box();
        myBox.setDim(1, 3, 6);

        double volume = myBox.volume();
        double doubleVolume = volume * 2;

        System.out.println(volume);
        System.out.println(doubleVolume);


    }

}
