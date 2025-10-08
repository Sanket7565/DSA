package Bit_Manipulation_Bitmask;

public class Clear_i_bits
{

    private static void clearIBits(int nuum, int i)
    { 
        int bitMask= ~(0)<<i; // bitmask to clear last i bits
        int newNum=nuum & bitMask;  // AND operation to clear last i bits
        System.out.println("Number before clearing last "+i+" bits: "+nuum);  // print original number
        System.out.println("Number after clearing last "+i+" bits: "+newNum);  // print new number after clearing last i bits
        //return newNum;
    }

    public static void main(String[] args)
    {
        clearIBits(15,2);

    }



}
