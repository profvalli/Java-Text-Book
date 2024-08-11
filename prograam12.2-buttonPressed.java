Program 12.2  Program to display the number of times a button is pressed using ActionListener

//buttonPressed.java

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class buttonPressed implements ActionListener{

JTextField t;JButton b;int i;

public buttonPressed() {
JFrame f=new JFrame();
JLabel l=new JLabel("This is Label");
t=new JTextField();
b=new JButton("Click on this Button");
f.add(l);
f.add(b);
f.add(t);
b.addActionListener(this);
f.setSize(500,500);
f.setLayout(new GridLayout());
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

public void actionPerformed(ActionEvent ae)
{
i++;
t.setText("Button clicked "+i+" times");
}

public static void main(String args[]) {
buttonPressed bp = new buttonPressed();
}
}
