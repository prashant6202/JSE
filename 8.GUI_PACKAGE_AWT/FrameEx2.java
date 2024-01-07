
package GUI_PACKAGE_Awt;

import java.awt.Color;
import java.awt.Frame;


public class FrameEx2 {
    public static void main(String[] args) {
        Frame fr=new Frame();
        fr.setTitle("Prashant`s Frame");
        fr.setSize(400, 400);
        fr.setLocation(400, 400);
        fr.setBackground(Color.YELLOW);    // Color ak class  hai jiske pas predefind color hai oo bhi sb public static final
        fr.setVisible(true);
    }
}