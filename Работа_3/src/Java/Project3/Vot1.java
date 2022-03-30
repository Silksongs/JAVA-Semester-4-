package Java.Project3;
import java.lang.*;
import java.util.concurrent.locks.*;
import java.util.concurrent.*;
import java.util.*;

class main {
    static volatile Map<Integer, String> map = new HashMap<>();
    static volatile Set set = new HashSet();
    private static final Lock lock = new ReentrantLock();
    private static final Semaphore semaphore = new Semaphore(1);

    //MAP
    static void putMap(int integer, String string) {
        lock.lock();
        map.put(integer, string);
        lock.unlock();
    }

    //SET
    static void putSet(String string) {
        try {
            semaphore.acquire();
            set.add(string);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws Exception {
        //MAP
        Thread one = new Thread(()->{
            for (int i = 0 ; i < 1000; i ++)
                putMap(i, "string " + i);
        });
        Thread two = new Thread(()->{
            for (int i = 1000 ; i < 2000; i ++)
                putMap(i, "string " + i);
        });
        one.start();
        two.start();
        Thread.sleep(3000);
        System.out.println(map.size());


        //SET
        Thread help1 = new Thread(()->{
            for (int i = 0 ; i < 1000; i ++)
                putSet("string" + i);
        });
        Thread help2 = new Thread(()->{
            for (int i = 1000 ; i < 2000; i ++)
                putSet("string " + i);
        });
        help1.start();
        help2.start();
        Thread.sleep(3000);
        System.out.println(set.size());
    }
}
