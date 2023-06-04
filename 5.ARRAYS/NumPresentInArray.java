package array;

import java.util.Scanner;

public class NumPresentInArray
{
    public static void main(String[] args)
    {
        Scanner kb=new Scanner(System.in);
        int []arr=new int[10];
        int i;
        for (i=0;i< arr.length;i++)
        {
            System.out.println("Enter the array element : ");
            arr[i]= kb.nextInt();
        }
        System.out.println("Enter a number : ");
        int n= kb.nextInt();
        for ( i=0;i< arr.length;i++)
        {
            if(arr[i]==n)
            {
                break;
            }
        }
        if(i==10)
            System.out.println("Number not found");
        else
            System.out.println("Number found on the position is "+(i+1));

    }
}
