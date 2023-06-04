package array;

import java.util.Scanner;

public class ArrayEx1 {
    public static void main(String[]args)
    {
        Scanner kb=new Scanner(System.in);
        int n,i,sum=0;
        System.out.println("Enter size of an array:");
        n=kb.nextInt();
        int []arr;
        arr=new int[n];
        for (i=0;i<n;i++)
        {
            System.out.println("Enter a number");
            arr[i]=kb.nextInt();
        }
        System.out.println("Numbers are:");
        for (i=0;i<n;i++)
        {
            System.out.println(arr[i]);
            sum=sum+arr[i];
        }
        System.out.println("Their SUM is "+sum);
        System.out.println("Their AVERAGE is "+(double)sum/n);
    }
}
