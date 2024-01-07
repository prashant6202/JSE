package ObjectOrientedProgram;

import java.util.Scanner;

public class UseWorker
{
    public static void main(String[] args)
    {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter number of hours worked : ");
        int hw= kb.nextInt();
        System.out.println("Enter salary : ");
        double rate= kb.nextInt();
        Worker obj=new Worker();
        obj.setData(hw,rate);
       double salary= obj.getSalary();
        System.out.println("salary is : "+salary);

    }

}
