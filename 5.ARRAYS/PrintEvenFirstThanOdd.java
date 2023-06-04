package array;

import java.util.Scanner;

public class PrintEvenFirstThanOdd
{
    public static void main(String[] args)
    {
        Scanner kb=new Scanner(System.in);
        System.out.print("Enter the size of element : ");
        int size= kb.nextInt();
        int[]arr=new int[size];

        for (int i=0;i< arr.length;i++)
        {
            System.out.print("Enter the array elements : ");
            arr[i]= kb.nextInt();
        }
        System.out.print("The order of output : ");
        for (int i=0;i< arr.length;i++)
        {
            if (arr[i]%2==0)
            {
                System.out.print(arr[i]+" ");
            }
        }
        for (int i=0;i< arr.length;i++)
        {
            if (arr[i]%2!=0)
            {
                System.out.print(arr[i]+" ");
            }
        }

    }
}
