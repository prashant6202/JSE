/*Returning value from method
=================================
 */

package ObjectOrientedProgram;

public class Circle2
{
    private int radious;
    public void setRadious(int r)
    {
        radious=r;
    }
    public double calculateArea()
    {
        double ar;
        ar=Math.PI*Math.pow(radious,2);
        return ar;
    }
    public double calculateCircumference()
    {
        double circ;
        circ=2*Math.PI*radious;
        return circ;
    }
}
