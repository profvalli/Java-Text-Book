Program 11.6 Program to implement ActionListener

//Save both windowAWT.java and demoFrame2.java in different files. Compile them and then run windowAWT class file.

//windowAWT.java

import java.awt.*;
import java.awt.event.*;
public class windowAWT implements ActionListener
{
Button b1,b2;
demoFrame w;
windowAWT()
{

Frame f1=new Frame();

b1=new Button("show");
b1.setBounds(100, 150, 200, 75);

f1.add(b1);

b1.addActionListener(this);
b1.addActionListener(this);
f1.add(b1);

b2=new Button("hide");
b2.setBounds(100,230,200,75); 
b2.addActionListener(this);

f1.add(b2);

w=new demoFrame2();
w.setSize(500,050);

f1.setSize(500, 500); 
f1.setLayout(null); 
f1.setVisible(true); 
}

public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1) w.setVisible(true);
if(e.getSource()==b2) w.setVisible(false);
}
// main method 
public static void main(String args[]) 
{ 
new windowAWT(); 
}

}
****************************************

//demoFrame2.java

import java.awt.*;
import java.awt.event.*;
import java.awt.GridLayout.*;
public class demoFrame2 implements ActionListener
{
TextField t;
Button c;
Frame f;
demoFrame2()
{
f=new Frame();
f.setLayout(new GridLayout(2,1));
t=new TextField(10);
f.add(t);
c=new Button("click here");
f.add(c);
c.setBounds(100, 150, 200, 75); 
t.setBounds(100,230,200,75);

//f.setSize(500, 500); 
f.setLayout(null); 
//f.setVisible(true);

c.addActionListener(this);
}
public void setSize(int a, int b)
{
this.f.setSize(a,b);
}
public void setVisible(boolean visible)
{
this.f.setVisible(visible);
}

public void actionPerformed(ActionEvent e)
{
if(e.getSource()==c) t.setText("clicked");
}


}
