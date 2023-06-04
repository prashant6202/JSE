import java.util.Scanner;
class PrimeNo2
{
    public static void main(String[]args)
    {
       Scanner kb=new Scanner(System.in);
       int n,i;
       System.out.println("enter a number");
       n=kb.nextInt();
       for(i=2;i<n/2;i++)
       {
           if(n%i==0)
            break;
       }
      if(i==n/2)
      System.out.println(n+ " is a prime number");
      else
      System.out.println(n+ " is not a prime number");
   }
}