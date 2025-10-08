package Recursion;

public class Nth_Fibonacci_Number
{
    private static int fibonacci(int n)
    {
        if(n==0 || n==1)
        {
            return n;
        }

        int fnm1=fibonacci(n-1); // fibonacci of n-1
        int fnm2=fibonacci(n-2); // fibonacci of n-2
        int fn=fnm1+fnm2;  // fibonacci of n = fibonacci of n-1 + fibonacci of n-2

        return fn;
    }


    public static void main(String[] args)
    {

        System.out.println(fibonacci(7));


    }



}
