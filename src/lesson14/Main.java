package lesson14;

public class Main
{
    public static void main(String[] args)
    {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        Thread thread3 = new Thread(new MyRunnable(), "Test thread");
        thread1.setPriority(2);
        thread2.setPriority(6);
        thread3.setPriority(Thread.MAX_PRIORITY);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
