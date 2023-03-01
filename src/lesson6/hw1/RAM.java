package lesson6.hw1;

public class RAM
{
    String name;
    float capacity;

    public RAM()
    {
    }

    public RAM(String name, float capacity)
    {
        this.name = name;
        this.capacity = capacity;
    }

    void show()
    {
        System.out.println("RAM: " + name + " " + capacity + " ");
    }
}
