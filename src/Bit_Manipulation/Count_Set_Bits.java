package Bit_Manipulation;

public class Count_Set_Bits
{
    private static void countSetBits(int num)
    {
        int count=0;

        while(num!=0)
        {
            if((num&1)==1) // check if the last bit is set to 1
        {
            count++;
            num=num>>1;  // right shift by 1 to check next bit
        }
        else
        {
            num=num>>1; // right shift by 1 to check next bit
        }

        }
        System.out.println("Number of set bits: "+count);

    }


    public static void main(String[] args)
    {

        countSetBits(15);
    }


}
