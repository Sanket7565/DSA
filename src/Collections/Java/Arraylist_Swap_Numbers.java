package Collections.Java;

import java.util.ArrayList;

public class Arraylist_Swap_Numbers
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(100);
        list.add(20);
        list.add(30);
        list.add(50);
        list.add(1000);

        int index1 = 1; // Index of the first number to swap

        int index2 = 3; // Index of the second number to swap

        // Swapping the elements at index1 and index2
        System.out.println("List before swap "+list);

        int temp;

        temp=list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);

        System.out.println("List after swap "+list);




    }
}
