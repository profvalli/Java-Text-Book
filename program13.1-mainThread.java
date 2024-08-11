Program 13.1 The Following program tries to suspend the program in each iteration of the loop through the currentThread.

//mainThread.java
import java.lang.*;
public class mainThread extends Thread
{
public static void main(String args[])
{
Thread t= Thread.currentThread();
System.out.println("Current thread is:" +t);
t.setName("My thread");
System.out.println("Current thread after renaming is:" +t);
for(int n=5;n>0;n--)
{
 System.out.println(n);
 try
 {
 Thread.sleep(1000);
 }

catch(InterruptedException ex)
 {
 System.out.println("Main thread Interrpted");
}
}
}
}

/* Output:

C:\java\bin\javabook>java mainThread

Current thread is:Thread[#1,main,5,main]

Current thread after renaming is:Thread[#1,My thread,5,main]

5

4

3

2

1

*/
