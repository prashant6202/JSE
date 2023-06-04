package loops;

import java.util.Scanner;

public class Prime3 {
    public static void main(String[] args)
    {
        Scanner kb=new Scanner(System.in);
        int n,i,p=0;
        System.out.println("enter a number");
        n= kb.nextInt();
        int number=(int)Math.sqrt(n);
        for (i=2;i<=number;i++)
        {
            if (n%i==0)
            {
                p=1;
                break;
            }
        }
        if (p==0)
            System.out.println(+n+" is a PRIME NUMBER");
        else
            System.out.println(+n+" is not PRIME NUMBER");

    }
}
