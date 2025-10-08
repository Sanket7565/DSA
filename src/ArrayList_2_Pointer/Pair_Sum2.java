package ArrayList_2_Pointer;

import java.util.ArrayList;

//BruteForce Approach O(n^2)
public class Pair_Sum2
{
    private static boolean pairSum2_BruteForce(ArrayList<Integer> list, int target)
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
    private static boolean pairSum2_TwoPointer(ArrayList<Integer> list, int target)
    {
        int bp=-1;
        //finding breaking point
                for(int i=0; i<list.size();i++)
                {
                    if(list.get(i)>list.get((i+1)%list.size()))
                    {
                        bp=i;
                        break;
                    }
                }

        int left=bp+1;
        int right=bp;

        while(left!=right)
        {
            if(list.get(left)+list.get(right)==target)
            {
                return true;
            }
            else if(list.get(left)+list.get(right)<target)
            {
                left=(left+1)%list.size();
            }
            else
            {
                right=(right-1+list.size())%list.size();
            }
        }
        return false;
    }



    public static void main(String[] args)
    {

        ArrayList<Integer> list= new ArrayList<>();
        list.add(11);
        list.add(12);
        list.add(3);
        list.add(4);
        list.add(5);

        int target=17;

        //System.out.println(pairSum2_BruteForce(list,target));

        System.out.println(pairSum2_TwoPointer(list,target));

    }


}
