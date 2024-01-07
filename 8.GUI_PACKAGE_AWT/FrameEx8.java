
package GUI_PACKAGE_Awt;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame5 extends Frame implements ActionListener{
     Button b1,b2;
    public MyFrame5() {
       super.setTitle("Prashant`s Frame");
       super.setBounds(200, 200, 400, 400);
        b1=new Button("QUIT");
        b2=new Button("CHANGE COLOR");
       add(b1);
       add(b2);
       super.setVisible(true);
      FlowLayout f1=new FlowLayout();
      setLayout(f1);
      b1.addActionListener(this);
      b2.addActionListener(this);
      
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getSource()==b1){
        System.exit(0);
    } 
      else{
          super.setBackground(Color.yellow);
            }
    }
}

public class FrameEx8 {
    public static void main(String[] args) {
        MyFrame5 mf=new MyFrame5();
    }
}
