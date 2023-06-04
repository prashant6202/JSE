/* Accepting the INTEGER from the user
==================================================*/
import java.util.Scanner;
class AcceptInt
{
    public static void main(String[]args)
    {
       Scanner kb;
       kb=new Scanner(System.in);
       int a,b,c;
       System.out.println(" enter first number ");
       a=kb.nextInt();
       System.out.println("enter second number ");
       b=kb.nextInt();
       c=a+b;
       System.out.println("first number is :"+a);
       System.out.println("second number is :"+b);
       System.out.println("their sum is :"+c); 
     }
}