package RecursionArrays;
import java.util.ArrayList;

public class linearSearch {
    public static int linear(int[] arr,int target,int index)
    {
        if(index==arr.length)
        {
            return -1;
        }
        if(arr[index]==target)
            return index;
        return linear(arr, target, index+1);
    }
    public static int reverseLinear(int[] arr,int target,int index)
    {
        if(index==-1)
            return -1;
        if(arr[index]==target)
            return -(arr.length-index);
        return reverseLinear(arr, target, index-1);
    }
    public static ArrayList<Integer> findAllOccurrences(int[] arr,int target,int index,ArrayList<Integer> array)
    {
        if(index==arr.length)
        {
            return array;
        }
        if(arr[index]==target)
        {
            array.add(index);
        }
        return findAllOccurrences(arr, target, index+1,array);
    }
   public static void main(String[] args) {
       int[] arr={1,2,3,7,5,5,6};
       ArrayList<Integer> array=new ArrayList<Integer>();
       System.out.println(linear(arr,1,0));
       System.out.println(reverseLinear(arr,4,arr.length-1));
       System.out.println(findAllOccurrences(arr,4,0,array));
   } 
}