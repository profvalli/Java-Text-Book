

//Program 6.2. Implementing a Stack.

//stack.java

import java.io.*;

public class stackDemo

{

int a[]=new int[20];

int top;

public stackDemo()

{ top=0;}

public void push(int x)

{

if(top==20)

{

System.out.println("Stack overflow");

System.exit(1);

}

/* Output:

enter the number of elements to be inserted(<20)
5
enter the elements of stack
1
2
3
4
5
popping the element from stack
5
popping the element from stack
4
popping the element from stack
3
popping the element from stack
2
popping the element from stack
1


*/
else

{

top++;

a[top]=x;

}

}

public int pop()

{

int x=0;

if(top==0)

{

System.out.println("Stack empty");

System.exit(1);

}

else

{

x=a[top];

top--;

}

return x;

}

public boolean isempty()

{

if(top==0) return true;

else return false;

}

public int stacktop()

{

if(top==0) System.out.println("Stack empty");

return (a[top]);

}

public static void main(String args[])

{

stackDemo s;

int n,p;

s=new stackDemo();

try

{

DataInputStream in;

in=new DataInputStream(System.in);

System.out.println("enter the number of elements to be inserted(<20)");

String k=in.readLine();

n=Integer.parseInt(k);

System.out.println("enter the elements of stack");

for(int i=0;i<n;i++)

{

k=in.readLine();

p=Integer.parseInt(k);

s.push(p);

}

}

catch(Exception e)

{

System.out.println("I/O error"+e);

System.exit(1);

}

while(!s.isempty())
{
    System.out.println("popping the element from stack");

System.out.println(s.pop());
}
}
}

/* Output:

enter the number of elements to be inserted(<20)
5
enter the elements of stack
1
2
3
4
5
popping the element from stack
5
popping the element from stack
4
popping the element from stack
3
popping the element from stack
2
popping the element from stack
1


*/
