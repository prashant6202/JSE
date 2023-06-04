/* Accept Float from the user by SCANNER
============================================*/
import java.util.Scanner;
class AcceptFloat
{
   public static void main(String[]args)
   {
      Scanner kb=new Scanner(System.in);
      float a,b,c;
      System.out.println("enter first number");
      a=kb.nextFloat();
      System.out.println("enter second number");
      b=kb.nextFloat();
      c=a+b;
      System.out.println("first number is "+a);
      System.out.println("second number is "+b);
      System.out.println("their sum is "+c);
    }
}