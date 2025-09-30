package Bit_Manipulation;

public class Clear_ith_bit
{
    private static void clearBit(int num, int i)
    {
        int bitmask= ~(1<<i);

        int new_num=num & bitmask;

        System.out.println("Number before clearing "+i+"th bit: "+num);
        System.out.println("Number after clearing "+i+"th bit: "+new_num);
    }

    public static void main(String[] args)
    {
        clearBit(10,1);

    }



}
