package Recursion;

public class X_to_The_Power_N_Optimized {


    private static int xToPowerNOptimized(int x, int n)
    {

        if(n==0)
        {
            return 1;
        }

        int halfPower= xToPowerNOptimized(x,n/2) * xToPowerNOptimized(x,n/2);

        if(n%2!=0){

            halfPower=x*halfPower;
        }

        return halfPower;
    }


    public static void main(String[] args)
    {

        System.out.println(xToPowerNOptimized(2,10));

    }



}
