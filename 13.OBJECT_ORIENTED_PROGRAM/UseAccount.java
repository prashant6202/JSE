package ObjectOrientedProgram;

import java.util.Scanner;

public class UseAccount
{
    public static void main(String[] args)
    {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter the size of Account :");
        int accountSize= kb.nextInt();
        Account [] obj=new Account[accountSize];
        for (int i=0;i< obj.length;i++)
        {
            System.out.println("Enter id,name and balance :");
            int id= kb.nextInt();
            String name=kb.next();
            double balance= kb.nextDouble();
            obj[i]=new Account(id,name,balance);
        }
        for(int i=0;i<obj.length;i++)
        {
            obj[i].showAccount();
            System.out.println("=======================================================================");
        }
    }
}
