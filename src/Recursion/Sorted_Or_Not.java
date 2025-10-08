package Recursion;

public class Sorted_Or_Not
{
    private static boolean sortedOrNot(int[] arr, int i)
    {
        // step 3 : base case
        if(i==arr.length-1)
        {
            return true;
        }

        // step 1 : processing
        if(arr[i]>arr[i+1])
        {
            return false;
        }

        // step 2 : recursive call
        boolean result= sortedOrNot(arr,i+1);

        // step 4 : return result
        return result;


    }


    public static void main(String[] args)
    {
        int arr[]= {1,2,13,4,5};
        System.out.println(sortedOrNot(arr,0));

    }



}
