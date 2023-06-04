package array;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args)
    {
         int [][]arr=new int[3][4];
        Scanner kb = new Scanner(System.in);
        int i=0,j=0,sum=0;
        for (i=0;i< arr.length;i++)
        {
            for (j=0;j<arr[i].length;j++)
            {
                System.out.println("enter a number");
                arr[i][j]=kb.nextInt();
            }
        }
        for (i=0;i<arr.length;i++)
        {
            for (j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
               sum=sum+arr[i][j];
            }
            System.out.println();
        }
        System.out.println("their sum is "+sum);
        System.out.println("their average is "+(double)sum/(i*j));
    }
}
