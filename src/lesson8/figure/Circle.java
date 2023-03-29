package lesson8.figure;

public class Circle implements Figure
{
    private float r;

    @Override
    public float perimeter()
    {
        return (float) (2 * Math.PI * r);
    }

    @Override
    public float square()
    {
        return (float) (2 * Math.PI * Math.pow(r, 2));
    }

    public Circle()
    {
    }

    public Circle(float r)
    {
        this.r = r;
    }

    public float getR()
    {
        return r;
    }

    public void setR(float r)
    {
        this.r = r;
    }
}
