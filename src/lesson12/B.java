package lesson12;

public class B extends A {

    public  int j;


    @Override
    public Object clone() {
        B b = new B();
        b.j = j;
        return b;
    }

    @Override
    public void meth1() {

    }
}
