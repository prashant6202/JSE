/*Accepting char by System.in.read()
===========================================*/
class AcceptChar
{
    public static void main(String[]args)throws Exception
    {
        char ch;
         System.out.println("enter a character");
        ch=(char)System.in.read();
        System.out.println("you entered "+ch);
    }
}