package lesson7.enumexample;

public enum DayOfWeek
{
    MONDAY("Понедельник"),TUESDAY("Вторник"),WEDNESDAY("Среда");
    private String title;

    DayOfWeek(String title)
    {
        this.title = title;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }
}
