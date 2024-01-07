package ObjectOrientedProgram;

import java.util.Scanner;

public class UseMyString
{
    public static void main(String[] args)
    {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter a string : ");
        String s= kb.nextLine();
        MyString obj=new MyString(s);
        obj.reverseString();
        obj.showString();
    }

}
