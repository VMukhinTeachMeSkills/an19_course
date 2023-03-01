package lesson7;

public class Main1
{
    public static void main(String[] args)
    {
        sendMessage("123");
        sendMessage("123", "456");
        sendMessage("123", "456", "789");

    }

    static void sendMessage(String str, String ...a)
    {
    }
}
