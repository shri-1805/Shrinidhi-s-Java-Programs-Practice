/*
This simple starter code for Java data structures gets an array of size N
and prints the same
*/

import java.util.Scanner;
class Hello
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of inputs");
        int N=sc.nextInt();
        System.out.println("The Number of inputs to be given is: "+N+"\nEnter the values: ");
        int[] arr=new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("The output is : ");
        for(int i=0;i<N;i++)
        {
            System.out.print(arr[i]);
        }
        sc.close();
    }
}