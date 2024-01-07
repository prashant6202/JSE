package ObjectOrientedProgram;

public class MyString
{
    private String orignal;
    private String reverse="";
    public MyString(String s)
    {
        orignal=s;
    }
    public void reverseString()
    {
        for (int i=orignal.length()-1;i>=0;i--)
        {
            reverse=reverse+orignal.charAt(i);
        }
    }
    public void showString()
    {
        System.out.println("orignal string is :"+orignal);
        System.out.println("Reverse string is : "+reverse);
    }
}
