
package GUI_PACKAGE_Awt;

import java.awt.Color;
import java.awt.Frame;
import java.util.Date;


public class FrameEx3 {
    public static void main(String[] args) {
        Frame f= new Frame();
//        Date today=new Date();
//        f.setTitle(today.toString());
          f.setTitle( new Date().toString());
        f.setBounds(200,200,400,400);
        f.setBackground(Color.yellow);
        f.setVisible(true);
    }
    
    
}
