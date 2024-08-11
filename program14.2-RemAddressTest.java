Program 14.2  Program to find address of the host whose domain name is known.

//RemAddressTest.java
import java.net.*;
class RemAddressTest
{
public static void main(String[] args)
{
try
{
InetAddress add = InetAddress.getByName("rediff.com");
System.out.println(add);
}
catch(Exception ex)
{
System.out.println("An error occurred when trying to get host address");
}
}
}
/*
Output
C:\java\bin\javabook>java RemAddressTest
rediff.com/23.52.40.72
*/
