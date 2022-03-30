package Java.Project5;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
        System.out.println("First singleton");
    }

    public static Singleton getInstance() { // #3
        if (instance == null) {        //если объект еще не создан
            instance = new Singleton();    //создать новый объект
        }
        return instance;        // вернуть ранее созданный объект
    }
}