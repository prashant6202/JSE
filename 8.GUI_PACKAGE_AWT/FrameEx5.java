//Creating multipale Frame
package GUI_PACKAGE_Awt;

import java.awt.Color;
import java.awt.Frame;



class MyFrame2 extends Frame {

    public MyFrame2(String t,Color c,int w,int h) {
        super(t);
        super.setBounds(200,200,w,h);
       super. setBackground(c);
        super.setVisible(true);
    }
    
}

public class FrameEx5 {
    public static void main(String[] args) {
         MyFrame2 mf1=new MyFrame2("Prashant`s Frame",Color.BLACK,300,300);
         MyFrame2 mf2=new MyFrame2("Prashant`s Frame",Color.red,300,300);
    }
}
