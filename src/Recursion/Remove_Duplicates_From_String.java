package Recursion;

public class Remove_Duplicates_From_String
{
    private static StringBuilder removeDuplicates(String str, int i, StringBuilder newStr, boolean[] map)
    {
        if(i==str.length())
        {
            return newStr;
        }

        char currChar=str.charAt(i);
        if(map[currChar - 'a']==true)
        {
            return removeDuplicates(str,i+1,newStr,map);
        }
        else
        {
            map[currChar - 'a']=true;
            newStr.append(currChar);
            return removeDuplicates(str,i+1,newStr,map);
        }




    }

    public static void main(String[] args)
    {

        String str="appnacolleges";
        StringBuilder newStr=new StringBuilder();
        boolean[] map=new boolean[26];
        System.out.println(removeDuplicates(str,0,newStr,map));

    }



}
