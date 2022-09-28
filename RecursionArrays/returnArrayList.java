package RecursionArrays;

import java.util.ArrayList;

public class returnArrayList {
    public static ArrayList<Integer> returnArrayList1(int[] arr,int target,int index)
    {
        ArrayList<Integer> list = new ArrayList<>();
        if(index==arr.length)
            return list;
        if(arr[index]==target)
            list.add(index);
        ArrayList<Integer> returnfromBelow=returnArrayList1(arr, target, index+1);
        list.addAll(returnfromBelow);
        return list;
        
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,4,4,4};
        System.out.println(returnArrayList1(arr,4,0));
    }
}
