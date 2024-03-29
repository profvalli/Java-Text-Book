//Program 8.5 Program to define a super class student, which will be used in the next program 8.7. Just compile this program. Do not execute.
//istudent.java
import java.io.*;
import java.util.*;
public class istudent
   {
       String name;
       int regdno;
   
public istudent()
{
    name=" ";
    regdno=0;
}

public void getdata()
{
    try{
        DataInputStream in=new DataInputStream(System.in);
        System.out.println("enter student name");
        name=in.readLine();
        System.out.println("enter register number");
        String k=in.readLine();
        regdno=Integer.parseInt(k);
    }
    catch(Exception e)
    {
        System.out.println("I/O error"+e);
        System.exit(1);
    }
    }
}
