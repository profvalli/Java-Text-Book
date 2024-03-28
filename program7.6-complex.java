//Program 7.6 Program to demonstrate constructor overloading. This program adds, subtracts, and multiplies complex numbers
//complex.java

import java.io.*;

public class complex{

float re,im;

public complex()

{

re=0;im=0;

}

public complex(float x, float y)

{

re=x;

im=y;

}

public complex(complex ob)

{

re=ob.re;

im=ob.im;

}

public void getnum()

{

Float fre=0f;

Float fin=0f;

try

{

DataInputStream in;

in=new DataInputStream(System.in);

System.out.println("enter the complex number");

String s=in.readLine();

fre=Float.parseFloat(s);

s=in.readLine();

fin=Float.parseFloat(s);
re=fre;
im=fin;


//re=fre.FloatValue();

//im=fin.FloatValue();

}

catch(Exception e)

{

System.out.println("I/O error"+e);

System.exit(1);

}

}

public complex add(complex ob)

{

complex c =new complex();

c.re=re+ob.re;

c.im=im+ob.im;

return c;

}

public complex sub(complex ob)

{

complex c =new complex();

c.re=re-ob.re;

c.im=im-ob.im;

return c;

}

public complex mul(complex ob)

{

complex c =new complex();

c.re=re*ob.re-im*ob.im;

c.im=im*ob.im+im*ob.re;

return c;

}

public void show()

{

if(im>0)

System.out.println(re+"+j"+im);

else

if(im<0)

{

float t=-1*im;

System.out.println(re+"-j"+t);

}

else

if(im==0)

System.out.println(re);

}

public static void main(String args[])

{

complex a = new complex();

complex b = new complex();

complex c = new complex();

complex d = new complex();

complex e = new complex();

a.getnum();

b.getnum();

c=a.add(b);

d=a.sub(b);

e=a.mul(b);

c.show();

d.show();

e.show();

}

}

/*
Output:
enter the complex number
2.3
1.2
enter the complex number
4.2
3.2
6.5+j4.4
-1.8999999-j2.0
5.8199987+j8.88
*/
