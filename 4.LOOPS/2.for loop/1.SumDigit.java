import java.util.Scanner;
class SumDigit
{
   public static void main(String[]args)
   {
       Scanner kb=new Scanner(System.in);
       int n,sum,rem;
       System.out.println("enter a number ");
       n=kb.nextInt();
       for(sum=0;n>0;n=n/10)
       {
          rem=n%10;
          sum=sum+rem;
       }
       System.out.println("sum of digits is "+sum);
    }
}