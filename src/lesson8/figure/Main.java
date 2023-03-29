package lesson8.figure;

public class Main
{
    public static void main(String[] args)
    {
        Figure[] figures = new Figure[5];

        Circle circle1 = new Circle(5);

        figures[0] = circle1;

        float sum = 0f;
        for (int i = 0; i < figures.length; i++)
        {
            sum += figures[i].perimeter();
        }
        System.out.println(sum);
    }
}
