Program 11.3 Construct UI that contains a choice box and text box such that the item selected in choice box is to be displayed in the text box.

//constructUI.java 
//importing awt class 
import java.awt.*; 
import java.awt.event.*; 
public class choiceAWT implements ItemListener { 
TextField t; Choice c;
// class constructor 
choiceAWT() { 

// creating a frame 
Frame f = new Frame(); 
Label l=new Label("SELECT CITY"); 
t=new TextField(); 

// creating a choice component 
c = new Choice(); 

// setting the bounds of choice menu 
c.setBounds(100, 100, 100, 75); 
t.setBounds(100,150,100,75); 
l.setBounds(100,50,100,75);

// adding items to the choice menu 
c.add("Hyderabad"); 
c.add("Guntur"); 
c.add("Vizag"); 
c.add("Vijayawada"); 
c.add("Tirupathi"); 

// adding choice menu to frame 
f.add(c); 
f.add(t); 
f.add(l); 

// setting size, layout and visibility of frame 
f.setSize(500, 500); 
f.setLayout(null); 
f.setVisible(true); 
c.addItemListener(this); 
}
public void itemStateChanged(ItemEvent e) { 
if(e.getItemSelectable()==c)
t.setText(c.getSelectedItem());
}

// main method 
public static void main(String args[]) 
{ 
new choiceAWT(); 
} 
}
