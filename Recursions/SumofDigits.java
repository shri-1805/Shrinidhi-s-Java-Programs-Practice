package venv.Recursions;

public class SumofDigits {
    public static int sumOfDigits(int N)
    {
        if(N<=0)
            return 0;
        return N%10+sumOfDigits(N/10);
    }
    public static void main(String[] args) {
        int N=1111011110;
        System.out.println(sumOfDigits(N));
    }
}
