Program 13.4. Program to demonstrate join() and create multiple threads

//NewThreads.java

class NewThreads implements Runnable

{

String str;

Thread t;

NewThreads(String name)

{

str=name;

t=new Thread(this,name);

System.out.println("New thread created :"+t);

t.start();

}




public static void main(String args[])

{

NewThreads n1 = new NewThreads("first");

NewThreads n2 = new NewThreads("second");

NewThreads n3 = new NewThreads("Third");

try

{

n1.t.join();

n2.t.join();

n3.t.join();

}




catch(InterruptedException excep)

{

 System.out.println(" Main thread interrupted ");

}

System.out.println("Thread one is alive :"+n1.t.isAlive());

System.out.println("Thread two is alive :"+n2.t.isAlive());

System.out.println("Thread three is alive :"+n3.t.isAlive());

}




public void run()

{

for(int i=3; i>=1;i--)

{

System.out.println(str +":"+i);

}

}

}




/* Output:

C:\java\bin\javabook>java NewThreads

New thread created :Thread[#29,first,5,main]

New thread created :Thread[#30,second,5,main]

New thread created :Thread[#31,Third,5,main]

Third:3

Third:2

second:3

second:2

second:1

first:3

Third:1

first:2

first:1

Thread one is alive :false

Thread two is alive :false

Thread three is alive :false

*/
