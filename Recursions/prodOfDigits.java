package venv.Recursions;

public class prodOfDigits {
    public static int prodDigits(int N)
    {
        if(N<=0)
            return 1;
        return (N%10)*(prodDigits(N/10));
    }
    public static void main(String[] args) {
        int N=53;
        System.out.println(prodDigits(N));
    }
}
