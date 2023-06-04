package array;

import java.util.Scanner;

public class MaxValueArray
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = kb.nextInt();
        int[] arr = new int[n];
        int max=0,min;
        System.out.print("Enter th array element : ");
        arr[0]= kb.nextInt();
        min=max=arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            arr[i] = kb.nextInt();
            if (max<arr[i])
            {
                max=arr[i];
            } else if (min>arr[i])
            {
              min=arr[i];
            }
        }
        System.out.println("max is "+max);
        System.out.println("min is "+min);
    }
}

