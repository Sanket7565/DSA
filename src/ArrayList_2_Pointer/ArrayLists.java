package ArrayList_2_Pointer;

import java.util.ArrayList;

public class ArrayLists
{
    public static void main(String[] args) {


        ArrayList<Integer> list= new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.remove(0);

        for (int i=0; i<list.size();i++)
        {
            System.out.print(list.get(i)+" ");
        }

    }

}
