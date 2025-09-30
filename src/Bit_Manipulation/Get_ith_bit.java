package Bit_Manipulation;

public class Get_ith_bit
{

    private static void getBit(int num, int i)
    {
        if(((num>>i)&1)==1)      // num>>i shifts the desired bit at LSB position and &1 checks whether it is 1 or 0
        {
            System.out.println(i+"th bit of "+num+" is 1");
        }
        else
        {
            System.out.println(i+"th bit of "+num+" is 0");
        }
    }


    public static void main(String[] args)
    {

        getBit(8,0);
        getBit(8,1);
        getBit(8,2);
        getBit(8,3);
    }



}
