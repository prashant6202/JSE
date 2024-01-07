package ObjectOrientedProgram;

import java.util.Scanner;

public class UseCircle3
{
    public static void main(String[] args)
    {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter radious : ");
        int r= kb.nextInt();
        Circle3 obj=new Circle3(r);
        double result;
       result= obj.calculateArea();
        System.out.println("Area of circle is : "+result);
       result= obj.calculateCircumference();
        System.out.println("Circumfference is : "+result);
    }
}
