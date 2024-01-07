//Creating FRAME using inheritance
package GUI_PACKAGE_Awt;
  
import java.awt.Color;
import java.awt.Frame;

 class MyFrame1 extends Frame{

    public MyFrame1() {
        setTitle("Prashant`s Frame");
        setBounds(200, 200, 400, 400);
        setBackground(Color.BLUE);
        setVisible(true);
        
        
    }    
}
class FrameEx4{
    public static void main(String[] args) {
        MyFrame1 mf=new MyFrame1();
    }
}
