package ObjectOrientedProgram;

import java.util.EnumMap;

public class UseEmp {
    public static void main(String[] args)
    {
       Emp e=new Emp(21,"rahul");
       Emp f=new Emp(33,"elvish");
       Emp g=new Emp(44,"sachin");
       e.show();
       f.show();
       g.show();
       e.showNextId();
        f.showNextId();
        g.showNextId();
    }
}
