/*CHEAK NUMBER POSITIVE OR NEGATIVE
==========================================*/
class PosNeg
{ 
  public static void main(String[]args)
  { 
     int n;
     n=Integer.parseInt(args[0]);
     if(n>0)
     System.out.println(n+" is POSITIVE number");
     else if(n<0)
     System.out.println(n+" is NEGATIVE number");
     else
     System.out.println(n+" is NEITHER POSITIVE NOR NEGATIVE");
   }
}