package ObjectOrientedProgram;

public class Num
{
    private int a,b;
    public void setNum(int i,int j)
    {
        a=i;
        b=j;
    }
    public void SwapNum(Num P,Num Q)
    {
        int temp1,temp2;
        temp1=P.a;
        temp2=P.b;
        P.a= Q.a;
        P.b= Q.b;
        Q.a=temp1;
        Q.b=temp2;
    }
    public void show()
    {
        System.out.println("a= "+a+",b= "+b);
    }

}
