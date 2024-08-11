Program 12.4 Program for Tabbed panes

//Tabbedpanes.java

import java.awt.*;
import javax.swing.*;

public class Tpane extends JFrame {
public Tpane() {
setTitle("Tabbed Pane Example");
setSize(300, 200);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
init();
setVisible(true);
}
public void init() {
JTabbedPane jtp = new JTabbedPane();
jtp.addTab("First", new MyPanel1());
jtp.addTab("Second", new MyPanel2());
jtp.addTab("Third", new MyPanel3());
getContentPane().add(jtp);
}
public static void main(String[] args) {
SwingUtilities.invokeLater(new Runnable() {
@Override
public void run() {
new Tpane();
}
});
}
}
class MyPanel1 extends JPanel {
MyPanel1() {
JLabel l = new JLabel("This is first Pane");
add(l);
}
}
class MyPanel2 extends JPanel {
MyPanel2() {
JLabel l = new JLabel("This is second Pane");
add(l);
}
}
class MyPanel3 extends JPanel {
MyPanel3() {
JLabel l = new JLabel("This is third Pane");
add(l);
}
}
