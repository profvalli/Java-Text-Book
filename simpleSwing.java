Program 12.1 Using Swing to display Label and Button in a Grid.

//simpleSwing.java

import javax.swing.*;
import java.awt.*;

public class simpleSwing{
public static void main(String[] args) {
JFrame f=new JFrame();
JLabel l=new JLabel("This is Label");
JButton b=new JButton("Click on this Button");
f.add(l);
f.add(b);
f.setSize(500,500);
f.setLayout(new GridLayout());
f.setVisible(true);
}
}
