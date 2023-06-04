/*taking month name maximum letter are 3 and CASE SENSITIVE or First letter is BIG. taking month form the user using command line argument...
v.v.i point that by the compiler string comparison is done by "equals()" method
not "equalIgnoreCase()".
=============================================================================*/
class Season
{
    public static void main(String [] args)
    {
      switch(args[0])
      { 
          case "Nov": case "Dec": case "Jan": case "Feb":
          System.out.println(" WINTER SEASION ");
          break;
 
          case "Mar": case "Apr": case "May": case "Jun":
          System.out.println(" SUMMER SEASION ");
          break;
 
          case "Jul": case "Aug": case "Sep": case "Oct":
          System.out.println(" RAINY SEASION ");
          break;
   
          default:
          System.out.println(" ......WORNG MONTH.....");
       }
    }
}