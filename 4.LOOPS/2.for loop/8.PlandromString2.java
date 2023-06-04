import java.util.Scanner;

class PlandromString
{
    public static void main(String[] args)
    {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str=kb.next();
       int strLength=str.length();
       int left,right;
        for ( left=0,right=(strLength-1);left<=right;left++,right--)
        {
           if (str.charAt(left)!=str.charAt(right))
           {
              break;
           }
        }
        if (str.charAt(left)!=str.charAt(right))
        {
            System.out.println("it not palandrom");
        }
        else
            System.out.println("it is palandrom");

    }

}

