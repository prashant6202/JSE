//acceting double from user by command line argument
//==========================================================================================
class AddDouble
{ 
 public static void main(String[]args)
 { 
    
   double a,b,c;
   a=Double.parseDouble(args[0]);
   b=Double.parseDouble(args[1]);
   c=a+b;
System.out.println("the first number is "+a);
System.out.println("the second number is "+b);
System.out.println("their sum is "+c);
 }
}