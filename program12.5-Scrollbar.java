Program 12.5. Program to demonstrate Scroll Bars

//Scrollbar.java

import java.awt.*;
import javax.swing.*;
public class Scroll extends JFrame {
public Scroll() {
setTitle("Scroll Pane Example");
setSize(300, 200);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
init();
setVisible(true);
}  
public void init() {
Container cp = getContentPane();
cp.setLayout(new BorderLayout()); // Use BorderLayout to place JScrollPane in the center
JPanel jp = new JPanel();
jp.setLayout(new GridLayout(10, 10)); // Use GridLayout for buttons
int b = 0;
for (int i = 0; i < 10; i++) {
for (int j = 0; j < 10; j++) {
jp.add(new JButton("Button " + b));
b++;
}
}
int v = JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED;
int h = JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED;
JScrollPane jsp = new JScrollPane(jp, v, h);
cp.add(jsp, BorderLayout.CENTER);
}
public static void main(String[] args) {
SwingUtilities.invokeLater(new Runnable() {
@Override
public void run() {
new Scroll();
}
});
}
}
