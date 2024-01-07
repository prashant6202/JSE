/*method overloading

 */

package ObjectOrientedProgram;

public class Figure
{
    private double side;
    private double legth;
    private double width;
    private double radious;
    public double area(float s)
    {
            side=s;
         return Math.pow(s,2);
    }
    public double area(double l,double w)
    {
        legth=l;
        width=w;
        return legth*width;
    }
    public double area(double r)
    {
        radious=r;
        return Math.PI*Math.pow(radious,2);
    }
}
