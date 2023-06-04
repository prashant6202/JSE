/* Accept FULL NAME form the user by SCANNER
======================================================*/
import java.util.Scanner;
class AcceptFullName
{
   public static void main(String[]args)
   {
      Scanner kb=new Scanner(System.in);
      String name;
      System.out.println("what is your name");
      name=kb.nextLine();
      System.out.println("your name is "+name);
   }
}