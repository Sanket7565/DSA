package Recursion;

public class Sum_of_Natural_Nums
{
    private static int sumNatural(int i)
    {
        if(i==1)
        {
            return 1;

        }

        int sum = i + sumNatural(i-1);
        //System.out.println(sum);
        return sum;


    }

    public static void main(String[] args)
    {

        System.out.println(sumNatural(10));

    }



}
