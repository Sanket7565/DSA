package Bit_Manipulation_Bitmask;

public class Set_ith_bit
{
    private static void setIthBit(int num, int i)
    {
        System.out.println("Number before setting "+i+"th bit: "+num);

        int bitMask=1<<i;   // left shift 1 by i positions to create a bitmask
        int newNum=num | bitMask; // OR operation to set the ith bit

        System.out.println("Number after setting "+i+"th bit: "+newNum);
    }


    public static void main(String[] args)
    {
        setIthBit(10,2);

    }


}
