package Bit_Manipulation_Bitmask;

public class Is_Power_Of_Two
{

    private static void isPowerOfTwo(int n)
    {
        if((n&(n-1))==0)
        {
            System.out.println(n+" is a power of 2");
        }
        else
        {
            System.out.println(n+" is not a power of 2");
        }
    }
    public static void main(String[] args)
    {

        isPowerOfTwo(6);
    }



}
