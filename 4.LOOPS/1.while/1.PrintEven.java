 /*wap to accept an integer from the user and print all the even no from 1 to that number assume that inpot given by user will be positive only.
===========================================================================================*/
import java.util.Scanner;
class PrintEven
{
    public static void main(String[]args)
    {
        Scanner kb=new Scanner(System.in);
        int i=2,n;
        System.out.print("enter a number ");
        n=kb.nextInt();
        while(i<=n)
        {
           System.out.println(i);
           i=i+2;
        }
    }
}