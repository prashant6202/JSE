// Using static keyword

package ObjectOrientedProgram;

public class Emp {
    private int age;
    private String name;
    private int id;
    private static int nextId=1;

    public Emp(int a, String s)
    {
        age=a;
        name=s;
        id=nextId++;                //value increment
    }
    public void show()
    {
        System.out.println("Age= "+age+",Name= "+name+",id= "+id);
    }
    public void showNextId()
    {
        System.out.println("Next Empoly will get id= "+nextId);
    }
}
