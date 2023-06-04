package array;

import java.util.Scanner;

public class ArraySort
{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size= kb.nextInt();
        int[] arr = new int[size];
        for (int i=0;i< arr.length;i++)
        {
            System.out.print("enter the array element : ");
            arr[i]= kb.nextInt();
        }

        for (int i = 0; i < arr.length; i++)
        {
            for (int j=0;j< arr.length;j++)
            {
                if (arr[i]>arr[j])
                {
                   int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.print("The maximum value of given array is : ");
        for (int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }


}
