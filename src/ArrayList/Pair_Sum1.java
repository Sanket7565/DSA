package ArrayList;

import java.util.ArrayList;

//BruteForce Approach O(n^2)
public class Pair_Sum1
{
    private static boolean pairSum1_BruteForce(ArrayList<Integer> list, int target)
    {
        for(int i=0; i<list.size();i++)
        {
            for(int j=i+1; j<list.size();j++)
            {
                if(list.get(i)+list.get(j)==target)
                {
                    return true;
                }
            }
        }
        return false;
    }

    //Two Pointer Approach O(n)
    private static boolean pairSum1_TwoPointer(ArrayList<Integer> list, int target)
    {
        int left=0;
        int right=list.size()-1;

        while(left<right)
        {
            if(list.get(left)+list.get(right)==target)
            {
                return true;
            }
            else if(list.get(left)+list.get(right)<target)
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return false;
    }



    public static void main(String[] args)
    {

        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int target=5;

        System.out.println(pairSum1_BruteForce(list,target));

        System.out.println(pairSum1_TwoPointer(list,target));

    }




}
