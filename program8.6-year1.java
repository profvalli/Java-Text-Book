//Program 8.6. Program that inherits from istudent class defined above. Compile the above program 8.5 and run this program.
//year1.java

import java.io.*;
import java.util.*;
public class year1 extends istudent
{
    int a[]=new int[10];
    float per;
    public year1()
    {
        super();
        per=0;
    }
    
public void getdata(int n)
{
    int sum1=0,x=0;
    getdata();
    try{
        DataInputStream in;
        in=new DataInputStream(System.in);
        System.out.println("enter the marks");
        sum1=0;
        String k;
        for(int i=0;i<n;i++)
        {
            k=in.readLine();
            x=Integer.parseInt(k);
            a[i]=x;
            sum1=sum1+a[i];
        }
        per=(float) (sum1/n);
    }
    catch(Exception e)
    {
        System.out.println("I/O error"+e);
        System.exit(1);
    }
}
public static void main(String args[])
{
    int m=0,n=0;
    year1 first[]=new year1[10];
    try
    {
        DataInputStream in;
        in=new DataInputStream(System.in);
        System.out.println("enter the number of subjects");
        String s=in.readLine();
        n=Integer.parseInt(s);
        System.out.println("enter the number of students");
        s=in.readLine();
        m=Integer.parseInt(s);
    }
    catch(Exception e)
    {
        System.out.println("I/O error"+e);
        System.exit(1);
    }
    for(int i=0;i<m;i++)
    {
    first[i]=new year1();
    first[i].getdata(n);
    }

  for(int i=0;i<m;i++)
   System.out.println(first[i].name+" "+first[i].regdno+" "+first[i].per);
}
}

/* 
Output:
enter the number of subjects
5
enter the number of students
4
enter student name
Amar
enter register number
10
enter the marks
70
78
67
80
90
enter student name
Sunil
enter register number
11
enter the marks
71
69
75
56
89
enter student name
Badri
enter register number
12
enter the marks
72
70
67
59
92
enter student name
Chand
enter register number
14
enter the marks
70
71
89
56
78
Amar 10  77.0
Sunil 11 72.0
Badri 12 72.0
Chand 14 72.0
*/
