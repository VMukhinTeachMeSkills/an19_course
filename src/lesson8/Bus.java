package lesson8;

public class Bus extends Car implements Drivable, Printable
{
    public static final String COSNT_EXAMPLE = "blabla";

    @Override
    public void drive()
    {
        System.out.println("Bus drive");
    }

    @Override
    public void print()
    {
        System.out.println("Bus print");
    }

    @Override
    public void drive1()
    {
        System.out.println("Bus drive1");
    }

    @Override
    public void drive2()
    {
        System.out.println("Bus drive2");
    }
}
