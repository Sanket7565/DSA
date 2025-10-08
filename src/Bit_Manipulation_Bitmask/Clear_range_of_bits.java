package Bit_Manipulation_Bitmask;

public class Clear_range_of_bits
{

    private static void clearRangeOfBits(int num, int i, int j)
    {
        int a=(~0)<<(j+1);
        int b=(1<<i)-1;
        int bitmask=a|b;
        int newNum=num & bitmask;
        System.out.println("Number before clearing bits from "+i+" to "+j+" : "+num);
        System.out.println("Number after clearing bits from "+i+" to "+j+" : "+newNum);

    }


    public static void main(String[] args)
    {

        clearRangeOfBits(10,2,4);

    }



}
