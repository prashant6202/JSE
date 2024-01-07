package ObjectOrientedProgram;

import java.util.Scanner;

public class UseParamittrizedStudent
{
    public static void main(String[] args)
    {
        Scanner kb=new Scanner(System.in);
        System.out.println("enter roll,name,percentage : ");
        int roll= kb.nextInt();
        String str=kb.next();
        double p= kb.nextDouble();
        ParamittrizedStudent obj=new ParamittrizedStudent();
        obj.setStudent(roll,str,p);
        obj.getStudent();
    }
}
