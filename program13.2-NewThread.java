Program 13.2 Program to create new thread using Runnable interface

//NewThread.java
class NewThread implements Runnable
{
NewThread()
{
}
public static void main(String args[])
{
NewThread n=new NewThread();
Thread t =new Thread(n);
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
