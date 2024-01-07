package ObjectOrientedProgram;

public class UseEmp1
{
    public static void main(String[] args)
    {
        Emp e=new Emp(21,"rahul");
        Emp f=new Emp(33,"elvish");
        Emp g=new Emp(44,"sachin");
        e.show();
        f.show();
        g.show();
        e.showNextId();
        {
            Emp h=new Emp(24,"panakj");
            Emp k=new Emp(55,"Ram");
            h.show();
            k.show();
            e.showNextId();
            h=k=null;
            System.gc();
            System .runFinalization();
        }
        e.showNextId();

    }
}
