package loops;

import java.util.Scanner;

public class PlandromString
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = kb.next();
        int strLength=str.length();
        String reverse ="";
        for (int i=(strLength-1);i>=0;i--)
        {
            reverse=reverse+str.charAt(i);
        }
        if (str.equalsIgnoreCase(reverse))
            System.out.println("it is palandrom");
        else
            System.out.println("it is not palandrom");

    }
}