package venv.Recursions;

public class Fibonacci {
   public static int fibo(int n)
   {
        if(n<2)
            return n;
        return fibo(n-1)+fibo(n-2);
   } 
   public static void main(String[] args) {
       int val=fibo(5);
       System.out.println(val);
       
   }
}
