package lesson14;

public class Main1
{
    public static void main(String[] args) throws InterruptedException
    {
        MyThread thread1 = new MyThread("A");
        MyThread thread2 = new MyThread("B");
        MyThread thread3 = new MyThread("C");

        thread1.start();
        thread2.start();
        thread1.join();
        thread3.start();
    }
}
