/*WAP to accept an integer from the user and calculate and print its FACTORIAL namke such as your code display at 1 if the input is 0. assume that input given will be positive.
========================================================================================*/
import java.util.Scanner;
class Factorial
{
     public static void main(String[]args)
     {
        Scanner kb=new Scanner(System.in);
        int f=1,n,a;
        System.out.println("enter a number");
        n=kb.nextInt();
        a=n;
        while(n>=1)
        {
           f=f*n; 
           n--;
        }
        System.out.println("the FACTORIAL of "+a+" is "+f);
     }
}