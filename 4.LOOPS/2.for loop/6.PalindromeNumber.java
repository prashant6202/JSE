package loops;

import java.util.Scanner;

public class PalindromeNumber
{
    public static void main(String[] args)
    {
        Scanner kb=new Scanner(System.in);
        System.out.print("Enter a number :");
        int n=kb.nextInt();
        int reverse=0;
        int a=n;
        while (n>0)
        {
            int rem = n % 10;
            reverse = reverse * 10 + rem;
            n = n / 10;
        }
        if (a==reverse)
        {
            System.out.println(a+" is palindrome number");
        }
        else
        {
            System.out.println(a+" is not palindrome number");
        }

    }
}

