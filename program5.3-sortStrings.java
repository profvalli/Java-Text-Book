import java.io.*;
public class sortStrings{
public static void main(String args[])
{
  int n=0;
  String ns;
  String name[];
  name=new String[20];
  try{
    DataInputStream in;
    in=new DataInputStream(System.in);
    System.out.println("enter value for n");
    System.out.flush();
    ns=in.readLine();
    n=Integer.parseInt(ns);
    System.out.println("enter the names");
    System.out.flush();
    for(int i=0;i<n;i++)
    {
      System.out.flush();
      name[i]=in.readLine();
    }
    for(int i=0;i<n-1;i++)
    for(int j=i+1;j<n;j++)
    {
    String t;
    if(name[i].compareTo(name[j])<0)
    {
      t=name[i];
      name[i]=name[j];
      name[j]=t;
    }
  }
  }
catch(Exception e)
{
  System.out.println("IO error");
  System.exit(1);
}
System.out.println("sorted names");
for(int i=0;i<n;i++)
{
  System.out.println(name[i]);
}
}
}
/* Output:
enter value for n
2
enter the names
program
java
sorted names
program
java
*/
