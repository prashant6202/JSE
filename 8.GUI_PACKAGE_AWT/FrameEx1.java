
package GUI_PACKAGE_Awt;

import java.awt.Color;
import java.awt.Frame;

public class FrameEx1 {
    public static void main(String[] args) {
        Frame fr=new Frame();                 //  frame bnga pr dikhega nhi
        fr.setTitle("Prashant`s Frame");       //  frame ka title set kiya hu
        fr.setSize(500, 500);                 //  frame ka size kita hoga 
        fr.setLocation(400, 400);             //  frame screen pr kis location pr dikhega 
      //  Color c=new Color(10,20,30);
       //  fr.setBackground(c);   
       fr.setVisible(true);                  // es line se Frame dikhne lg jayega
       
    }
}
