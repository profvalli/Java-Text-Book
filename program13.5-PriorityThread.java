Program 13.5. Program to demonstrate the thread priority

//PriorityThread.java
import java.lang.*;
class PriorityThread implements Runnable
{
private volatile boolean running=true;
Thread t;
int clicks=0;
PriorityThread(int level)
{
t=new Thread(this);
t.setPriority(level);
t.start();
}
public void run()
{
while(running)
clicks++;
}
public void stop()
{
running=false;
}

public static void main(String args[])
{
PriorityThread p1=new PriorityThread(2);
PriorityThread p2=new PriorityThread(8);
try
{
Thread.sleep(2000);
}
catch(InterruptedException iexcp)
{
System.out.println("Main thread interrupted");
}
p1.stop();
p2.stop();
System.out.println("Thread with priority 2 clicked:"+p1.clicks);
System.out.println("Thread with priority 8 clicked:"+p2.clicks);
}
}

/*

Output:

C:\java\bin\javabook>java PriorityThread

Thread with priority 2 clicked:1229991824

Thread with priority 8 clicked:1226609637

*/
