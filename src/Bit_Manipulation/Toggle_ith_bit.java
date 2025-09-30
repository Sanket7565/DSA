package Bit_Manipulation;

public class Toggle_ith_bit
{
    private static void toggleIthBit(int num, int i)
    {
        System.out.println("Number before toggling "+i+"th bit: "+num);

        int bitMask=1<<i;   // left shift 1 by i positions to create a bitmask
        int newNum=num ^ bitMask; // OR operation to set the ith bit

        System.out.println("Number after toggling "+i+"th bit: "+newNum);
    }


    public static void main(String[] args)
    {
        toggleIthBit(10,0);

    }


}
