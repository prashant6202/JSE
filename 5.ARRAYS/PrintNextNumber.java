package array;

import java.util.Scanner;

public class PrintNextNumber
{
    public static void main(String[] args)
    {
        Scanner kb=new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int size= kb.nextInt();
        int[]arr=new int[size];
        for (int i=0;i< arr.length;i++)
        {
            System.out.print("Enter the array elements : ");
            arr[i]= kb.nextInt();
            arr[i]=arr[i]+1;
        }
        System.out.print("The order of output : ");
        for (int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
