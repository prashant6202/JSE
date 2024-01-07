package ObjectOrientedProgram;

public class Student1
{
    private int roll;
    private char grade;
    private double per;
    public void setStudent()
    {
        roll=10;
        grade='A';
        per=99.99;
    }
    public void getStudent()
    {
        System.out.println(" Roll= "+roll);
        System.out.println("Grade= "+grade);
        System.out.println("Percentage= "+per);
    }
}

