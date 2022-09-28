package RecursionArrays;

public class rotatedBinary {
    public static int findTarget(int[] arr,int target,int s,int e)
    {
        if(s>e)
            return -1;
        int mid=s+(e-s)/2;
        if(arr[mid]==target)
            return mid;
        if(arr[s]<=arr[mid])
        {
            if(target>=arr[s] && target<=arr[mid])
                return findTarget(arr,target,s,mid-1);
            else
                return findTarget(arr, target, mid+1, e);
        }
        if(arr[mid]<=target)
        {
            if(target>=arr[mid] && target<=arr[e])
                return findTarget(arr, target, mid+1, e);
        }
        
        return findTarget(arr, target, s, mid-1);
        
    }
    public static void main(String[] args) {
        int[] arr={5,6,7,1,2,3,4};
        System.out.println(findTarget(arr,6,0,arr.length-1));
    }
}
