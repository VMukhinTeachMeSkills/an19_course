package lesson14;

public class MyRunnable implements Runnable
{
    @Override
    public void run()
    {
        System.out.println("Thread " + Thread.currentThread().getName() + ", priority" + Thread.currentThread().getPriority());
        for (int i = 0; i < 5000; i++)
        {
            System.out.println("Thread " + Thread.currentThread().getName() + " running " + i);
        }
    }
}
