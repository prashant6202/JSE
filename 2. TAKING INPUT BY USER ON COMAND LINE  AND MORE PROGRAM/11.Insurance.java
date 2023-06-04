//insurance
 
class Insurance
{
    public static void main(String[]args)
    {
      int age;
      String gender,status;
      age=Integer.parseInt(args[0]);
      gender=args[1];
      status=args[2];
     if(status.equalsIgnoreCase("Married"))
     System.out.println("INSURANCE IS GIVEN");

     else if(gender.equalsIgnoreCase("Male") && age>30)
     System.out.println("INSURANCE IS GIVEN");
    
     else if(gender.equalsIgnoreCase("Female") && age>25)
     System.out.println("INSURANCE IS GIVEN");
    
     else
     System.out.println("INSURANCE IS NOT GIVEN");
   }
}