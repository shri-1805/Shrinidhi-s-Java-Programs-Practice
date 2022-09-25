package venv.Recursions;

public class noOfStepsToReduceToZero {
    public static int steps(int N)
    {
        return helper(N, 0);
    }
    public static int helper(int N,int val)
    {
        if(N==0)
            return val;
        else if(N%2==0)
            return helper(N/2, val+1);
        return helper(N-1, val+1);
    }
    public static void main(String[] args) {
        int N=131207;
        System.out.println(steps(N));
    }
}
