package ObjectOrientedProgram;

public class Box
{
    private int l, b,h;
        public Box()
        {
            l = b = h = 0;
        }
        public Box(int s)
        {
            l=b=h=s;
        }
        public Box(int i,int j,int k)
        {
            l=i;
            b=j;
            h=k;
        }
        public Box(Box p)
        {
          //  p=new Box();       //if we will use create a object of p than p is pointing to new objet ,thats reasion p is not pointing to actual objcet and any changes in p than no effect on origanal object
            l= p.l;
            b= p.b;
            h= p.h;
        }
        public void show()
        {
            System.out.println("l= "+l+",b= "+b+",h= "+h);
        }


}
