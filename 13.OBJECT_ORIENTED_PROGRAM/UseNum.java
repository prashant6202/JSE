package ObjectOrientedProgram;

public class UseNum
{
    public static void main(String[] args)
    {
        Num n1=new Num();
        Num n2=new Num();
        Num n3=new Num();
        n1.setNum(5,7);
        n2.setNum(10,11);
        System.out.println("before swaping..");
        n1.show();
        n2.show();
        n3.SwapNum(n1,n2);
        System.out.println("after swaping..");
        n1.show();
        n2.show();



    }
}
