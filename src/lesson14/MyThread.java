package lesson14;

public class MyThread extends Thread
{
    public MyThread(String name)
    {
        super(name);
    }

    public MyThread()
    {
    }

    @Override
    public void run()
    {
        for (int i = 0; i < 10; i++)
        {
            try
            {
                Thread.sleep(500);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            System.out.println("Thread " + getName() + " running " + i);
        }
    }
}
