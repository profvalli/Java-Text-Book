Program 11.4.  Program to implement scroll list

//listAWT.java
import java.awt.*;
import java.awt.event.*;
public class listAWT implements ItemListener {
List l;
TextField t;

listAWT()
{

Frame f = new Frame();
Label lb=new Label("CLICK ON A BOOK");

t=new TextField();

l=new List();
l.setBounds(100, 150, 200, 75); 
t.setBounds(100,230,200,75); 
lb.setBounds(100,50,150,75);
l.add("Java Programming ");
l.add(" C Programming ");
l.add("C++ Programming ");
l.add("Windows Programming ");
l.add("Shell Programming ");
l.add(" Programming with VC++");
l.add(" Programming VB");


f.add(l);
f.add(t);
f.add(lb);

f.setSize(500, 500); 
f.setLayout(null); 
f.setVisible(true); 
l.addItemListener(this);

}

public void itemStateChanged(ItemEvent e)
{
if(e.getItemSelectable()==l)
t.setText(l.getSelectedItem());
}

// main method 
public static void main(String args[]) 
{ 
new listAWT(); 
} 

}
