package array;

import java.util.Scanner;

public class JaggedSalesman
{
    public static void main(String[] args)
    {

        Scanner kb = new Scanner(System.in);
        System.out.println("How many salesmen : ");
      int salesMen = kb.nextInt();
        int[][] arr = new int[salesMen][];
        double avgOfSalesMan[] = new double[salesMen];
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print("Enter number of sale for salesman " + (i + 1) + ": ");
           int numOfSale = kb.nextInt();
            arr[i] = new int[numOfSale];
            System.out.println("Enter sale value:");
            int sum=0;
            for (int j = 0; j < arr[i].length; j++)
            {
                arr[i][j] = kb.nextInt();
                sum = sum + arr[i][j];

            }
            avgOfSalesMan[i] = (double) sum /arr[i].length;
        }
        double bestSalesManAvg = avgOfSalesMan[0];
        int bestSalesMen = 0;
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println("Avg sale of salesman " + (i + 1) + " : " + avgOfSalesMan[i]);
            if (avgOfSalesMan[i] > bestSalesManAvg)
            {
                bestSalesMen = i + 1;
            }
        }
        System.out.println("BEST SALESMAN IS : " + bestSalesMen);
    }
}
