package Java.Project5;
import java.lang.*;

class main {
    public static void main(String[] args) throws Exception {
        Singleton first = Singleton.getInstance();
        Singleton2 second = Singleton2.INSTANCE;
        second.printName();
        Singleton3 third = Singleton3.getInstance();
    }
}