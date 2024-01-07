package ObjectOrientedProgram;

public class ParamittrizedStudent
{
    private int roll;
    private String name;
    private double per;

    public void setStudent(int r , String str, double p)
    {
        roll=r;
        name =str;
        per=p;
    }
    public void getStudent()
    {
        System.out.println("roll= "+roll);
        System.out.println("Name= "+name);
        System.out.println("per= "+per);
    }
}
