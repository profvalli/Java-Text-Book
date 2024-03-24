//matrix.java
import java.io.*;
public class matrix
{
 
 int a[][] = new int[10][10];

int m,n;

public matrix()

{

m=0;n=0;

}

public void getmat()

{

try

{

DataInputStream in;

in =new DataInputStream(System.in);

System.out.println("enter the order of the matrix");

String s=in.readLine();

m=Integer.parseInt(s);

s=in.readLine();

n=Integer.parseInt(s);

System.out.println("enter the elements of the matrix");

for(int i=0;i<m;i++)

for(int j=0;j<n;j++)

{

s=in.readLine();

a[i][j]=Integer.parseInt(s);

}

}

catch(Exception e)

{

System.out.println("I/O error"+e);

System.exit(1);

}

}

public matrix add(matrix ob)

{

matrix c = new matrix();

c.m=m;c.n=n;

for(int i=0;i<m;i++)

for(int j=0;j<n;j++)

c.a[i][j]=a[i][j]+ob.a[i][j];

return c;

}

public matrix sub(matrix ob)

{

matrix c = new matrix();

c.m=m;c.n=n;

for(int i=0;i<m;i++)

for(int j=0;j<n;j++)

c.a[i][j]=a[i][j]-ob.a[i][j];

return c;

}

public void showmat()

{

for(int i=0;i<m;i++)

{

for(int j=0;j<n;j++)

System.out.println(a[i][j]+"");

System.out.println("");

}

}

public static void main(String args[])

{

matrix a = new matrix();

matrix b = new matrix();

matrix c = new matrix();

matrix d = new matrix();

a.getmat();

b.getmat();

c=a.add(b);

d=a.sub(b);

c.showmat();

d.showmat();

}

}

/*Output:

enter the order of the matrix
2
2
enter the elements of the matrix
3
3
3
3
enter the order of the matrix
2
2
enter the elements of the matrix
1
1
1
1
4
4

4
4

2
2

2
2


*/
