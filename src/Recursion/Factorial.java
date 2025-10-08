package Recursion;

public class Factorial
{
    public static void main(String[] args)
    {

       System.out.println(factorial(5));

    }

    private static int factorial(int i)
    {

        if(i==0)
        {
            //System.out.println(1);
            return 1;
        }

        int fact=i*factorial(i-1);

        return fact;
    }

}
