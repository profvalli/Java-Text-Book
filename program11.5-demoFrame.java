Program 11.5 Frame Layout demonstration

//demoFrame.java

import java.awt.*;
import java.awt.event.*;
import java.awt.GridLayout.*;
public class demoFrame implements ActionListener
{
TextField t;
Button c;
demoFrame()
{
Frame f=new Frame();
f.setLayout(new GridLayout(2,1));
t=new TextField(10);
f.add(t);
c=new Button("click here");
f.add(c);
c.setBounds(100, 150, 200, 75); 
t.setBounds(100,230,200,75);

f.setSize(500, 500); 
f.setLayout(null); 
f.setVisible(true);

c.addActionListener(this);
}

public void actionPerformed(ActionEvent e)
{
if(e.getSource()==c) t.setText("clicked");
}

// main method 
public static void main(String args[]) 
{ 
new demoFrame(); 
}


}
