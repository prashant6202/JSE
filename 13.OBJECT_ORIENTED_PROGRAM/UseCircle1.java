package ObjectOrientedProgram;

import java.util.Scanner;

public class UseCircle1
{
    public static void main(String[] args)
    {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter radious : ");
        int r= kb.nextInt();
        Circle1 obj;
        obj=new Circle1();
        obj.setRadious(r);
        obj.calculateArea();
        obj.calculatCircumference();
    }
}

