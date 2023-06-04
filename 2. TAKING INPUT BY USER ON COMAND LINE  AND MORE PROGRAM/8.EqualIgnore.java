/*4. bollean equalsIgnoreCase(String): it is case insensetive comparison
=============================================================================*/
class EqualsIgnore
{
    public static void main(String[]args)
    { 
       String city1=new String("Bhopal");
       String city2=new String("Bhopal");
       String city3=new String("bhopal");
       String city4=new String("bhojpal");
    
     System.out.println(city1);
     System.out.println(city2);
     System.out.println(city3);
     System.out.println(city4);

     System.out.println(city1.equalsIgnoreCase(city2));
     System.out.println(city1.equalsIgnoreCase(city3));
     System.out.println(city3.equalsIgnoreCase(city4));
    }
}