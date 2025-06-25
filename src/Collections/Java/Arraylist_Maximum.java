package Collections.Java;

import java.util.ArrayList;

public class Arraylist_Maximum
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(100);
        list.add(20);
        list.add(30);
        list.add(50);
        list.add(1000);

      int max =Integer.MIN_VALUE;

        for (int i : list)
        {
            // Using Math.max to find the maximum value
            // max = Math.max(max, i);

            // This is the equivalent of the line below

                      // or

            // Using an if condition to find the maximum value


            if(i>max)
            {
                max=i;

            }
        }

        System.out.println("Max Value in ArrayList is: " + max);

    }

}
