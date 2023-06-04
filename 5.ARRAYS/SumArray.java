package array;

import java.util.Scanner;

public class SumArray
{
    public static void main(String[] args)
    {
        Scanner kb=new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n= kb.nextInt();
        int []arr;
        arr=new int[n];
        System.out.print("Enter the array element : ");
        int sum=0;
        for (int i=0;i< arr.length;i++)
        {
            arr[i]= kb.nextInt();
            sum=sum+arr[i];

        }
        System.out.println("The sum of given array is : "+sum);

    }
}
