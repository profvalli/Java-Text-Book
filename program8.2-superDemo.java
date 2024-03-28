Program 8.2 Program to demonstrate super and child classes 
//superDemo.java

class candidate
{
int id;
String name;
candidate (int id, String name)
  {
this.id = id;
this.name = name;
} 
} 

class student extends candidate
{
int marks;
student (int id, String name, int marks)
  {
   super (id, name); //parent or super class constructor  
   this.marks = marks;
} 

void display ()
  {
   System.out.println (id + " " + name + " " + marks)
} 
} 

class superDemo
{
public static void main (String[]args)
  {
   student stud = new student (1001, "Ramu", 97);
   stud.display ();
}}

/* Output:

1001 Ramu 97

*/
