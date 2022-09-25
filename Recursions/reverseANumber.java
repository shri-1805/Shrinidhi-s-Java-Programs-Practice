package venv.Recursions;

public class reverseANumber {
    public static int rev=0;
    public static void reverse(int N)
    {
        if(N==0)
            return;
        int r=N%10;
        rev=(rev*10)+r;
        reverse(N/10);
    }
    public static int reverseWithoutExternalVariable(int N)
    {
        int digits=(int)(Math.log10(N))+1;
        return helper(N,digits);
    }
    public static int helper(int N,int base)
    {
        if(N<10)
            return N;
        int rem =N%10;
        return rem*(int)(Math.pow(10,base-1))+helper(N/10, base-1);
    }
    public static void main(String[] args) {
        int N=12345;
        reverse(N);
        System.out.println(reverseWithoutExternalVariable(N));
        System.out.println(rev);
    }
}
