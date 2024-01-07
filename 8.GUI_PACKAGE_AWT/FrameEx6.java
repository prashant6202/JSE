//Creating Button
package GUI_PACKAGE_Awt;
  
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 class MyFrame3 extends Frame{

    public MyFrame3() {
        setTitle("Prashant`s Frame");
        setBounds(200, 200, 400, 400);
        setBackground(Color.yellow);
        Button b1=new Button("Quit");
        Button b2=new Button("Change color");
        FlowLayout f1=new FlowLayout();
        setLayout(f1);
        add(b1);
        add(b2);
        setVisible(true);
    } 
}
class FrameEx6{
    public static void main(String[] args) {
        MyFrame3 mf=new MyFrame3();
    }
}
