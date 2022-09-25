package venv.Recursions;
//Intuition behind recursion
public class hello
{
    static void message1()
    {
        System.out.println("Hello");
        message2();
    }
    static void message2()
    {
        System.out.println("Hello");
        message3();

    }static void message3()
    {
        System.out.println("Hello");
        message4();

    }static void message4()
    {
        System.out.println("Hello");
        message5();

    }static void message5()
    {
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        message1();
    }
}