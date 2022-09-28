package RecursionArrays;
import java.util.ArrayList;

public class sorted {
    public static void printval(ArrayList<Integer> arr)
    {
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static boolean helper(ArrayList<Integer> arr,int prev,int l)
    {
        if(l<=0)
            return true;
        if(arr.get(0)>prev)
        {
            int val=arr.remove(0);
            return helper(arr, val, l-1);
        }
        else
        {   
            return false;
        }
    }
    public static boolean isSorted(ArrayList<Integer> arr)
    {
        int l=arr.size();
        if(l==0)
            return true;
        int val=arr.remove(0);
        return helper(arr,val,l-1);
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(23);
        arr.add(24);
        arr.add(25);
        printval(arr);
        System.out.println("The Answer is "+ (isSorted(arr)?"Yes":"No"));
    }
}
