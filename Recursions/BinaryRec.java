package venv.Recursions;

public class BinaryRec {
    public static void main(String[] args) {
        int[] arr={1,2,5,10,25,35};
        int target=1;
        System.out.println(binary(arr, target,0,5));
    }
    static int binary(int[] arr,int target,int s,int e)
    {
        if(s<e)
        {   int mid=s+(e-s)/2;
            if(arr[mid]==target)
                return mid;
            else if(arr[mid]<target)
            {
                return binary(arr, target, mid+1, e);
            }
            else//arr[mid]>target
            {
                return binary(arr, target, s, mid-1);
            }
        }
        return -1;
    }
}