package lesson14.syncexample;

public class MyThread extends Thread
{
    int count = 0;
    @Override
    public void run()
    {
        for (long i = 0; i < 1000000000l; i++)
        {
            count++;
        }
        System.out.println("Thread ended " + getName());
    }
}
