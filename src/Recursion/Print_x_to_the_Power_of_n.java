package Recursion;

public class Print_x_to_the_Power_of_n
{

    private static int xToThePowerOfN(int x, int n)
    {
        if(n==0)
        {
            return 1;
        }

      int xnm1= xToThePowerOfN(x,n-1); // x to the power of n-1
      int xn = x* xnm1;  // x to the power of n = x * x to the power of n-1

      return xn;


    }

    public static void main(String[] args)
    {

        System.out.println(xToThePowerOfN(2,10));

    }



}
