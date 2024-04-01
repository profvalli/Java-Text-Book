//Program 11.1 Program to demonstrate Swing
//firstAWT.java
import java.awt.*;

import java.awt.event.*;

public class firstAWT

{
public static void main(String args[])
{


Frame f = new Frame("first AWT program"); 
f.setSize(300,300);
f.setVisible(true);

TextField t=new TextField();
t.setBounds(80,80,80,80);
f.add(t);
Button b=new Button("Click here");
b.setBounds(160,160,100,80);
f.add(b);
Label l=new Label("hi from AWT");
f.add(l);
b.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{

if(e.getSource()==b) t.setText("Button clicked");

}
}

);

}
}
