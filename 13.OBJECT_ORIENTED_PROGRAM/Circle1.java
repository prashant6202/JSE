/*Paramitrized method
===============================
 */
package ObjectOrientedProgram;

public class Circle1
{
    private  int radious;
    public void setRadious(int r)
    {
        radious=r;
    }
    public void calculateArea()
    {
        double ar;
        ar=Math.PI*Math.pow(radious,2);
        System.out.println("Area of circle is :"+ar);
    }
    public void calculatCircumference()
    {
        double circ;
        circ=2*Math.PI*radious;
        System.out.println("Circumference of circle is : "+circ);
    }
}
