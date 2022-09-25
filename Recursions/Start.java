package venv.Recursions;

public class Start 
{
    private static final int _1001 = 1001;
    public static void print1(int n)
    {
        if(n>0)
        {
            print1(n-1);
            System.out.print(n+" ");
        }
    }
    public static void main(String[] args) {
        print1(_1001);
    }
}
