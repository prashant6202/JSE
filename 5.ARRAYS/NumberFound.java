package array;

import java.util.Scanner;

public class NumberFound
{
    public static void main(String[] args)
    {
        Scanner kb=new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int size= kb.nextInt();
        int[]arr=new int[size];
        for (int i=0;i< arr.length;i++)
        {
            System.out.print("Enter the array element : ");
            arr[i]= kb.nextInt();
        }
        System.out.print("Enter the element to found : ");
        int element= kb.nextInt();
        int i;
        for ( i=0;i< arr.length;i++)
        {
            if (element==arr[i])
            {
                System.out.println("Found !");
                break;
            }
        }
        if (i== arr.length)
        {
            System.out.println("NOt Found !");
        }
    }
}
