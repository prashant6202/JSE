
package GUI_PACKAGE_Awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame6 extends Frame implements ActionListener{
    Button b1,b2,b3,b4;
    public MyFrame6() {
        super.setTitle("Prashant`s Frame");
        super.setBounds(200,200,400,400);
        super.setVisible(true);
        b1=new Button("RED");
        b2=new Button("GREEN");
        b3=new Button("BLUE");
        b4=new Button("QUIT");
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        FlowLayout f1=new FlowLayout();
        super.setLayout(f1);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
             
        
    }
     @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getSource()==b1){
      super.setBackground(Color.RED);
      }
      else if(e.getSource()==b2){
      super.setBackground(Color.GREEN);
      }
      else if(e.getSource()==b3){
      super.setBackground(Color.BLUE);
      }
      else{
       System.exit(0);
      }
    }

}
public class FrameEx9 {
    public static void main(String[] args) {
        MyFrame6 mf=new MyFrame6();
    }
}
