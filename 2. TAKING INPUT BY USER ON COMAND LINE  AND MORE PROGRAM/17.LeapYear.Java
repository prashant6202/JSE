class LeapYear
{
  public static void main(String [] args)
  {
      int year;
      year=Integer.parseInt(args[0]);
      if((year%400==0) || (year%4==0) && (year%100!=0))
      System.out.println("IT IS LEAP YEAR");
      else
      System.out.println("IT IS NOT LEAP YEAR");
  }
}
      