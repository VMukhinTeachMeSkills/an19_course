package lesson7.enumexample;

public class Main
{
    public static void main(String[] args)
    {
        DayOfWeek day = DayOfWeek.MONDAY;

        if (day == DayOfWeek.MONDAY)
        {
            System.out.println("First day");
        }
        System.out.println(day.getTitle());
    }
}
