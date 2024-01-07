//click on button than activity
package GUI_PACKAGE_Awt;
  
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 class MyFrame4 extends Frame implements ActionListener{

    public MyFrame4() {
        setTitle("Prashant`s Frame");
        setBounds(200, 200, 400, 400);
        Button b1=new Button("Quit");
        Button b2=new Button("Change color");
        FlowLayout f1=new FlowLayout();
        setLayout(f1);
        add(b1);
        add(b2);
        setVisible(true);
        closeFrame cf=new closeFrame();
        b1.addActionListener(cf);
        b2.addActionListener(this);
    } 

    @Override
    public void actionPerformed(ActionEvent e) {
       setBackground(Color.yellow);
    }
}
class closeFrame implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
       System.exit(0);
    }

}
class FrameEx7{
    public static void main(String[] args) {
        MyFrame4 mf=new MyFrame4();
    }
}
