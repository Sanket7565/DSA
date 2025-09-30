package Bit_Manipulation;

public class Odd_Even
{
    public static void Odd_Even(int n)

    {
        if((n&1)==0)
        {
            System.out.println("Even Number");
        }
        else
        {
            System.out.println("Odd Number");
        }

}
    public static void main(String[] args)
    {

        Odd_Even(10);
        Odd_Even(11);
        Odd_Even(12);
        Odd_Even(13);

    }

}
