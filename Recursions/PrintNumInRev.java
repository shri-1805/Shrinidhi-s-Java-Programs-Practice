package venv.Recursions;

public class PrintNumInRev {

    public static void print1ToN(int N)
    {
        if(N>=1)
        {
            print1ToN(N-1);
            System.out.print(N+" ");
            
        }
        return;
    }
    public static void printNto1(int N)
    {
        if(N>=1)
        {
            
            System.out.print(N+" ");
            printNto1(N-1);
            
        }
        return;
    }  
    public static void printNum(int N)
    {
        printNto1(N);
        print1ToN(N);
    }  
    public static void main(String[] args) {
        int N=10;
        printNum(N);
    }
}
