package Java.Project5;

public class Singleton3{
    private static volatile Singleton3 instance;

    private Singleton3() {
        System.out.println("Singleton3 variation");
    }

    public static Singleton3 getInstance() {
        if (instance == null) {
            synchronized (Singleton3.class) {
                if (instance == null) {
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }
}