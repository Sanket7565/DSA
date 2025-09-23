package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist_Sorting
{
    public static void main(String[] args)
    {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(100);
        list.add(20);
        list.add(80);
        list.add(50);
        list.add(1000);

        System.out.println("List before sorting: " + list);

        Collections.sort(list);
        System.out.println("Ascending List after sorting: " + list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending List after sorting: " + list);
    }

}
