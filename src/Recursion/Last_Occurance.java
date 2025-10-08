package Recursion;

public class Last_Occurance
{

    private static int lastOccurance(int[] arr, int target, int i)
    {
        // base case
        if(i==0)
        {
            return -1;
        }

        // processing
        if(arr[i]==target)
        {
            return i;
        }

        //
        return lastOccurance(arr,target,i-1);


    }


    public static void main(String[] args)
    {

        int arr[]= {1,2,3,4,2,5};
        int target=51;

        System.out.println(lastOccurance(arr,target,arr.length-1)); // passing last index of array

    }



}
