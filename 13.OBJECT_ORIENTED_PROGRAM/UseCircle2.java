package ObjectOrientedProgram;

import java.util.Scanner;

public class UseCircle2
{
    public static void main(String[] args)
    {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter radoius : ");
        int r=kb.nextInt();
        Circle2 obj=new Circle2();
        double result;
       obj.setRadious(r);
       double res;
      res= obj.calculateArea();
        System.out.println("Area of circle is : "+res);
        res= obj.calculateCircumference();
        System.out.println("Circumference is : "+res);
    }
}
