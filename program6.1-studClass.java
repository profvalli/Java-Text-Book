//studClass.java
class student
{
  int rollno;
  float marks1, marks2;
}
class studClass{
public static void main(String args[])
{
  student student1=new student();
  student student2=new student();
  float total;
  student1.marks1=82;
  student2.marks2=79;
  total=student1.marks1+student2.marks2;
  System.out.println("total marks="+total);
}
}
//Output:
total marks=161.0
