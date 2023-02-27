package lesson6;


public class Car
{
    String vin;
    float engineCapacity;
    String mark;
    String wheels;

    public Car()
    {
    }

    public Car(float engineCapacity, String mark)
    {
        this.engineCapacity = engineCapacity;
        this.mark = mark;
    }

    public Car(String vin, float engineCapacity, String mark)
    {
        this.vin = vin;
        this.engineCapacity = engineCapacity;
        this.mark = mark;
    }

    void drive(String name, int speed)
    {
    }
}

