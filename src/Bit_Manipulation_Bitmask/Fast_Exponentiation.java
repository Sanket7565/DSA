package Bit_Manipulation_Bitmask;

public class Fast_Exponentiation
{

    private static void fastExponentiation(int a, int n)
    {
        int ans=1;
        while(n>0)
        {
            if((n&1)==1)   // Checking if LSB is 1 (odd) then multiply the ans with base num
            {
                ans=ans*a;
            }
            a= a * a;   // squaring the base

            n=n>>1;        // right shifting the exponent by 1 to move to next bit
        }

        System.out.println("Result: "+ans);

    }

    public static void main(String[] args)
    {

        fastExponentiation(5,5);

    }



}
