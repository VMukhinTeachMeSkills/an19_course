package lesson14.syncexample;

public class Main1
{
    static int count = 0;

    public static void main(String[] args)
    {
        long start = System.currentTimeMillis();
        for (long i = 0; i < 3000000000l; i++)
        {
            count++;
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
