package venv.Recursions;

public class Factorial {
    public static int fact(int N)
    {
        if(N<0)
            return 0;
        if(N==0 || N==1)
            return 1;
        return N*fact(N-1);
    }
    public static void main(String[] args) {
        int N=4;
        System.out.println(fact(N));
    }
}