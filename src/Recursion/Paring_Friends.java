package Recursion;

public class Paring_Friends
{
    private static int paringFriends(int n)
    {
        // base case
        if(n==0 || n==1 || n==2)
        {
            return n;
        }

        // single choice
        int fnm1= paringFriends(n-1);

        // pair choice
        int fnm2= (n-1) * paringFriends(n-2);

        int totalWays= fnm1 + fnm2;

        return totalWays;
    }

    public static void main(String[] args)
    {

        System.out.println(paringFriends(3));

    }



}
