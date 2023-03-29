package lesson14.syncexample;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Main
{
    public static void main(String[] args) throws InterruptedException
    {
        long start = System.currentTimeMillis();
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        MyThread thread3 = new MyThread();
        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();
        long end = System.currentTimeMillis();
        System.out.println(end - start);

    }
}