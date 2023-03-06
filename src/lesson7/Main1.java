package lesson7;

public class Main1
{
    int a = 1;

    static
    {
        System.out.println("Static Init Block ");
    }

    {
        System.out.println("Init Block " + a);
        a = 2;
    }

    public Main1()
    {
        System.out.println("Constr " + a);
        a = 3;
    }


    public static void main(String[] args)
    {
        Main1 main = new Main1();
        System.out.println("Main " + main.a);
    }
}
