package Recursion;

public class Print_Number_Increasing
{

    private static void printIncreasing(int i)
    {
        if(i==1)
        {
            System.out.println(i);
            return;
        }

        printIncreasing(i-1);
        System.out.println(i);
    }

    public static void main(String[] args)
    {

        printIncreasing(10);

    }



}
