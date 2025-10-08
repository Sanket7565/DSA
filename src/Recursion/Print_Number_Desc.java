package Recursion;

public class Print_Number_Desc
{
    private static void printDecreasing(int i)
    {
        if(i==1)
        {
            System.out.println(i);
            return;
        }

        System.out.println(i);
        printDecreasing(i-1);
    }


    public static void main(String[] args)

    {

        printDecreasing(10);
    }



}
