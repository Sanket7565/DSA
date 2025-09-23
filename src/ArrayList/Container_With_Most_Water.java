package ArrayList;

import java.util.ArrayList;

public class Container_With_Most_Water
{

    //BruteForce

    public static int  maxWater_BruteForce(ArrayList<Integer> heights)
    {

        
        int maxWater=0;
        
        for(int i=0; i<heights.size();i++)
        {
            for(int j=i+1; j<heights.size();j++)
            {
                int height= Math.min(heights.get(i), heights.get(j));
                int width= j-i;
                int currentWater= height*width;
                maxWater= Math.max(maxWater, currentWater);
            }
        }

        return maxWater;
    }


    //Two Pointer Approach
    private static int maxWater_TwoPointer(ArrayList<Integer> heights)
    {
        int maxWater=0;
        int left=0;
        int right= heights.size()-1;

        while(left<right)
        {
            int height= Math.min(heights.get(left), heights.get(right));
            int width= right-left;
            int currentWater= height*width;
            maxWater= Math.max(maxWater, currentWater);

            if(heights.get(left)<heights.get(right))
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return maxWater;
    }
    
    
    public static void main(String[] args)
    {
        ArrayList<Integer> heights = new ArrayList<>();
        heights.add(1);
        heights.add(8);
        heights.add(6);
        heights.add(2);
        heights.add(5);
        heights.add(4);
        heights.add(8);
        heights.add(3);
        heights.add(7);

        System.out.println(maxWater_BruteForce(heights));

        System.out.println(maxWater_TwoPointer(heights));
    }




}
