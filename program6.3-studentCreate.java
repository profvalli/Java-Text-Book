//studCreate.java

class student{

int rollno;

float marks1,marks2;

float total()

{

return(marks1+marks2);

}

}

class studentCreate{

public static void main(String args[])

{

float totalmarks;

//one student with rollno=25, marks=81, marks2=85 is created

student student1=new student();

student1.rollno=25;

student1.marks1=81;

student1.marks2=85;

//second student with rollno=26, marks=80. marks2=95 is created

student student2=new student();

student2.rollno=26;

student2.marks1=80;

student2.marks2=95;

//calculate marks of student1 by calling total() of student class

totalmarks=student1.total();

System.out.println("total marks="+ totalmarks);

//claculate marks of student2 by calling total() of student class

totalmarks=student2.total();

System.out.println("total marks="+totalmarks);

}

}

/*Output:
total marks=166.0
total marks=175.0
*/
