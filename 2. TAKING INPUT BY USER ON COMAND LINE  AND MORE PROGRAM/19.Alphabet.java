 class Alphabet
{
   public static void main(String[]args)
   { 
      String ch=args[0];
      int a=ch.charAt(0);
      if(a>=65 && a<=97)
      System.out.println("it is alphabet");
      else if(a>=97 && a<=122)
     System.out.println("it is alphabet");
     else
     System.out.println("it is not alphabet");
   }
}