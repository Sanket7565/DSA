package Collections.Java;

import java.util.ArrayList;

public class Reverse_Arraylist {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        //Brute Force
        for( int i= list.size()-1;i>=0;i--)
        {
            System.out.println(list.get(i));
        }
    }
}