Program 12.3 Program to demonstrate the use of combo box

//Combo.java

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class All extends JFrame implements ItemListener, ActionListener {
JTextField jtf;
JCheckBox jcb;
JComboBox<String> jcob;
public All() {
setTitle("All");
setSize(400, 300);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLayout(new FlowLayout());
JPanel p1 = new JPanel();
JPanel p2 = new JPanel();
JPanel p3 = new JPanel();
JPanel p4 = new JPanel();
jtf = new JTextField(15);
p1.add(jtf);
jcb = new JCheckBox("CheckBox");
jcb.addItemListener(this);
p2.add(jcb);
ButtonGroup bg = new ButtonGroup();
JRadioButton b1 = new JRadioButton("Radio 1");
JRadioButton b2 = new JRadioButton("Radio 2");
b1.addActionListener(this);
b2.addActionListener(this);
bg.add(b1);
bg.add(b2);
p3.add(b1);
p3.add(b2);
jcob = new JComboBox<>();
jcob.addItemListener(this);
jcob.addItem("Sunil");
jcob.addItem("Amar");
jcob.addItem("Badri");
p4.add(jcob);
add(p1);
add(p2);
add(p3);
add(p4);
setVisible(true);
}
public void actionPerformed(ActionEvent ae) {
jtf.setText(ae.getActionCommand());
}
public void itemStateChanged(ItemEvent ie) {
if (ie.getSource() == jcb) {
jtf.setText(jcb.getText());
} else {
jtf.setText((String) ie.getItem());
}
}
public static void main(String[] args) {
SwingUtilities.invokeLater(new Runnable() {
@Override
public void run() {
new All();
}
});
}
}
