/*Improving the circle class using paramatrized constructor
=================================================================*/
package ObjectOrientedProgram;

public class Circle3
{
    private int radious;

    public Circle3(int r) {
        radious = r;
    }

    public double calculateArea() {
        double ar;
        ar = Math.PI * Math.pow(radious, 2);
        return ar;
    }

    public double calculateCircumference() {
        double circ;
        circ = 2 * Math.PI * radious;
        return circ;
    }

}
