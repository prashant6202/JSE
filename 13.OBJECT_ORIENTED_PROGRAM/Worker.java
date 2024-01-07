package ObjectOrientedProgram;

public class Worker
{
    private int hw;
    private double payRate;
    public void setData(int hour,double salary)
    {
        hw=hour;
        payRate=salary;
    }
    public double getSalary()
    {
        double sal;
        if (hw<=40)
        {
            sal=hw*payRate;
        }
        else
        {
            sal=((hw-40)*2*payRate + 40*payRate);
        }
        return sal;
    }
}
