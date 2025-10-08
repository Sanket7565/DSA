package Recursion;

public class First_Occurance
{

    private static int firstOccurance(int[] arr, int target, int i)
    {
        // base case
        if(i==arr.length)
        {
            return -1;
        }

        // processing
        if(arr[i]==target)
        {
            return i;
        }

        //
        int result= firstOccurance(arr,target,i+1);

        // return result
        return result;
    }


    public static void main(String[] args)
    {
        int arr[]= {1,2,3,4,2,5};
        int target=5;
        System.out.println(firstOccurance(arr,target,0));

    }



}
