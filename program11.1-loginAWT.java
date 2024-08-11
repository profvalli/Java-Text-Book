Program 11.1 Program to demonstrate AWT and Frame

//loginAWT.java
import java.awt.*; 
class loginAWT {
loginAWT() {
Frame f = new Frame(); // create Frame
Label l1 = new Label("login name"); 
Label l2= new Label("Password");
TextField t1 = new TextField(); // create login TextField 
TextField t2= new TextField(); // Create password Textfield
Button b = new Button("Go"); // create a Button
// Set bounds for positioning l,b,t in f 
l1.setBounds(20, 80, 80, 30); 
l2.setBounds(20, 110,80,30);
t1.setBounds(100, 80, 80, 30); 
t2.setBounds(100,110,80,30);
b.setBounds(180, 100, 80, 30);
// add components to frame 
f.add(b); 
f.add(l1); 
f.add(t1); 
f.add(l2); 
f.add(t2);
// frame size and title 
f.setSize(400,300);
f.setTitle("login page"); 
f.setLayout(null); 
f.setVisible(true); 
}
// main method 
public static void main(String args[]) {
// creating instance of Frame class 
loginAWT login = new loginAWT();
}
}
