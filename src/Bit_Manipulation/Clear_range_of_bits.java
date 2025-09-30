package Bit_Manipulation;

public class Clear_range_of_bits
{

    private static void clearIBits(int nuum, int i)
    {
        int bitMask= ~(0)<<i;
        int newNum=nuum & bitMask;
        System.out.println("Number before clearing last "+i+" bits: "+nuum);
        System.out.println("Number after clearing last "+i+" bits: "+newNum);
        //return newNum;
    }

    public static void main(String[] args)
    {
        clearIBits(15,2);

    }



}
