/* Accept STRING(NAME) from the user by SCANNER
===============================================*/
import java.util.Scanner;
class AcceptName
{
    public static void main(String[]args)
    {
       Scanner kb=new Scanner(System.in); 
       String name;
       System.out.println("what is your name ");
       name=kb.next();
       System.out.println("Your name is "+name);
    }
}