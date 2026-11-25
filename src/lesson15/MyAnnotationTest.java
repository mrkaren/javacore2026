package lesson15;

@MyAnnotation(str = "petros")
public class MyAnnotationTest {

    @MyAnnotation
    public static void main(@MyAnnotation String[] args) {
        Integer i = new Integer(8);
    }

    @Deprecated
    public static void meth(){
        System.out.println("hello");
    }
}
