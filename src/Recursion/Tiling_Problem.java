package Recursion;

public class Tiling_Problem
{
    private static int tilingFloor(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }

        // vertical choice
        int fnm1= tilingFloor(n-1);

        // horizontal choice
        int fnm2= tilingFloor(n-2);

        int totalWays= fnm1 + fnm2;

        return totalWays;
    }

    public static void main(String[] args)
    {
        System.out.println(tilingFloor(3));

    }



}
