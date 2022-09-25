package venv.Recursions;

public class countZeros {
    public static int count0(int N,int count)
    {
        if(N<=0)
            return count;
        if(N%10==0)
            return count0(N/10,count+1);
        return count0(N/10,count);
    }
    public static void main(String[] args) {
        int N=100000;
        System.out.println(count0(N,0));
    }
}
