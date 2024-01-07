//increment and decrement assignment
package GUI_PACKAGE_Awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame7 extends Frame implements ActionListener{
    Button b1,b2,b3,b4;
     int x=0;
    public MyFrame7() {  
        super.setTitle(String.valueOf(x));
        super.setBounds(200,200,400,400);
        super.setVisible(true);
        b1=new Button("Change BackGround Color");
        b2=new Button("INCREMENT");
        b3=new Button("DECREMENT");
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
        super.setBackground(Color.yellow);
      }
      else if(e.getSource()==b2){
      x++;
      }
      else if(e.getSource()==b3){
         x--;
      }
      else{
      System.exit(0);
      }
       super.setTitle(String.valueOf(x));           
    }

}
public class FrameEx10 {
    public static void main(String[] args) {
        MyFrame7 mf=new MyFrame7();
    }
}
