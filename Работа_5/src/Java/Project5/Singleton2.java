package Java.Project5;

public class Singleton2 {

    private Singleton2() {
        System.out.println("Singleton created!");
    }

    public static final Singleton2 INSTANCE = new Singleton2();

    public void printName() {
        System.out.println("I am a Singleton!");
    }
}
