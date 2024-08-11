Program 13.3 Program to override the run() method using extends Thread

//NewThread1.java
class NewThread1 extends Thread
{
NewThread1()
{
}
public static void main(String rgs[])
{
NewThread1 n = new NewThread1();
Thread t = new Thread(n);
System.out.println("created new thread");
t.start();
System.out.println("Started new thread");
}

public void run()
{
System.out.println("This is a thread");
}
}

/*

Output:

created new thread

Started new thread

This is a thread

*/
