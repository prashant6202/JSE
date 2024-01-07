package ObjectOrientedProgram;

import java.util.Scanner;

public class UseFigure
{
    public static void main(String[] args)
    {
        Scanner kb=new Scanner(System.in);
        System.out.println("select a figure: ");
        System.out.println("squre\nrectangle\ncircle : ");
        System.out.println("select a figure in lowerCase : ");
      String choose=kb.next();
        Figure obj=new Figure();
        switch (choose)
        {
            case "squre":
            {
                System.out.println("Enter side of squre: ");
                float side=kb.nextFloat();
                double result=obj.area(side);
                System.out.println("The area of SQURE is : "+result);
                break;
            }
            case "rectangle":
            {
                System.out.println("Enter length and width of rectange: ");
                double l=kb.nextDouble();
                double w=kb.nextDouble();
                double result=obj.area(l,w);
                System.out.println("The area of RECTANGLE is : "+result);
                break;
            }
            case "circle":
            {
                System.out.println("Enter radious of circle: ");
                double r=kb.nextDouble();
                double result=obj.area(r);
                System.out.println("The area of CIRCLE is : "+result);
                break;
            }
            default:
                System.out.println("Wrog choice !");

        }



    }
}
