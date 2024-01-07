package ObjectOrientedProgram;

public class Emp1
{
        private int age;
        private String name;
        private int id;
        private static int nextId=1;

        public Emp1(int a, String s)
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
            System.out.println("Next Empoly will get id= " + nextId);
        }

        protected void finalize() {
            --nextId;
        }

}


