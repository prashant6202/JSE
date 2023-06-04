/*CHEAK NUMBER IS  EVEN OR ODD
=========================================*/
class EvenOdd
{
    public static void main(String[]args)
    {  
       int n;
       n=Integer.parseInt(args[0]);
       if(n%2==0)
       System.out.println(n+" is EVEN number");
       else
       System.out.println(n+" is ODD number");
     }
}  